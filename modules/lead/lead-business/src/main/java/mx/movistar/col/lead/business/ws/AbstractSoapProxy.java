package mx.movistar.col.lead.business.ws;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.Handler;

public abstract class AbstractSoapProxy<E>{
		
	private static final Log _log = LogFactoryUtil.getLog(AbstractSoapProxy.class);

	/**
	 * Objeto para identificar 
	 * el tipo de clase
	 */
	protected Class<E> clazz;
			
	/*
	 * port para conectar a las operaciones 
	 * del WS
	 */
	protected E port;
	
	
	public AbstractSoapProxy(){
	}
	/**
	 * Metodo constructor que inicializa el tipo de clase
	 * y el key para obtener las credenciales del WS
	 * @param clazz tipo de clase
	 * @param key valor del parametro
	 */
	public AbstractSoapProxy(Class<E> clazz){
		this.clazz   = clazz;
	}

	/**
	 * Metodo que genera la conexion al WS
	 * a traves de las credenciales
	 */
	@PostConstruct
	public void doConnection(String endpoint, Integer readTimeOut, Integer connectTimeOut, String user, String password) {
		
	
		try{
			
			port = getService().getPort(clazz);
					
	    	Map<String,Object> context = ((BindingProvider)port).getRequestContext();
	    	context.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
	    	context.put(BindingProvider.USERNAME_PROPERTY,         user);
	    	context.put(BindingProvider.PASSWORD_PROPERTY,         password);
	    	context.put("javax.xml.ws.client.connectionTimeout",   connectTimeOut); 
	    	context.put("javax.xml.ws.client.receiveTimeout",      readTimeOut);	
		
	    	BindingProvider bindProv = (BindingProvider) port;
	    	java.util.List<Handler> handlers = bindProv.getBinding().getHandlerChain();
	    	handlers.add(new ServiceLogHandler());
	    	bindProv.getBinding().setHandlerChain(handlers);
	    	
	    	_log.info("Conexion correcta "+ clazz.toString());
	    	
		}catch(Exception e){
			_log.info("1 -Error al crear la conexion con : "+endpoint);
			_log.error(e);
		}
	}
	
	/**
     * Metodo que obtiene la referencia de la
     * conexion al WS
     * @return
     */
    public E getPort(){
        return port;
    }
    
    /**
     * Template que contiene la impl
     * del WS
     * @return
     */
    public abstract Service getService();
        
}
