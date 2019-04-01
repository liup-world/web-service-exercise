package com.bobsystem.ws.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class HeaderHandlerResolver
    implements HandlerResolver {

    public List<Handler> getHandlerChain(PortInfo portInfo) {

        List<Handler> chain = new ArrayList<Handler>();

        HeaderHandler handler = new HeaderHandler();
        chain.add(handler);

        return chain;
    }
}