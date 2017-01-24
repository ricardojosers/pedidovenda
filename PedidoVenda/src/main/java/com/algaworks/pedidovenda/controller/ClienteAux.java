/*
 * @(#)Cliente.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.pedidovenda.controller;

import java.util.List;


public class ClienteAux {
    
    private String nome;
    private String tipoDocumento;
    private String numeroDocumento;
    private String email;
    private List<EnderecoAux> enderecos;
    
    public ClienteAux(String nome, String tipoDocumento, String numeroDocumento) {
        this.nome = nome;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }
    
    public ClienteAux(String nome, String tipoDocumento, String numeroDocumento, String email, List<EnderecoAux> enderecos) {
        this(nome, tipoDocumento, numeroDocumento);
        this.email = email;
        this.enderecos = enderecos;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<EnderecoAux> getEnderecos() {
        return enderecos;
    }
    public void setEnderecos(List<EnderecoAux> enderecos) {
        this.enderecos = enderecos;
    }
}
