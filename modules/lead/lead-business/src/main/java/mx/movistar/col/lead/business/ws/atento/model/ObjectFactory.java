
package mx.movistar.col.lead.business.ws.atento.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the atento package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: atento
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link InsertarResponse }
     * 
     */
    public InsertarResponse createInsertarResponse() {
        return new InsertarResponse();
    }

    /**
     * Create an instance of {@link ResponseResponse }
     * 
     */
    public ResponseResponse createResponseResponse() {
        return new ResponseResponse();
    }

    /**
     * Create an instance of {@link Insertar }
     * 
     */
    public Insertar createInsertar() {
        return new Insertar();
    }

    /**
     * Create an instance of {@link Datos }
     * 
     */
    public Datos createDatos() {
        return new Datos();
    }

    /**
     * Create an instance of {@link DatosContacto }
     * 
     */
    public DatosContacto createDatosContacto() {
        return new DatosContacto();
    }

    /**
     * Create an instance of {@link DatosCore }
     * 
     */
    public DatosCore createDatosCore() {
        return new DatosCore();
    }

    /**
     * Create an instance of {@link CampaÃ±a }
     * 
     */
    public Campaña createCampaña() {
        return new Campaña();
    }

    /**
     * Create an instance of {@link DatosAgenda }
     * 
     */
    public DatosAgenda createDatosAgenda() {
        return new DatosAgenda();
    }

}
