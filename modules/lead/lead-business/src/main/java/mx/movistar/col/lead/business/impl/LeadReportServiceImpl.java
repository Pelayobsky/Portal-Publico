package mx.movistar.col.lead.business.impl;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Validator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import mx.movistar.col.lead.business.api.LeadReportService;
import mx.movistar.col.lead.business.constants.ReportType;
import mx.movistar.col.lead.model.impl.LeadReportImpl;
import mx.movistar.col.lead.service.LeadLocalService;

@Component(
		immediate = false,
		service = LeadReportService.class
)
public class LeadReportServiceImpl implements LeadReportService {
	
	private static final Log _log = LogFactoryUtil.getLog(LeadReportServiceImpl.class);
	
	private static final String[] headersOnlineLeadReport = { "Nombre","Telefono","Correo","Adicional","Fecha","Hora","MedioMovistar","ID","UrlRegistro","Origen","RWS","Recibe_Ofertas","DN_Portar","Fecha_Reenvio","Hora_Reenvio","ID_Landing_Lead","IP_Cliente","Equipo_Promocion","CodigoMovistar","CampanaOrigen" };
	
	private static final String[] headersCronLeadReport = { "WsIdExt","WsTs","WsDate","WsTime","WsType","WsProvider","WsPhone","WsName","WsEmail","WsIp","WsUrl","WsProduct","WsOffer","WsDateScheduled","TimeScheduled","User_receive_offers","Other_source","Utm_source","Utm_medium","Utm_content","Utm_campaign","Utm_term","Landing_name","Numero_Portar","Compania_Actual","CampName","CampUri","Id_landing_lead","Adicional_Comentarios","Origen","RWS","Fecha_Reenvio","Hora_Reenvio","DescriptionError" };
	
	private ThemeDisplay themeDisplay;

	@Override
	public byte[] getExcelBytes(long groupId, int status, Date fromDate, Date toDate, ReportType reportType, ThemeDisplay themeDisplay) {
		
		this.themeDisplay = themeDisplay;
		
		int leadReportEntriesCount = _LeadLocalService.countLeadReportEntriesByG_S_DateRange(groupId, status, fromDate, toDate);
		
		_log.debug("Lead Report Entries Count for Excel : " + leadReportEntriesCount);
		
		List<LeadReportImpl> leadReportEntries = _LeadLocalService.findLeadReportByG_S_DateRange(groupId, status, fromDate, toDate, 0, leadReportEntriesCount);
				
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		switch (reportType) {
		
			case ONLINE:
				createOnlineReport(workbook, leadReportEntries);
				break;
				
			case CRON:
				createCronReport(workbook, leadReportEntries);
				break;
				
			default:
				break;
			
		}
		
		
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		
		try {
			
			workbook.write(byteArrayOutputStream);
			
		} catch (IOException e) {
			
			_log.error(e);
			
		} finally {
			
			try {
				
				byteArrayOutputStream.close();
				//workbook.close();
				
			} catch (IOException e) {
				
				_log.error(e);
				
			}
			
		}
		
		return byteArrayOutputStream.toByteArray();
		
	}
	
