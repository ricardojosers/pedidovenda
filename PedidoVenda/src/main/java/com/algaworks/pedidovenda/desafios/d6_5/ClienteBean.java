/*
 * @(#)ClienteBean.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.pedidovenda.desafios.d6_5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ClienteBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private List<Cliente> clientes;
    private Cliente cliente;
//    private Cliente clienteSelecionado;
    
    public ClienteBean() {
        clientes = new ArrayList<>();
        cliente =  new Cliente();
//        clienteSelecionado = new Cliente();
    }
    
    public void incluirCliente() {
        if(cliente == null) {
            cliente = new Cliente();
        }
        clientes.add(cliente);
        cliente = null;
    }
    
    public void excluirCliente() {
//        clientes.remove(clienteSelecionado);
        clientes.remove(this.cliente);
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public List<Cliente> getClientes() {
        return clientes;
    } 
    
//    public void setClienteSelecionado(Cliente clienteSelecionado) {
//        this.clienteSelecionado = clienteSelecionado;
//    }
//    
//    public Cliente getClienteSelecionado() {
//        return clienteSelecionado;
//    }
}
