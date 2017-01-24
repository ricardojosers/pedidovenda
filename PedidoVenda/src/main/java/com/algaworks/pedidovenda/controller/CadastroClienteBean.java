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

import com.algaworks.pedidovenda.model.Cliente;
import com.algaworks.pedidovenda.model.Endereco;
import com.algaworks.pedidovenda.model.TipoPessoa;

@Named
@ViewScoped
public class CadastroClienteBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Cliente cliente;
    
    private TipoPessoa tipoPessoa;
    private String labelDocumento;
    private String maskDocumento;
    
    private Endereco endereco;
    
    private List<Endereco> enderecos;
    
//    private List<com.algaworks.pedidovenda.controller.Cliente> clientes;
    
    public CadastroClienteBean() {
        cliente = new Cliente();
        endereco = new Endereco();
        enderecos = new ArrayList<>();
        tipoPessoa = TipoPessoa.FISICA;
        labelDocumento = "CPF";
        maskDocumento = "999.999.999-99";
//        clientes = new ArrayList<>();
//        Endereco endereco1 = new Endereco("Rua das Pedras Grandes Azuis", "1234", "Ap 1022", "38499-533", "Uberlândia", "MG");
//        Endereco endereco2 = new Endereco("Av. Rondon Pacheco", "455", "Sala 923", "38408-111", "Uberlândia", "MG");
//        List<Endereco> enderecos = new ArrayList<>();
//        enderecos.add(endereco1);
//        enderecos.add(endereco2);
//        clientes.add(new com.algaworks.pedidovenda.controller.Cliente("", "", "", "", enderecos));
    }
    
    public void salvar() {
        
    }
    
    public void adicionarEndereco() {
        cliente.getEnderecos().add(endereco);
    }
    
    public void ajustaTipoDocumento() {
        if(TipoPessoa.JURIDICA.equals(tipoPessoa)) {
            this.tipoPessoa = TipoPessoa.JURIDICA;
            this.labelDocumento = "CNPJ";
            this.maskDocumento = "99.999.999/999-99";
        } else {
            this.tipoPessoa = TipoPessoa.FISICA;
            this.labelDocumento = "CPF";
            this.maskDocumento = "999.999.999-99";
        }
    }
    
    public TipoPessoa[] getTiposPessoas() {
        return TipoPessoa.values();
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        this.cliente.setTipo(tipoPessoa);
    }
    
    public TipoPessoa getTipoPessoa() {
//        return tipoPessoa;
        return cliente.getTipo();
    }
    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
        cliente.setTipo(tipoPessoa);
    }
    
    public String getLabelDocumento() {
        return labelDocumento;
    }
    public void setLabelDocumento(String labelDocumento) {
        this.labelDocumento = labelDocumento;
    }
    public String getMaskDocumento() {
        return maskDocumento;
    }
    public void setMaskDocumento(String maskDocumento) {
        this.maskDocumento = maskDocumento;
    } 

    
    public List<Endereco> getEnderecos() {
        return enderecos;
    }
    
    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

//    public List<com.algaworks.pedidovenda.controller.Cliente> getClientes() {
//        return clientes;
//    }
//    
//    public List<Endereco> getEnderecos() {
//        return clientes.get(0).getEnderecos();
//    }
}