	private void createOnlineReport(XSSFWorkbook workbook, List<LeadReportImpl> leadReportEntries) {
		
		DataFormat format = workbook.createDataFormat();
		
		CellStyle dateTimeStyle = workbook.createCellStyle();
		CellStyle dateStyle = workbook.createCellStyle();
		CellStyle timeStyle = workbook.createCellStyle();
		CellStyle numberStyle = workbook.createCellStyle();
		
		dateTimeStyle.setDataFormat(format.getFormat("yyy-mm-dd h:mm:ss.SS"));
		dateStyle.setDataFormat(format.getFormat("yyy-mm-dd"));
		timeStyle.setDataFormat(format.getFormat("h:mm:ss.SS"));
		numberStyle.setDataFormat(format.getFormat("#,##0"));
		
		XSSFSheet sheetLeadReport = workbook.createSheet("ONLINE REPORT");
		
		int rowNum = 0;
				
		Row row = sheetLeadReport.createRow(rowNum++);
		
		
		for (int index = 0; index < headersOnlineLeadReport.length; index++) {
			
			Cell cell = row.createCell(index);
			cell.setCellValue(headersOnlineLeadReport[index]);
		}
		
		for(LeadReportImpl entry: leadReportEntries) {
			
			row = sheetLeadReport.createRow(rowNum++);
			int colNum = 0;
			
			Cell cell = row.createCell(colNum++);
			// Nombre
			cell.setCellValue(entry.getName() + " " + entry.getSurname());
			
			cell = row.createCell(colNum++);
			// Telefono
			cell.setCellValue(entry.getMsisdn());
			
			cell = row.createCell(colNum++);
			// Correo
			cell.setCellValue(entry.getEmail());
			
			cell = row.createCell(colNum++);
			// Adicional
			cell.setCellValue(entry.getProduct());
			
			cell = row.createCell(colNum++);
			// Fecha
			cell.setCellStyle(dateStyle);
			
			if( Validator.isNotNull( entry.getCreateDate() ) ) {
				cell.setCellValue(entry.getCreateDate());
			} else {
				cell.setCellValue("");
			}
			
			cell = row.createCell(colNum++);
			// Hora
			cell.setCellStyle(timeStyle);
			
			if( Validator.isNotNull( entry.getCreateDate() ) ) {
				cell.setCellValue( entry.getCreateDate() );
			} else {
				cell.setCellValue("");
			}
			
			cell = row.createCell(colNum++);
			// MedioMovistar
			cell.setCellValue(entry.getUtmMedium());
			
			cell = row.createCell(colNum++);
			// ID
			cell.setCellValue(entry.getIdCCWS());
			
			cell = row.createCell(colNum++);
			// UrlRegistro
			cell.setCellValue(entry.getUrl());
			
			cell = row.createCell(colNum++);
			// Origen
			cell.setCellValue(entry.getSource());
			
			cell = row.createCell(colNum++);
			// RWS
			cell.setCellValue(Validator.isNotNull( entry.getReTryDate() ) ? "SI" : "NO");
			
			cell = row.createCell(colNum++);
			// Recibe_Ofertas
			cell.setCellValue(entry.getExtra1());
			
			cell = row.createCell(colNum++);
			// DN_Portar
			cell.setCellValue(entry.getExtra2());
			
			cell = row.createCell(colNum++);
			// Fecha_Reenvio
			cell.setCellStyle(dateStyle);
			
			if( Validator.isNotNull( entry.getReTryDate() ) ) {
				cell.setCellValue(entry.getReTryDate());
			} else {
				cell.setCellValue("");
			}
			
			cell = row.createCell(colNum++);
			// Hora_Reenvio
			cell.setCellStyle(timeStyle);
			
			if( Validator.isNotNull( entry.getReTryDate() ) ) {
				cell.setCellValue(entry.getReTryDate());
			} else {
				cell.setCellValue("");
			}
			
			cell = row.createCell(colNum++);
			// ID_Landing_Lead
			cell.setCellValue(entry.getLeadScoringId());
			
			cell = row.createCell(colNum++);
			// IP_Cliente
			cell.setCellValue(entry.getClientIP());
			
			cell = row.createCell(colNum++);
			// Equipo_Promocion
			cell.setCellValue("");
			
			cell = row.createCell(colNum++);
			// CodigoMovistar
			cell.setCellValue("");
			
			cell = row.createCell(colNum++);
			// CampanaOrigen
			cell.setCellValue("");
			
		}
	}
	
