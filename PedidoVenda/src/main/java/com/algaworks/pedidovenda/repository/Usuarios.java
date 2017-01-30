/*
 * @(#)Usuarios.java
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
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.algaworks.pedidovenda.model.Usuario;
import com.algaworks.pedidovenda.repository.filter.UsuarioFilter;
import com.algaworks.pedidovenda.service.NegocioException;
import com.algaworks.pedidovenda.util.annotation.Transactional;

public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private EntityManager manager;

    public Usuario guardar(Usuario usuario) {
        return manager.merge(usuario);
    }

    public Usuario porEmail(String email) {
        try {
            return manager
                .createQuery("from Usuario where upper(email) = :email",
                    Usuario.class)
                    .setParameter("email", email.toUpperCase())
                    .getSingleResult();        
        }
        catch(NoResultException e) {
            throw new NegocioException("Sem resultado para o e-mail informado");
        }
    }

    public Usuario porId(Long id) {
        return manager.find(Usuario.class, id);
    }

    @Transactional
    public void remover(Usuario usuario) {
        try {
            usuario = porId(usuario.getId());
            manager.remove(usuario);
            manager.flush();
        }
        catch(PersistenceException e) {
            throw new NegocioException("Usuário não pode ser excluído.");
        }
    }

    @SuppressWarnings({ "unchecked", "deprecation" })
    public List<Usuario> filtrados(UsuarioFilter filtro) {
        Session session = (Session) manager;
        Criteria criteria = session.createCriteria(Usuario.class);
        
        if(StringUtils.isNotBlank(filtro.getNome())) {
            criteria.add(Restrictions.ilike("nome", filtro.getNome(), MatchMode.ANYWHERE));
        }
        
        if(StringUtils.isNotBlank(filtro.getEmail())) {
            criteria.add(Restrictions.ilike("email", filtro.getEmail(), MatchMode.ANYWHERE));
        }
        
        return criteria.addOrder(Order.asc("nome")).list();
    }
}
