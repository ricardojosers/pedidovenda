/*
 * @(#)JsfExceptionHandler.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.pedidovenda.util.jsf;

import java.io.IOException;
import java.util.Iterator;

import javax.faces.FacesException;
import javax.faces.application.ViewExpiredException;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.ExceptionQueuedEventContext;


public class JsfExceptionHandler extends ExceptionHandlerWrapper {
    
    private ExceptionHandler wrapped;
    
    public JsfExceptionHandler(ExceptionHandler wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public ExceptionHandler getWrapped() {
        return this.wrapped;
    }
    
    @Override
    public void handle() throws FacesException {
        Iterator<ExceptionQueuedEvent> events = getUnhandledExceptionQueuedEvents().iterator();
        
        while(events.hasNext()) {
            ExceptionQueuedEvent event = events.next();
            ExceptionQueuedEventContext context = (ExceptionQueuedEventContext)event.getSource();
            
            Throwable exception = context.getException();
            
            boolean handled = false;
            
            try {
                if(exception instanceof ViewExpiredException) {
                    handled = true;
                    redirect("/");
                }
            }
            finally {
                if(handled)
                    events.remove();
            }
        }
        
        getWrapped().handle();
    }

    private void redirect(String page) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        String contextPath = externalContext.getRequestContextPath();
        
        try {
            externalContext.redirect(contextPath + page);
            facesContext.responseComplete();
        }
        catch(IOException e) {
            throw new FacesException(e);
        }
    }

}
