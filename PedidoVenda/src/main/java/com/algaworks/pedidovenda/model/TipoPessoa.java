/*
 * @(#)TipoPessoa.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.pedidovenda.model;


public enum TipoPessoa {
    
    FISICA("Física"), JURIDICA("Jurídica");
    
    String nomePessoa;
    
    TipoPessoa() {
        
    }
    
    TipoPessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    
    public String getNomePessoa() {
        return nomePessoa;
    }
    
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    
}
