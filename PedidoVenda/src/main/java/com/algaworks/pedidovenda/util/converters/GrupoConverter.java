/*
 * @(#)GrupoConverter.java
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

import com.algaworks.pedidovenda.model.Grupo;
import com.algaworks.pedidovenda.repository.Grupos;
import com.algaworks.pedidovenda.util.cdi.CDIServiceLocator;

@FacesConverter(forClass=Grupo.class)
public class GrupoConverter implements Converter {
    
    private Grupos grupos;
    
    public GrupoConverter() {
        grupos = CDIServiceLocator.getBean(Grupos.class);
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component,
        String value) {
        Grupo retorno = null;
        
        if(value != null) {
            Long id = new Long(value);
            return grupos.porId(id);
        }
        
        return retorno;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component,
        Object value) {
        if(value != null) {
            Grupo grupo = (Grupo)value;
            return grupo.getId() == null ? null : grupo.getId().toString();            
        }
        
        return "";
    }

}
