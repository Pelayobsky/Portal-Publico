package mx.movistar.col.lead.business.impl;

import static org.junit.Assert.assertEquals;

import com.liferay.portal.kernel.util.Validator;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import mx.movistar.col.lead.business.model.GenericLead;

public class LeadServiceImplTest {

	
	@Test
	public void convertDateTest() {
//		
//		Date testDate = null;
//		assertEquals(null, convertToLocalDateTimeViaInstant(testDate));
//		
//		
//		testDate = new Date(2019, 10, 12);
//		LocalDateTime a = LocalDateTime.of(2019, 10, 12, 0, 0);
//		assertEquals(a, convertToLocalDateTimeViaInstant(testDate));
		
		
		
	}
	
	private LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
		
		if(Validator.isNull(dateToConvert)) return null;
		
	    return dateToConvert.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDateTime();
	}
	
	
	@Test
	public void getUrlParameters() {

	    Map<String, String> map = new HashMap<String, String>();  
		String url;
		
		url = null;
	    assertEquals(map, getQueryMap(url));
	    
	    url = "a";
	    assertEquals(map, getQueryMap(url));

	    map.put("utm_source", "newsletter");
	    map.put("utm_medium", "email");
	    map.put("utm_campaign", "NL_particulates_septiembre2018");
	    map.put("utm_term", "pospago");	    
	    url = "https://www.movistar.com.mx/promociones/renovacion-con-equipo/?utm_source=newsletter&utm_medium=email&utm_campaign=NL_particulates_septiembre2018&utm_term=pospago";
	    assertEquals(map, getQueryMap(url));
	    
	    map.put("idCli", "21329013213281asjzkjhsajhk2");
	    url = "https://www.movistar.com.mx/promociones/renovacion-con-equipo?utm_source=newsletter&utm_medium=email&utm_campaign=NL_particulates_septiembre2018&utm_term=pospago&idCli=21329013213281asjzkjhsajhk2";
	    assertEquals(map, getQueryMap(url));

	    url = "https://www.movistar.com.mx/promociones/renovacion-con-equipo?utm_source=&utm_medium=email&utm_campaign=NL_particulates_septiembre2018&utm_term=pospago&idCli=21329013213281asjzkjhsajhk2&utm_source=newsletter&utm_medium=email&utm_campaign=NL_particulates_septiembre2018&utm_term=pospago&idCli=21329013213281asjzkjhsajhk2";

	    assertEquals(map, getQueryMap(url));
	    
	}
	
	private Map<String, String> getQueryMap(String query) {  

		Map<String, String> map = new HashMap<String, String>();  
		if(Validator.isNull(query)) return map;
		
		String[] url = query.split("\\?"); 
	    if(url.length == 1) return  map;		
		String[] params = url[1].split("&");  
	    if(params.length == 1) return  map;
		for (String param : params){  
	        try {
				String name  = param.split("=")[0];
		        String value = param.split("=")[1];
		        map.put(name, value);  
	        }catch(Exception e) {
	        	
	        }
	    }  
	    
		return map;  
	}
	
	
	@Test
	public void labelExtra() {
		
		GenericLead lead = new GenericLead();	
		List<String>  lista = new ArrayList<>();
		lista.add("1");
		lista.add("2");
		lista.add("3");
		lead.setExtra(lista);
	    assertEquals("1|2|3", joinExtrasFields(lead));
	   
	    lista.remove(2);
	    lista.remove(1);
	   
	    assertEquals("1", joinExtrasFields(lead));
	    
	    lista.add("4");
	    lista.add("5");
	    lista.add("6");
	    lista.add("7");
	
	    assertEquals("1|4|5", joinExtrasFields(lead));
	}
	
	
	/**
	 * Crea un string apartir de todos los extras 
	 * @param genericLead
	 * @return
	 */
	private String joinExtrasFields(GenericLead genericLead) {
		
		StringBuilder sb = new StringBuilder("");

		for(int i=0; i<genericLead.getExtra().size(); i++) {
			sb.append(Validator.isNotNull(genericLead.getExtra().get(i))?genericLead.getExtra().get(i):"");
			sb.append("|");
			if(i==2) {
				i=genericLead.getExtra().size();
			}
		}
		
		sb.deleteCharAt(sb.length()-1);
		
		return sb.toString();
	}
	
	
	@Test
	public void setExtras123() {
		
		GenericLead lead = new GenericLead();	
		List<String>  lista = new ArrayList<>();
		lista.add("1");
		lista.add("2");
		lista.add("3");
		lead.setExtra(lista);
		
		assertEquals("321", alg(lead));
		
		lista.clear();
		
		assertEquals("", alg(lead));
		
		lista.add("1");
		assertEquals("1", alg(lead));
		lista.add("2");
		assertEquals("21", alg(lead));
		lista.add("3");
		assertEquals("321", alg(lead));
		
		lista = null;
		lead.setExtra(lista);

		assertEquals("", alg(lead));

	}
	

	private String alg(GenericLead genericLead) {
		StringBuilder sb = new StringBuilder("");

		int size = Validator.isNull(genericLead.getExtra())?0:genericLead.getExtra().size();
		
		switch(size) {
			case 3: sb.append(genericLead.getExtra().get(2));
			case 2: sb.append(genericLead.getExtra().get(1));
			case 1: sb.append(genericLead.getExtra().get(0));
		}
		
		return sb.toString();
	}
	
}
