package mx.movistar.col.lead.business.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@XmlRootElement
public class GenericLead {

	//
	private long idLead;
		
	//campos genericos
	private String type ;
	private String product;
	private String phone;
	private String name;
	private String surname;
	private String email;
	private Date   dateTimeScheduled;
	private List<String> extra;
	private String ip;
	private String url;
	private String origen;
}
