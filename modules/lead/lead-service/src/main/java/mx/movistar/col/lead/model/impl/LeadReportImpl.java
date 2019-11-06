package mx.movistar.col.lead.model.impl;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LeadReportImpl {

	private long campaignId;
	private Map<Locale,String> campaignTitle;
	
	private long leadId;
	private Map<Locale,String> leadTitle;
	private String source;
	private String product;
	private String type;
	private int totalScoring;
	
	private long leadScoringId;
	private Date createDate;
	private String msisdn;
	private String email;
	private String name;
	private String surname;
	private String extra1;
	private String extra2;
	private String extra3;
	private Date dateSchedule;
	private String utmSource;
	private String utmMedium;
	private String utmContent;
	private String utmCampaign;
	private String utmTerm;
	private String otherSource;
	private String url;
	private String responseWS;
	private long idCCWS;
	private Date reTryDate;
	private String clientIP;
	private String origen;
	
}
