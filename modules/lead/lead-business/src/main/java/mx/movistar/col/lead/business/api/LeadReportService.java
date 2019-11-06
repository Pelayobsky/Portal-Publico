package mx.movistar.col.lead.business.api;

import com.liferay.portal.kernel.theme.ThemeDisplay;

import java.util.Date;

import mx.movistar.col.lead.business.constants.ReportType;

public interface LeadReportService {

	public byte[] getExcelBytes(long groupId, int status, Date fromDate, Date toDate, ReportType reportType, ThemeDisplay themeDisplay);
	
}
