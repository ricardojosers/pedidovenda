/*
 * @(#)NegocioException.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.pedidovenda.service;


public class NegocioException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;

    public NegocioException(String msg) {
        super(msg);
    }

}
