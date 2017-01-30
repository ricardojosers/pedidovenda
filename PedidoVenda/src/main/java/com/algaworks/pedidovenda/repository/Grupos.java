/*
 * @(#)Grupos.java
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

import com.algaworks.pedidovenda.model.Grupo;

public class Grupos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private EntityManager manager;

    public List<Grupo> grupos() {
        return manager.createQuery("from Grupo", Grupo.class).getResultList();
    }

//    public List<Grupo> gruposDo(Usuario usuario) {
//        String jpql = "select g from Usuario u join u.grupos g where u.id = :id";
//
//        return manager.createQuery(jpql, Grupo.class)
//            .setParameter("id", usuario.getId())
//            .getResultList();
//    }

    public Object porId(Long id) {
        return manager.find(Grupo.class, id);
    }

}
