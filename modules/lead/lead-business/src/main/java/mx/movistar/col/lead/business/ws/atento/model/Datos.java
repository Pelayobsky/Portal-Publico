
package mx.movistar.col.lead.business.ws.atento.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Datos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Datos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_DatosContacto" type="{http://tempuri.org/}DatosContacto"/>
 *         &lt;element name="_DatosAgenda" type="{http://tempuri.org/}DatosAgenda"/>
 *         &lt;element name="_Campaña" type="{http://tempuri.org/}Campaña"/>
 *         &lt;element name="_DatosCore" type="{http://tempuri.org/}DatosCore"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Datos", propOrder = {
    "datosContacto",
    "datosAgenda",
    "campa\u00f1a",
    "datosCore"
})
public class Datos {

    @XmlElement(name = "_DatosContacto", required = true)
    protected DatosContacto datosContacto;
    @XmlElement(name = "_DatosAgenda", required = true)
    protected DatosAgenda datosAgenda;
    @XmlElement(name = "_Campa\u00f1a", required = true)
    protected Campa�a campa�a;
    @XmlElement(name = "_DatosCore", required = true)
    protected DatosCore datosCore;
    
    public Datos() {
    	
    }
    
    public Datos(DatosContacto datosContacto, DatosAgenda datosAgenda, Campa�a campa�a, DatosCore datosCore) {
    	this.datosContacto = datosContacto;
    	this.datosAgenda   = datosAgenda;
    	this.campa�a       = campa�a;
    	this.datosCore     = datosCore;
    }

    /**
     * Gets the value of the datosContacto property.
     * 
     * @return
     *     possible object is
     *     {@link DatosContacto }
     *     
     */
    public DatosContacto getDatosContacto() {
        return datosContacto;
    }

    /**
     * Sets the value of the datosContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosContacto }
     *     
     */
    public void setDatosContacto(DatosContacto value) {
        this.datosContacto = value;
    }

    /**
     * Gets the value of the datosAgenda property.
     * 
     * @return
     *     possible object is
     *     {@link DatosAgenda }
     *     
     */
    public DatosAgenda getDatosAgenda() {
        return datosAgenda;
    }

    /**
     * Sets the value of the datosAgenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosAgenda }
     *     
     */
    public void setDatosAgenda(DatosAgenda value) {
        this.datosAgenda = value;
    }

    /**
     * Gets the value of the campaña property.
     * 
     * @return
     *     possible object is
     *     {@link Campaña }
     *     
     */
    public Campa�a getCampa�a() {
        return campa�a;
    }

    /**
     * Sets the value of the campaña property.
     * 
     * @param value
     *     allowed object is
     *     {@link Campaña }
     *     
     */
    public void setCampa�a(Campa�a value) {
        this.campa�a = value;
    }

    /**
     * Gets the value of the datosCore property.
     * 
     * @return
     *     possible object is
     *     {@link DatosCore }
     *     
     */
    public DatosCore getDatosCore() {
        return datosCore;
    }

    /**
     * Sets the value of the datosCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosCore }
     *     
     */
    public void setDatosCore(DatosCore value) {
        this.datosCore = value;
    }

}
