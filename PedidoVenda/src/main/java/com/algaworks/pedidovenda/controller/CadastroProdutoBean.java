/*
 * @(#)CadastroProdutoBean.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.pedidovenda.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.algaworks.pedidovenda.model.Produto;

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Produto produto;
    
    public CadastroProdutoBean() {
        produto = new Produto();
    }

    public void salvar() {
//        throw new RuntimeException("Teste de exceção.");
        
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    

}
