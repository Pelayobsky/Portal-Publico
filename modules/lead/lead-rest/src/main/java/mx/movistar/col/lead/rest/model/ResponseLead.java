package mx.movistar.col.lead.rest.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResponseLead {

	private long code;
	private String error;
	private boolean correcto;

	public ResponseLead() {
		
	}
}
