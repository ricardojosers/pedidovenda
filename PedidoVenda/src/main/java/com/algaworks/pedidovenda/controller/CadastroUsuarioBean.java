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
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.algaworks.pedidovenda.model.Grupo;
import com.algaworks.pedidovenda.model.Usuario;

@Named
@ViewScoped
public class CadastroUsuarioBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Usuario usuario;
    
    private Grupo grupo;
    
    private List<Grupo> grupos;
    
    public CadastroUsuarioBean() {
        usuario = new Usuario();
        grupo = new Grupo();
        grupos = new ArrayList<>();
        
//        grupos.add("Auxiliares");
//        grupos.add("Vendedores");
    }
    
    public void salvar() {
        System.out.println("Inclusão de Usuário");
    }
    
    public void adicionarGrupo() {
        System.out.println("Inclusão de Grupo");
        usuario.getGrupos().add(grupo);
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Grupo getGrupo() {
        return grupo;
    }
    
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
    public List<Grupo> getGrupos() {
        return grupos;
    }
    
    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }
}
