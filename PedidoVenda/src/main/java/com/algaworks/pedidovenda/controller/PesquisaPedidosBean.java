/*
 * @(#)PesquisaPedidosBean.java
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

@Named
@ViewScoped
public class PesquisaPedidosBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Integer> pedidosFiltrados;
    
    public PesquisaPedidosBean() {
        pedidosFiltrados = new ArrayList<Integer>();
        for(int i = 0; i < 50; i++) {
            pedidosFiltrados.add(i);
        }
    }
    
    public List<Integer> getPedidosFiltrados() {
        return pedidosFiltrados;
    }
}
