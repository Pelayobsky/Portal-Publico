package mx.movistar.col.lead.business.ws;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class ServiceLogHandler implements SOAPHandler<SOAPMessageContext> {

	private static final Log _log = LogFactoryUtil.getLog(ServiceLogHandler.class);
    
	@Override
	public Set<QName> getHeaders() {		
		return Collections.EMPTY_SET;
	}

	@Override
	public void close(MessageContext arg0) {
	}

	@Override
	public boolean handleFault(SOAPMessageContext arg0) {
		return true;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext arg0) {
		SOAPMessage message= arg0.getMessage();
		boolean isOutboundMessage=  (Boolean)arg0.get (MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if(isOutboundMessage){
			_log.debug("OUTBOUND MESSAGE");
			
		}else{
			_log.debug("INBOUND MESSAGE");
		}
		try {
			
			if(_log.isDebugEnabled()) {
				ByteArrayOutputStream stream = new ByteArrayOutputStream();
				message.writeTo(stream);
				String mensaje = new String(stream.toByteArray(), "utf-8");
				_log.debug(mensaje);
			}
			
		} catch (Exception e) {
			_log.error(e);
		} 
		
		return true;
	}
}