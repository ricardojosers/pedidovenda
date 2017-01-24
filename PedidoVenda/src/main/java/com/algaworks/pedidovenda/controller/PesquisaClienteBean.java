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

@Named
@ViewScoped
public class PesquisaClienteBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private List<ClienteAux> clientes;
    
    public PesquisaClienteBean() {
        clientes = new ArrayList<>();
        clientes.add(new ClienteAux("Supermercado João das Couves Ltda", "Jurídica", "02.493.738/0001-83"));
        clientes.add(new ClienteAux("Maria Conceição da Abadia", "Física", "045.938.553-99"));
        clientes.add(new ClienteAux("Supermercado Preço Bom Ltda", "Jurídica", "08.111.344/0001-12"));
    }
    
    public List<ClienteAux> getClientes() {
        return clientes;
    }
}
