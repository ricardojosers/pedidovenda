/*
 * @(#)CadastroUsuarioBean.java
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

import com.algaworks.pedidovenda.model.Grupo;

@Named
@ViewScoped
public class CadastroGrupoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Grupo grupo;
    
    public CadastroGrupoBean() {
        grupo = new Grupo();
    }
    
    public void salvar() {
        System.out.println("Inclusão de Grupo");
    }
    
    public Grupo getGrupo() {
        return grupo;
    }
    
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
}
