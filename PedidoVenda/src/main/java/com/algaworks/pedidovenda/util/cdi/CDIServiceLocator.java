/*
 * @(#)CDIServiceLocator.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.pedidovenda.util.cdi;

import java.util.Set;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.naming.InitialContext;


public class CDIServiceLocator {
    
    private static BeanManager getBeanManager() {
        try {
            InitialContext initialContext = new InitialContext();
            return (BeanManager)initialContext.lookup("java:comp/env/BeanManager");
        }
        catch(Exception e) {
            throw new RuntimeException("Não pode encontrar BeanManager no JNDI");
        }
    }
    
    @SuppressWarnings("unchecked")
    public static <T> T getBean(Class<T> clazz) {
        BeanManager bm = getBeanManager();
        Set<Bean<?>> beans = bm.getBeans(clazz);
        
        if(beans == null || beans.isEmpty()) {
            return null;
        }
        
        Bean<?> bean = beans.iterator().next();
        
        CreationalContext<?> ctx = bm.createCreationalContext(bean);
        T o = (T)bm.getReference(bean, clazz, ctx);
        
        return o;
    }

}
