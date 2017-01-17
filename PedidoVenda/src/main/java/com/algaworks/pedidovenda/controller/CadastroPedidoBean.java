/*
 * @(#)CadastroPedidoBean.java
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
public class CadastroPedidoBean {

    private List<Integer> itens;
    
    public CadastroPedidoBean() {
        itens = new ArrayList<>();
        itens.add(1);
    }
    
    public List<Integer> getItens() {
        return itens;
    }
}
