
package mx.movistar.col.lead.business.ws.atento.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tipo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Tipo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="C2C"/>
 *     &lt;enumeration value="CMB"/>
 *     &lt;enumeration value="COV"/>
 *     &lt;enumeration value="CALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Tipo")
@XmlEnum
public enum Tipo {

    @XmlEnumValue("C2C")
    C_2_C("C2C"),
    CMB("CMB"),
    COV("COV"),
    CALL("CALL");
    private final String value;

    Tipo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Tipo fromValue(String v) {
        for (Tipo c: Tipo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    
    public static boolean contains(String tipo) {

        for (Tipo c : Tipo.values()) {
            if (c.name().equals(tipo)) {
                return true;
            }
        }

        return false;
    }
    
}