	private void createCronReport(XSSFWorkbook workbook, List<LeadReportImpl> leadReportEntries) {
		
		DataFormat format = workbook.createDataFormat();
		
		CellStyle dateTimeStyle = workbook.createCellStyle();
		CellStyle dateStyle = workbook.createCellStyle();
		CellStyle timeStyle = workbook.createCellStyle();
		CellStyle numberStyle = workbook.createCellStyle();
		
		dateTimeStyle.setDataFormat(format.getFormat("yyy-mm-dd h:mm:ss.SS"));
		dateStyle.setDataFormat(format.getFormat("yyy-mm-dd"));
		timeStyle.setDataFormat(format.getFormat("h:mm:ss.SS"));
		numberStyle.setDataFormat(format.getFormat("#,##0"));
		
		XSSFSheet sheetLeadReport = workbook.createSheet("CRON REPORT");
	
		int rowNum = 0;
				
		Row row = sheetLeadReport.createRow(rowNum++);
		
		
		for (int index = 0; index < headersCronLeadReport.length; index++) {
			
			Cell cell = row.createCell(index);
			cell.setCellValue(headersCronLeadReport[index]);
		}
		
		for(LeadReportImpl entry: leadReportEntries) {
			
			row = sheetLeadReport.createRow(rowNum++);
			
			int colNum = 0;
			
			Cell cell = row.createCell(colNum++);
			// "WSIDEXT"
			cell.setCellValue( Validator.isNotNull(entry.getIdCCWS()) ? String.valueOf(entry.getIdCCWS()) : "" );
			
			cell = row.createCell(colNum++);
			// "WSTS"
			cell.setCellStyle(dateTimeStyle);
			
			if( Validator.isNotNull( entry.getCreateDate() ) ) {
				cell.setCellValue(entry.getCreateDate());
			} else {
				cell.setCellValue("");
			}
			
			cell = row.createCell(colNum++);
			// "WSDATE"
			cell.setCellStyle(dateStyle);
			
			if( Validator.isNotNull( entry.getCreateDate() ) ) {
				cell.setCellValue(entry.getCreateDate());
			} else {
				cell.setCellValue("");
			}
			
			cell = row.createCell(colNum++);
			// "WSTIME"
			cell.setCellStyle(timeStyle);
			
			if( Validator.isNotNull( entry.getCreateDate() ) ) {
				cell.setCellValue(entry.getCreateDate());
			} else {
				cell.setCellValue("");
			}
			
			cell = row.createCell(colNum++);
			// "WSTYPE"
			cell.setCellValue(entry.getType());
			
			cell = row.createCell(colNum++);
			// "WSPROVIDER"
			cell.setCellValue(entry.getUtmSource() + "|" + entry.getUtmMedium() + "|" + entry.getUtmContent() + "|" + entry.getUtmCampaign() + "|" + entry.getUtmTerm() + "|" + entry.getUtmSource());
			
			cell = row.createCell(colNum++);
			// "WSPHONE"
			cell.setCellValue(entry.getMsisdn());
			
			cell = row.createCell(colNum++);
			// "WSNAME"
			cell.setCellValue(entry.getName() + " " + entry.getSurname());
			
			cell = row.createCell(colNum++);
			// "WSEMAIL"
			cell.setCellValue(entry.getEmail());
			
			cell = row.createCell(colNum++);
			// "WSIP"
			cell.setCellValue(entry.getClientIP());
			
			cell = row.createCell(colNum++);
			// "WSURL"
			cell.setCellValue(entry.getUrl());
			
			cell = row.createCell(colNum++);
			// "WSPRODUCT"
			cell.setCellValue(entry.getProduct());
			
			cell = row.createCell(colNum++);
			// "WSOFFER"
			cell.setCellValue(entry.getCampaignTitle().get(themeDisplay.getLocale()));
			
			cell = row.createCell(colNum++);
			// "WSDATESCHEDULED"
			cell.setCellStyle(dateStyle);
			
			if( Validator.isNotNull( entry.getDateSchedule() ) ) {
				cell.setCellValue(entry.getDateSchedule());
			} else {
				cell.setCellValue("");
			}
			
			cell = row.createCell(colNum++);
			// "TIMESCHEDULED"
			cell.setCellStyle(timeStyle);
			
			if( Validator.isNotNull( entry.getDateSchedule() ) ) {
				cell.setCellValue(entry.getDateSchedule());
			} else {
				cell.setCellValue("");
			}
			
			cell = row.createCell(colNum++);
			// "USER_RECEIVE_OFFERS"
			cell.setCellValue(entry.getExtra1());
			
			cell = row.createCell(colNum++);
			// "OTHER_SOURCE"
			cell.setCellValue(entry.getOtherSource());
			
			cell = row.createCell(colNum++);
			// "UTM_SOURCE"
			cell.setCellValue(entry.getUtmSource());
			
			cell = row.createCell(colNum++);
			// "UTM_MEDIUM"
			cell.setCellValue(entry.getUtmMedium());
			
			cell = row.createCell(colNum++);
			// "UTM_CONTENT"
			cell.setCellValue(entry.getUtmContent());
			
			cell = row.createCell(colNum++);
			// "UTM_CAMPAIGN"
			cell.setCellValue(entry.getUtmCampaign());
			
			cell = row.createCell(colNum++);
			// "UTM_TERM"
			cell.setCellValue(entry.getUtmTerm());
			
			cell = row.createCell(colNum++);
			// "LANDING_NAME"
			cell.setCellValue(Validator.isNotNull(entry.getOrigen()) ? entry.getOrigen() : "");
			
			cell = row.createCell(colNum++);
			// "NUMERO_PORTAR"
			cell.setCellValue(entry.getExtra2());
			
			cell = row.createCell(colNum++);
			// "COMPANIA_ACTUAL"
			cell.setCellValue(entry.getExtra3());
			
			cell = row.createCell(colNum++);
			// "CAMPNAME"
			cell.setCellValue("");
			
			cell = row.createCell(colNum++);
			// "CAMPURI"
			cell.setCellValue(entry.getUrl());
			
			cell = row.createCell(colNum++);
			// "ID_LANDING_LEAD"
			cell.setCellStyle(numberStyle);
			cell.setCellValue(Validator.isNotNull(entry.getLeadScoringId()) ? String.valueOf(entry.getLeadScoringId()) : "");
			
			cell = row.createCell(colNum++);
			// "ADICIONAL_COMENTARIOS"
			cell.setCellValue(entry.getProduct());
			
			cell = row.createCell(colNum++);
			// "ORIGEN"
			cell.setCellValue(entry.getSource());
			
			cell = row.createCell(colNum++);
			// "RWS"
			cell.setCellValue(Validator.isNotNull( entry.getReTryDate() ) ? "SI" : "NO");
			
			cell = row.createCell(colNum++);
			// "FECHA_REENVIO"
			cell.setCellStyle(dateStyle);
			
			if( Validator.isNotNull( entry.getReTryDate() ) ) {
				cell.setCellValue(entry.getReTryDate());
			} else {
				cell.setCellValue("");
			}
			
			cell = row.createCell(colNum++);
			// "HORA_REENVIO"
			cell.setCellStyle(timeStyle);
			
			if( Validator.isNotNull( entry.getReTryDate() ) ) {
				cell.setCellValue(entry.getReTryDate());
			} else {
				cell.setCellValue("");
			}
			
			cell = row.createCell(colNum++);
			// "DESCRIPTIONERROR"
			cell.setCellValue(entry.getResponseWS());
			
		}
	}
	
	@Reference
	protected LeadLocalService _LeadLocalService;

}
