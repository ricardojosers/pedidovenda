/*
 * @(#)Categorias.java
 * 
 * Copyright 2014-2014, Ricardo Rodrigues.
 * 
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */

package com.algaworks.pedidovenda.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.algaworks.pedidovenda.model.Categoria;

public class Categorias implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private EntityManager manager;

    public Categoria porId(Long id) {
        return manager.find(Categoria.class, id);
    }

    public List<Categoria> raizes() {
        return manager.createQuery("from Categoria where categoriaPai is null",
            Categoria.class).getResultList();
    }
    
    public List<Categoria> subcategoriaDe(Categoria categoriaPai) {
        return manager.createQuery("from Categoria where categoriaPai = :raiz",
            Categoria.class)
            .setParameter("raiz", categoriaPai)
            .getResultList();
    }

}
