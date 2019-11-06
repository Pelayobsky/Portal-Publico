
package mx.movistar.col.lead.business.ws.atento.model;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Service1Soap", targetNamespace = "http://tempuri.org/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Service1Soap {


    /**
     * 
     * @param parameters
     * @return
     *     returns atento.InsertarResponse
     */
    @WebMethod(operationName = "Insertar", action = "http://tempuri.org/Insertar")
    @WebResult(name = "InsertarResponse", targetNamespace = "http://tempuri.org/", partName = "parameters")
    public InsertarResponse insertar(
        @WebParam(name = "Insertar", targetNamespace = "http://tempuri.org/", partName = "parameters")
        Insertar parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns atento.ResponseResponse
     */
    @WebMethod(operationName = "Response", action = "http://tempuri.org/Response")
    @WebResult(name = "ResponseResponse", targetNamespace = "http://tempuri.org/", partName = "parameters")
    public ResponseResponse response(
        @WebParam(name = "Response", targetNamespace = "http://tempuri.org/", partName = "parameters")
        Response parameters);

}