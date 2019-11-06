/**
 * 
 */
package mx.movistar.col.lead.service.search;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.IndexWriterHelper;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.search.filter.BooleanFilter;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import mx.movistar.col.lead.model.Lead;
import mx.movistar.col.lead.service.LeadLocalService;

/**
 * @author hectorsv
 *
 */
@Component(
		immediate = true, 
		service = Indexer.class
	)
public class LeadIndexer extends BaseIndexer<Lead> {
	
	public LeadIndexer() {

		setDefaultSelectedFieldNames(
			Field.COMPANY_ID, Field.ENTRY_CLASS_NAME, Field.ENTRY_CLASS_PK,
			Field.UID, Field.DESCRIPTION);
		setDefaultSelectedLocalizedFieldNames(Field.TITLE);
		setFilterSearch(true);
		setPermissionAware(true);
	}
	
	@Override
	public String getClassName() {

		return CLASS_NAME;
	}

	@Override
	public boolean hasPermission(
		PermissionChecker permissionChecker, String entryClassName,
		long entryClassPK, String actionId)
		throws Exception {
		
		Lead Lead =
			_leadLocalService.getLead(entryClassPK);
		return permissionChecker.hasPermission(
			Lead.getGroupId(), Lead.class.getName(),
			Lead.getLeadId(), ActionKeys.VIEW);
	}
	
	@Override
	public boolean isVisible(long classPK, int status) throws Exception {
		Lead entry = _leadLocalService.getLead(classPK);

		return isVisible(entry.getStatus(), status);
	}


	@Override
	public void postProcessContextBooleanFilter(
		BooleanFilter contextBooleanFilter, SearchContext searchContext)
		throws Exception {
		
		addStatus(contextBooleanFilter, searchContext);
	}

	@Override
	protected void doDelete(Lead Lead)
		throws Exception {

		deleteDocument(Lead.getCompanyId(), Lead.getLeadId());
	}

	 @Override
	    public void postProcessSearchQuery(
	        BooleanQuery searchQuery, BooleanFilter fullQueryBooleanFilter,
	        SearchContext searchContext)
	        throws Exception {

	        addSearchLocalizedTerm(searchQuery, searchContext, Field.TITLE, false);
	        addSearchTerm(searchQuery, searchContext, Field.DESCRIPTION, false);
	    }
	
	
	@Override
	protected Document doGetDocument(Lead Lead)
		throws Exception {

		Document document = getBaseModelDocument(CLASS_NAME, Lead);
		document.addLocalizedText(Field.TITLE, Lead.getTitleMap());
		document.addText(Field.DESCRIPTION, Lead.getDescription());

		return document;
	}

	@Override
	protected Summary doGetSummary(
		Document document, Locale locale, String snippet,
		PortletRequest portletRequest, PortletResponse portletResponse)
		throws Exception {

		String prefix = Field.SNIPPET + StringPool.UNDERLINE;
		String title = document.get(prefix + Field.TITLE, Field.TITLE);
		String content = HtmlUtil.stripHtml(
			document.get(prefix + Field.DESCRIPTION, Field.DESCRIPTION));

		Summary summary = new Summary(title, content);
		summary.setMaxContentLength(200);
		return summary;
	}

	@Override
	protected void doReindex(String className, long classPK)
		throws Exception {

		Lead Lead = _leadLocalService.getLead(classPK);
		doReindex(Lead);
	}

	@Override
	protected void doReindex(String[] ids)
		throws Exception {

		long companyId = GetterUtil.getLong(ids[0]);
		reindexLeads(companyId);
	}

	@Override
	protected void doReindex(Lead Lead)
		throws Exception {

		Document document = getDocument(Lead);
		_indexWriterHelper.updateDocument(
			getSearchEngineId(), Lead.getCompanyId(), document,
			isCommitImmediately());
	}

	protected void reindexLeads(long companyId)
		throws PortalException {

		final IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			_leadLocalService.getIndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setCompanyId(companyId);

		// Actionable query

		indexableActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Lead>() {

				@Override
				public void performAction(Lead Lead) {

					try {
						Document document = getDocument(Lead);
						indexableActionableDynamicQuery.addDocuments(document);
					}
					catch (PortalException pe) {
						if (_log.isWarnEnabled()) {
							_log.warn(
								"Unable to index Lead " +
									Lead.getLeadId(),
								pe);
						}
					}
				}
			});

		indexableActionableDynamicQuery.setSearchEngineId(getSearchEngineId());
		indexableActionableDynamicQuery.performActions();
	}

	private static final Log _log =
		LogFactoryUtil.getLog(LeadIndexer.class);

	@Reference
	private LeadLocalService _leadLocalService;

	@Reference
	protected IndexWriterHelper _indexWriterHelper;

	private static final String CLASS_NAME = Lead.class.getName();

}
