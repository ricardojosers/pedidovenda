/*
 * @(#)CadastroClienteBean.java
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
public class CadastroClienteBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private List<Cliente> clientes;
    
    public CadastroClienteBean() {
        clientes = new ArrayList<>();
        Endereco endereco1 = new Endereco("Rua das Pedras Grandes Azuis", "1234", "Ap 1022", "38499-533", "Uberlândia", "MG");
        Endereco endereco2 = new Endereco("Av. Rondon Pacheco", "455", "Sala 923", "38408-111", "Uberlândia", "MG");
        List<Endereco> enderecos = new ArrayList<>();
        enderecos.add(endereco1);
        enderecos.add(endereco2);
        clientes.add(new Cliente("", "", "", "", enderecos));
    }
    
    public List<Cliente> getClientes() {
        return clientes;
    }
    
    public List<Endereco> getEnderecos() {
        return clientes.get(0).getEnderecos();
    }
}
