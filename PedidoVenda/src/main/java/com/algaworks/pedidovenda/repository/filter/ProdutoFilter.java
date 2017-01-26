/*
 * @(#)ProdutoFilter.java
 * 
 * Copyright 2014-2014, Ricardo Rodrigues.
 * 
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */

package com.algaworks.pedidovenda.repository.filter;

import java.io.Serializable;

import com.algaworks.pedidovenda.util.annotation.SKU;

public class ProdutoFilter implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sku;

    private String nome;

    @SKU
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.toUpperCase();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
