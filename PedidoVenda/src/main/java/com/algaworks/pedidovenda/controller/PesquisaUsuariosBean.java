/*
 * @(#)PesquisaUsuariosBean.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaUsuariosBean {
    
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
