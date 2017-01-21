/*
 * @(#)JsfExceptionHandlerFactory.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.pedidovenda.util.jsf;

import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;


public class JsfExceptionHandlerFactory extends ExceptionHandlerFactory {
    
    private ExceptionHandlerFactory parent;
    
    public JsfExceptionHandlerFactory(ExceptionHandlerFactory parent) {
        this.parent = parent;
    }

    @Override
    public ExceptionHandler getExceptionHandler() {
        return new JsfExceptionHandler(parent.getExceptionHandler());
    }

}
