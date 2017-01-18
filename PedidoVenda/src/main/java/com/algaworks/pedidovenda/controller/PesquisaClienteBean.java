/*
 * @(#)PesquisaClienteBean.java
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
public class PesquisaClienteBean {
    
    private List<Cliente> clientes;
    
    public PesquisaClienteBean() {
        clientes = new ArrayList<>();
        clientes.add(new Cliente("Supermercado João das Couves Ltda", "Jurídica", "02.493.738/0001-83"));
        clientes.add(new Cliente("Maria Conceição da Abadia", "Física", "045.938.553-99"));
        clientes.add(new Cliente("Supermercado Preço Bom Ltda", "Jurídica", "08.111.344/0001-12"));
    }
    
    public List<Cliente> getClientes() {
        return clientes;
    }
}
