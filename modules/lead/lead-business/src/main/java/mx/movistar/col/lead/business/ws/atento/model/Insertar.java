
package mx.movistar.col.lead.business.ws.atento.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_Datos" type="{http://tempuri.org/}Datos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "datos"
})
@XmlRootElement(name = "Insertar")
public class Insertar {
	
	public Insertar() {
		
	}
	
	public Insertar(Datos datos) {
		this.datos = datos;
	}

    @XmlElement(name = "_Datos")
    protected Datos datos;

    /**
     * Gets the value of the datos property.
     * 
     * @return
     *     possible object is
     *     {@link Datos }
     *     
     */
    public Datos getDatos() {
        return datos;
    }

    /**
     * Sets the value of the datos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Datos }
     *     
     */
    public void setDatos(Datos value) {
        this.datos = value;
    }

}
