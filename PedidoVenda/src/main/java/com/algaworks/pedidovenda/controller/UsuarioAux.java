/*
 * @(#)Usuario.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.pedidovenda.controller;


public class UsuarioAux {
    
    private String nome;
    private String email;
    
    public UsuarioAux(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
