/*
 * @(#)ProdutoConverter.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.pedidovenda.util.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.algaworks.pedidovenda.model.Produto;
import com.algaworks.pedidovenda.repository.Produtos;
import com.algaworks.pedidovenda.util.cdi.CDIServiceLocator;

@FacesConverter(forClass=Produto.class)
public class ProdutoConverter implements Converter {
    
    private Produtos produtos;
    
    public ProdutoConverter() {
        produtos = CDIServiceLocator.getBean(Produtos.class);
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component,
        String value) {
        Produto retorno = null;
        
        if(value != null) {
            Long id = new Long(value);
            retorno = produtos.porId(id);
        }
        
        return retorno;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component,
        Object value) {
        if(value != null) {
            Produto produto = (Produto) value;
            return produto.getId() == null ? null : produto.getId().toString();
        }

        return "";
    }

}
