/*
 * @(#)ClienteMB.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.pedidovenda.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class ClienteMB implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String tipo;
    private String labelDocumento;
    private String maskDocumento;
    
    public ClienteMB() {
        this.tipo = "fisica";
        this.labelDocumento = "CPF";
        this.maskDocumento = "999.999.999-99";
    }
    
    public void ajustaTipoDocumento() {
        if("juridica".equals(tipo)) {
            this.tipo = "juridica";
            this.labelDocumento = "CNPJ";
            this.maskDocumento = "99.999.999/999-99";
        } else {
            this.tipo = "fisica";
            this.labelDocumento = "CPF";
            this.maskDocumento = "999.999.999-99";
        }
    }
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getLabelDocumento() {
        return labelDocumento;
    }
    public void setLabelDocumento(String labelDocumento) {
        this.labelDocumento = labelDocumento;
    }
    public String getMaskDocumento() {
        return maskDocumento;
    }
    public void setMaskDocumento(String maskDocumento) {
        this.maskDocumento = maskDocumento;
    } 

}
