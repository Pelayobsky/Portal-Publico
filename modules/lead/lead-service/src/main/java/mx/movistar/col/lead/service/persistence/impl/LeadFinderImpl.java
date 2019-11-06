package mx.movistar.col.lead.service.persistence.impl;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

import mx.movistar.col.lead.model.Campaign;
import mx.movistar.col.lead.model.Lead;
import mx.movistar.col.lead.model.LeadScoring;
import mx.movistar.col.lead.model.impl.CampaignImpl;
import mx.movistar.col.lead.model.impl.LeadImpl;
import mx.movistar.col.lead.model.impl.LeadReportImpl;
import mx.movistar.col.lead.model.impl.LeadScoringImpl;
import mx.movistar.col.lead.service.persistence.LeadFinder;

public class LeadFinderImpl extends LeadFinderBaseImpl implements LeadFinder{
	
	private static final Log _logger = LogFactoryUtil.getLog(LeadFinderImpl.class);
	
	public static final String LIST_ALL_CAMPAIGNS = LeadFinder.class.getName() + ".listAllCampaigns";
	
	public static final String LIST_ALL_LEADS = LeadFinder.class.getName() + ".listAllLeads";
	
	public static final String LIST_ALL_LEAD_SCORINGS = LeadFinder.class.getName() + ".listAllLeadScorings";

	public static final String COUNT_LEAD_REPORT_ENTRIES_BY_G_S_CAMPAIGN_ID = LeadFinder.class.getName() + ".countLeadReportEntriesByG_S_CampaignId";
	
	public static final String COUNT_LEAD_REPORT_ENTRIES_BY_G_S_LEAD_ID = LeadFinder.class.getName() + ".countLeadReportEntriesByG_S_LeadId";
	
	public static final String COUNT_LEAD_REPORT_ENTRIES_BY_G_S_DATE_RANGE = LeadFinder.class.getName() + ".countLeadReportEntriesByG_S_DateRange";
	
	public static final String FIND_LEAD_REPORT_BY_G_S_DATE_RANGE = LeadFinder.class.getName() + ".findLeadReportByG_S_DateRange";
	
	public static final String FIND_LEAD_REPORT_ENTRY_BY_LEAD_SCORING_PK = LeadFinder.class.getName() + ".findLeadReportEntryByLeadScoringPK";
	
