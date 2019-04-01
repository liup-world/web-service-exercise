package com.bobsystem.ws.webservice;

import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class HeaderHandler
    implements SOAPHandler<SOAPMessageContext> {

    public boolean handleMessage(SOAPMessageContext smc) {

        Boolean outbound = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outbound) {
            try {
                //SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
                //SOAPHeader header = envelope.addHeader();
                //
                //SOAPElement security = header.addChildElement(
                //    "Security", "wsse",
                //    "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
                //
                //SOAPElement usernameToken = security.addChildElement("UsernameToken", "wsse");
                //usernameToken.addAttribute(
                //    new QName("xmlns:wsu"),
                //    "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
                //
                //SOAPElement username = usernameToken.addChildElement("Username", "wsse");
                //username.addTextNode("TestUser");
                //
                //SOAPElement password = usernameToken.addChildElement("Password", "wsse");
                //password.setAttribute(
                //    "Type",
                //    "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
                //password.addTextNode("TestPassword");
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        try {
            // This handler does nothing with the response from the Web Service so
            // we just print out the SOAP message.
            SOAPMessage message = smc.getMessage();
            message.writeTo(System.out);
            System.out.println();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        return outbound;
    }

    public Set<QName> getHeaders() {

        // throw new UnsupportedOperationException("Not supported yet.");
        return null;
    }

    public boolean handleFault(SOAPMessageContext context) {

        // throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }

    public void close(MessageContext context) {
        // throw new UnsupportedOperationException("Not supported yet.");
    }
}
