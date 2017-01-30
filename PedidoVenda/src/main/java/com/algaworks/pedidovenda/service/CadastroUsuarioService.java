/*
 * @(#)CadastroUsuarioService.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.pedidovenda.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.algaworks.pedidovenda.model.Usuario;
import com.algaworks.pedidovenda.repository.Usuarios;
import com.algaworks.pedidovenda.util.annotation.Transactional;


public class CadastroUsuarioService implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private Usuarios usuarios;
    
    @Transactional
    public Usuario salvar(Usuario usuario) {
        Usuario usuarioExistente = usuarios.porEmail(usuario.getEmail());
        
        if(usuarioExistente != null && !usuarioExistente.equals(usuario))
            throw new NegocioException("Já existe um usuário com o e-mail informado.");

        return usuarios.guardar(usuario);
    }

}
