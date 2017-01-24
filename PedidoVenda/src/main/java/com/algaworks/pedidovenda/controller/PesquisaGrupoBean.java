/*
 * @(#)PesquisaClienteBean.java
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

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.algaworks.pedidovenda.model.Grupo;

@Named
@ViewScoped
public class PesquisaGrupoBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private List<Grupo> grupos;
    
    public PesquisaGrupoBean() {
        grupos = new ArrayList<>();
    }
    
    public List<Grupo> getGrupos() {
        return grupos;
    }
}