	public List<Campaign> getAllCampaigns() {
		Session session = null;
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get( getClass(), LIST_ALL_CAMPAIGNS);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("Campaign", CampaignImpl.class);
			
			return (List<Campaign>) q.list(true);
		}
		catch (Exception e) {
			e.printStackTrace();
			try {
				throw new SystemException(e);
			} catch (SystemException se) {
				se.printStackTrace();
			}
		}
		finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<Lead> getAllLeads() {
		Session session = null;
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get( getClass(), LIST_ALL_LEADS);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("Lead", LeadImpl.class);
			
			return (List<Lead>) q.list(true);
		}
		catch (Exception e) {
			e.printStackTrace();
			try {
				throw new SystemException(e);
			} catch (SystemException se) {
				se.printStackTrace();
			}
		}
		finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<LeadScoring> getAllLeadScorings() {
		Session session = null;
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get( getClass(), LIST_ALL_LEAD_SCORINGS);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("LeadScoring", LeadScoringImpl.class);
			
			return (List<LeadScoring>) q.list(true);
		}
		catch (Exception e) {
			e.printStackTrace();
			try {
				throw new SystemException(e);
			} catch (SystemException se) {
				se.printStackTrace();
			}
		}
		finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public int countLeadReportEntriesByCampaignId(long groupId, int status, long campaignId) {
		
		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(getClass(), COUNT_LEAD_REPORT_ENTRIES_BY_G_S_CAMPAIGN_ID);

			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			
			q.addScalar("COUNT_VALUE", Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(groupId);
			qPos.add(status);
			qPos.add(campaignId);

			Iterator<Long> itr = q.iterate();

			if (itr.hasNext()) {
				Long count = itr.next();

				if (count != null) {
					return count.intValue();
				}
			}

			return 0;
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
		finally {
			closeSession(session);
		}
		
	}
	
	public int countLeadReportEntriesByLeadId(long groupId, int status, long leadId) {
		
		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(getClass(), COUNT_LEAD_REPORT_ENTRIES_BY_G_S_LEAD_ID);

			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			
			q.addScalar("COUNT_VALUE", Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(groupId);
			qPos.add(status);
			qPos.add(leadId);

			Iterator<Long> itr = q.iterate();

			if (itr.hasNext()) {
				Long count = itr.next();

				if (count != null) {
					return count.intValue();
				}
			}

			return 0;
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
		finally {
			closeSession(session);
		}
		
	}
	
	public int countLeadReportEntriesByG_S_DateRange(long groupId, int status, Date fromDate, Date toDate) {
		
		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(getClass(), COUNT_LEAD_REPORT_ENTRIES_BY_G_S_DATE_RANGE);

			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			
			q.addScalar("COUNT_VALUE", Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(groupId);
			qPos.add(status);
			qPos.add(fromDate);
			qPos.add(toDate);

			Iterator<Long> itr = q.iterate();

			if (itr.hasNext()) {
				Long count = itr.next();

				if (count != null) {
					return count.intValue();
				}
			}

			return 0;
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
		finally {
			closeSession(session);
		}
		
	}
	
	public List findLeadReportByG_S_DateRange(long groupId, int status, Date fromDate, Date toDate, int start, int end) {
		
		Session session = null;
		
		try {
			
			session = openSession();
			
			String sql = CustomSQLUtil.get( getClass(), FIND_LEAD_REPORT_BY_G_S_DATE_RANGE);
			
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			
			setColumnsInSQLQueryObject(queryObject);
			
			QueryPos qPos = QueryPos.getInstance(queryObject);
			
			qPos.add(groupId);
			qPos.add(status);
			qPos.add( Validator.isNotNull(fromDate) ? fromDate : "");
			qPos.add( Validator.isNotNull(toDate) ? toDate : "");
			qPos.add(start);
			qPos.add(end);
			
			return getLeadReport(queryObject.list());
			
		}
		catch (Exception e) {
			e.printStackTrace();
			try {
				throw new SystemException(e);
			} catch (SystemException se) {
				se.printStackTrace();
			}
		} finally {
			closeSession(session);
		}
		
		return null;
		
	}
	
	public List findLeadReportEntryByPK(long leadScoringId) {
		
		Session session = null;
		
		try {
			
			session = openSession();
			
			String sql = CustomSQLUtil.get( getClass(), FIND_LEAD_REPORT_ENTRY_BY_LEAD_SCORING_PK);
			
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			
			setColumnsInSQLQueryObject(queryObject);
			
			QueryPos qPos = QueryPos.getInstance(queryObject);
			
			qPos.add(leadScoringId);
			
			return getLeadReport(queryObject.list());
			
		}
		catch (Exception e) {
			e.printStackTrace();
			try {
				throw new SystemException(e);
			} catch (SystemException se) {
				se.printStackTrace();
			}
		} finally {
			closeSession(session);
		}
		
		return null;
		
	}

	private void setColumnsInSQLQueryObject(SQLQuery queryObject) {
		
		queryObject.addScalar("campaignId", Type.LONG);
		queryObject.addScalar("campaignTitle", Type.STRING);
		queryObject.addScalar("leadId", Type.LONG);
		queryObject.addScalar("leadTitle", Type.STRING);
		queryObject.addScalar("source", Type.STRING);
		queryObject.addScalar("product", Type.STRING);
		queryObject.addScalar("type", Type.STRING);
		queryObject.addScalar("totalScoring", Type.INTEGER);
		queryObject.addScalar("leadScoringId", Type.LONG);
		queryObject.addScalar("createDate", Type.TIMESTAMP);
		queryObject.addScalar("msisdn", Type.STRING);
		queryObject.addScalar("email", Type.STRING);
		queryObject.addScalar("name", Type.STRING);
		queryObject.addScalar("surname", Type.STRING);
		queryObject.addScalar("extra1", Type.STRING);
		queryObject.addScalar("extra2", Type.STRING);
		queryObject.addScalar("extra3", Type.STRING);
		queryObject.addScalar("dateSchedule", Type.TIMESTAMP);
		queryObject.addScalar("utmSource", Type.STRING);
		queryObject.addScalar("utmMedium", Type.STRING);
		queryObject.addScalar("utmContent", Type.STRING);
		queryObject.addScalar("utmCampaign", Type.STRING);
		queryObject.addScalar("utmTerm", Type.STRING);
		queryObject.addScalar("otherSource", Type.STRING);
		queryObject.addScalar("url", Type.STRING);
		queryObject.addScalar("responseWS", Type.STRING);
		queryObject.addScalar("idCCWS", Type.STRING);
		queryObject.addScalar("reTryDate", Type.TIMESTAMP);
		queryObject.addScalar("ipClient", Type.STRING);
		queryObject.addScalar("origen", Type.STRING);
		
	}
	
	private List getLeadReport(List objectList) throws Exception {
		
		List<LeadReportImpl> reportLeadList = new ArrayList<LeadReportImpl>();
		
		String serializeString = null;
		JSONArray objectJsonArray = null;
		JSONObject createDate = null;
		JSONObject dateSchedule = null;
		JSONObject reTryDate = null;
		LeadReportImpl rowReportLead = null;
		
		for(Object item : objectList) {
			
			serializeString = JSONFactoryUtil.serialize(item);
			objectJsonArray = JSONFactoryUtil.createJSONArray(serializeString);
			
			_logger.trace(objectJsonArray.toString());
			
			createDate = JSONFactoryUtil.createJSONObject( objectJsonArray.getString(9) );
			dateSchedule = JSONFactoryUtil.createJSONObject( objectJsonArray.getString(17) );
			reTryDate = JSONFactoryUtil.createJSONObject( objectJsonArray.getString(27) );
			
			rowReportLead = new LeadReportImpl();

			rowReportLead.setCampaignId( Validator.isNotNull( objectJsonArray.getString(0) ) ? Long.parseLong( objectJsonArray.getString(0) ) : 0L );
			
			rowReportLead.setCampaignTitle( Validator.isNotNull( objectJsonArray.getString(1) ) ? LocalizationUtil.getLocalizationMap( objectJsonArray.getString(1) ) : null );
			
			rowReportLead.setLeadId( Validator.isNotNull( objectJsonArray.getString(2) ) ? Long.parseLong( objectJsonArray.getString(2) ) : 0L );
			
			rowReportLead.setLeadTitle( Validator.isNotNull( objectJsonArray.getString(3) ) ? LocalizationUtil.getLocalizationMap( objectJsonArray.getString(3) ) : null );
			
			rowReportLead.setSource( Validator.isNotNull( objectJsonArray.getString(4) ) ? objectJsonArray.getString(4) : "" );
			
			rowReportLead.setProduct( Validator.isNotNull( objectJsonArray.getString(5) ) ? objectJsonArray.getString(5) : "" );
			
			rowReportLead.setType( Validator.isNotNull( objectJsonArray.getString(6) ) ? objectJsonArray.getString(6) : "" );
			
			rowReportLead.setTotalScoring( Validator.isNotNull( objectJsonArray.getString(7) ) ? Integer.parseInt( objectJsonArray.getString(7) ) : 0 );
			
			rowReportLead.setLeadScoringId( Validator.isNotNull( objectJsonArray.getString(8) ) ? Long.parseLong( objectJsonArray.getString(8) ) : 0L );
			
			rowReportLead.setCreateDate( Validator.isNotNull( createDate.getString("time") ) ? new Date( Long.parseLong( createDate.getString("time") ) ) : null );
			
			rowReportLead.setMsisdn( Validator.isNotNull( objectJsonArray.getString(10) ) ? objectJsonArray.getString(10) : "" );
			
			rowReportLead.setEmail( Validator.isNotNull( objectJsonArray.getString(11) ) ? objectJsonArray.getString(11) : "" );
			
			rowReportLead.setName( Validator.isNotNull( objectJsonArray.getString(12) ) ? objectJsonArray.getString(12) : "" );
			
			rowReportLead.setSurname( Validator.isNotNull( objectJsonArray.getString(13) ) ? objectJsonArray.getString(13) : "" );
			
			rowReportLead.setExtra1( Validator.isNotNull( objectJsonArray.getString(14) ) ? objectJsonArray.getString(14) : "" );
			
			rowReportLead.setExtra2( Validator.isNotNull( objectJsonArray.getString(15) ) ? objectJsonArray.getString(15) : "" );
			
			rowReportLead.setExtra3( Validator.isNotNull( objectJsonArray.getString(16) ) ? objectJsonArray.getString(16) : "" );
			
			rowReportLead.setDateSchedule( Validator.isNotNull( dateSchedule.getString("time") ) ? new Date( Long.parseLong(dateSchedule.getString("time") ) ) : null );
			
			rowReportLead.setUtmSource( Validator.isNotNull( objectJsonArray.getString(18) ) ? objectJsonArray.getString(18) : "" );
			
			rowReportLead.setUtmMedium( Validator.isNotNull( objectJsonArray.getString(19) ) ? objectJsonArray.getString(19) : "" );
			
			rowReportLead.setUtmContent( Validator.isNotNull( objectJsonArray.getString(20) ) ? objectJsonArray.getString(20) : "" );
			
			rowReportLead.setUtmCampaign( Validator.isNotNull( objectJsonArray.getString(21) ) ? objectJsonArray.getString(21) : "" );
			
			rowReportLead.setUtmTerm( Validator.isNotNull( objectJsonArray.getString(22) ) ? objectJsonArray.getString(22) : "" );
			
			rowReportLead.setOtherSource( Validator.isNotNull( objectJsonArray.getString(23) ) ? objectJsonArray.getString(23) : "" );
			
			rowReportLead.setUrl( Validator.isNotNull( objectJsonArray.getString(24) ) ? objectJsonArray.getString(24) : "" );
			
			rowReportLead.setResponseWS( Validator.isNotNull( objectJsonArray.getString(25) ) ? objectJsonArray.getString(25) : "" );
			
			rowReportLead.setIdCCWS( Validator.isNotNull( objectJsonArray.getString(26) ) ? Long.parseLong( objectJsonArray.getString(26) ) : 0L );
			
			rowReportLead.setReTryDate( Validator.isNotNull( reTryDate.getString("time") ) ? new Date( Long.parseLong(reTryDate.getString("time") ) ) : null );
			
			rowReportLead.setClientIP( Validator.isNotNull( objectJsonArray.getString(28) ) ? objectJsonArray.getString(28) : "" );
			
			rowReportLead.setOrigen( Validator.isNotNull( objectJsonArray.getString(29) ) ? objectJsonArray.getString(29) : "");
			
			
			reportLeadList.add(rowReportLead);
			
		}
		
		return reportLeadList;
		
	}
	
}
