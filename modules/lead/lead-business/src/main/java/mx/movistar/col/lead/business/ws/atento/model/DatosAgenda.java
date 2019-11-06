
package mx.movistar.col.lead.business.ws.atento.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatosAgenda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatosAgenda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateScheduled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeScheduled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosAgenda", propOrder = {
    "dateScheduled",
    "timeScheduled"
})
public class DatosAgenda {
	
    @XmlElement(name = "DateScheduled")
    protected String dateScheduled;
    @XmlElement(name = "TimeScheduled")
    protected String timeScheduled;

    
    public DatosAgenda() {
    	
    }
    
    public DatosAgenda( String dateScheduled, String timeScheduled ) {
    	this.dateScheduled = dateScheduled;
    	this.timeScheduled = timeScheduled;
    }
    
    /**
     * Gets the value of the dateScheduled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateScheduled() {
        return dateScheduled;
    }

    /**
     * Sets the value of the dateScheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateScheduled(String value) {
        this.dateScheduled = value;
    }

    /**
     * Gets the value of the timeScheduled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeScheduled() {
        return timeScheduled;
    }

    /**
     * Sets the value of the timeScheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeScheduled(String value) {
        this.timeScheduled = value;
    }

}
