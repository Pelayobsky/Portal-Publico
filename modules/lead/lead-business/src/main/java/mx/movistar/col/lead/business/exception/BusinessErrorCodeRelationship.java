package mx.movistar.col.lead.business.exception;

import java.util.HashMap;
import java.util.Map;

/**
 * Relacion del codigo de error con su descripcion 
 * 
 * 1- Algun dato no tiene el formato correcto 
 * 2- El Servicio del Call Centern no funciona, no esta disponible 
 * 3- Error en guarda o obtener informacion de la base de datos de liferay
 * 9- Error inesperado 
 * @author vass
 *
 */
public class BusinessErrorCodeRelationship {

	public static Integer ONE   = 1;
	public static Integer TWO   = 2;
	public static Integer THREE = 3;
	public static Integer FOUR  = 4;
	public static Integer NINE  = 9;
	
	public static Map<Integer,String> mapCodeRelationship;
		
	static {
		mapCodeRelationship = new HashMap<>();
		mapCodeRelationship.put(ONE,   "Invalid data");
		mapCodeRelationship.put(TWO,   "Call Center failure");
		mapCodeRelationship.put(THREE, "DB LIFERAY ERROR ");
		mapCodeRelationship.put(FOUR,  "Phone already registered in the last 6 hours");
		mapCodeRelationship.put(NINE,  "Unexpected error ");
	}
	
	
}
