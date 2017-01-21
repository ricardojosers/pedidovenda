/*
 * @(#)CadastroProdutoBean.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.pedidovenda.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class CadastroProdutoBean {
    
    public void salvar() {
        throw new RuntimeException("Teste de exceção.");
    }

}
