
package mx.movistar.col.lead.business.ws.atento.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaÃ±a complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaÃ±a">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdCamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Campa\u00f1a", propOrder = {
    "idCamp"
})
public class Campaña {



	@XmlElement(name = "IdCamp")
    protected int idCamp;

	public Campaña() {
		
	}
	
    public Campaña(int idCamp) {
		this.idCamp = idCamp;
	}
	
    /**
     * Gets the value of the idCamp property.
     * 
     */
    public int getIdCamp() {
        return idCamp;
    }

    /**
     * Sets the value of the idCamp property.
     * 
     */
    public void setIdCamp(int value) {
        this.idCamp = value;
    }

}
