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
import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.pedidovenda.model.Grupo;
import com.algaworks.pedidovenda.model.Usuario;
import com.algaworks.pedidovenda.repository.Grupos;
import com.algaworks.pedidovenda.service.CadastroUsuarioService;
import com.algaworks.pedidovenda.util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroUsuarioBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private CadastroUsuarioService cadastroUsuarioService;
    
    @Inject
    private Grupos grupos;
    
    private Usuario usuario;
    private List<Grupo> gruposUsuario;
    private Grupo novoGrupo;
    private Grupo grupoASerRemovido;
    
    public CadastroUsuarioBean() {
        limpar();
    }
    
    public void salvar() {
        this.usuario = cadastroUsuarioService.salvar(usuario);
        FacesUtil.addInfoMessage("Usuário salvo com sucesso!");
        limpar();
    }
    
    private void limpar() {
        usuario = new Usuario();
        gruposUsuario = new ArrayList<>();
    }
    
    public void adicionarGrupo() {
        usuario.getGrupos().add(novoGrupo);
    }
    
    public void removerGrupo() {
        usuario.getGrupos().remove(grupoASerRemovido);
    }
    
    public void inicializar() {
        if(FacesUtil.isNotPostback()) {
            gruposUsuario = grupos.grupos();
        }
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public List<Grupo> getGruposUsuario() {
        return gruposUsuario;
    }
    
    public Grupo getNovoGrupo() {
        return novoGrupo;
    }
    
    public void setNovoGrupo(Grupo novoGrupo) {
        this.novoGrupo = novoGrupo;
    }
    
    public Grupo getGrupoASerRemovido() {
        return grupoASerRemovido;
    }
    
    public void setGrupoASerRemovido(Grupo grupoASerRemovido) {
        this.grupoASerRemovido = grupoASerRemovido;
    }

}
