/*
 * @(#)PesquisaUsuariosBean.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named
@ViewScoped
public class PesquisaUsuariosBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private List<UsuarioAux> usuarios;
    
    public PesquisaUsuariosBean() {
        usuarios = new ArrayList<>();
        usuarios.add(new UsuarioAux("João das Couves", "joaodas_couves42@hotmail.com"));
        usuarios.add(new UsuarioAux("Maria Abadia das Couves", "mariaabadiadascouves2013@gmail.com"));
        usuarios.add(new UsuarioAux("João das Couves Júnior", "junior_couves_joao@yahoo.com.br"));
    }
    
    public List<UsuarioAux> getUsuarios() {
        return usuarios;
    }
}
