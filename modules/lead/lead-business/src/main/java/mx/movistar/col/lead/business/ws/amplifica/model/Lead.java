
package mx.movistar.col.lead.business.ws.amplifica.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Object lead
 * 
 * <p>Java class for lead complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lead">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateTimeScheduled" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="utm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outOfTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lead", propOrder = {
    "id",
    "type",
    "product",
    "phone",
    "name",
    "surname",
    "email",
    "dateTimeScheduled",
    "extra",
    "utm",
    "url",
    "outOfTime"
})
public class Lead {

    protected int id;
    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(required = true, nillable = true)
    protected String product;
    @XmlElement(required = true, nillable = true)
    protected String phone;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String surname;
    @XmlElement(required = true, nillable = true)
    protected String email;
    @XmlElement(required = true, nillable = true)
    protected String dateTimeScheduled;
    @XmlElement(required = true, nillable = true)
    protected String extra;
    @XmlElement(required = true, nillable = true)
    protected String utm;
    @XmlElement(required = true, nillable = true)
    protected String url;
    protected int outOfTime;

    
    public Lead() {
    }
    
    public Lead(int id, String type, String product, String phone, String name, String surname, String email, String dateTimeScheduled, String extra, String utm, String url, int outOfTime) {
    	this.id = id;
    	this.type = type;
    	this.product = product;
    	this.phone = phone;
    	this.name = name;
    	this.surname = surname;
    	this.email = email;
    	this.dateTimeScheduled = dateTimeScheduled;
    	this.extra = extra;
    	this.utm = utm;
    	this.url = url;
    	this.outOfTime = outOfTime;
    }
    
    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the dateTimeScheduled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeScheduled() {
        return dateTimeScheduled;
    }

    /**
     * Sets the value of the dateTimeScheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeScheduled(String value) {
        this.dateTimeScheduled = value;
    }

    /**
     * Gets the value of the extra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtra() {
        return extra;
    }

    /**
     * Sets the value of the extra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtra(String value) {
        this.extra = value;
    }

    /**
     * Gets the value of the utm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtm() {
        return utm;
    }

    /**
     * Sets the value of the utm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtm(String value) {
        this.utm = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the outOfTime property.
     * 
     */
    public int getOutOfTime() {
        return outOfTime;
    }

    /**
     * Sets the value of the outOfTime property.
     * 
     */
    public void setOutOfTime(int value) {
        this.outOfTime = value;
    }

	@Override
	public String toString() {
		return "Lead [id=" + id + ", type=" + type + ", product=" + product + ", phone=" + phone + ", name=" + name
				+ ", surname=" + surname + ", email=" + email + ", dateTimeScheduled=" + dateTimeScheduled + ", extra="
				+ extra + ", utm=" + utm + ", url=" + url + ", outOfTime=" + outOfTime + "]";
	}

}
