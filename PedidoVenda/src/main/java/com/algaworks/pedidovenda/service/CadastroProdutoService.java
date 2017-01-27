/*
 * @(#)CadastroProdutoService.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.pedidovenda.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.algaworks.pedidovenda.model.Produto;
import com.algaworks.pedidovenda.repository.Produtos;
import com.algaworks.pedidovenda.util.annotation.Transactional;


public class CadastroProdutoService implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private Produtos produtos;
    
    @Transactional
    public Produto salvar(Produto produto) {
        Produto produtoExistente = produtos.porSku(produto.getSku());
        
        if(produtoExistente != null && !produtoExistente.equals(produto))
            throw new NegocioException("Já existe um produto com o sku informado.");
        
        return produtos.guardar(produto);
    }
    
}
