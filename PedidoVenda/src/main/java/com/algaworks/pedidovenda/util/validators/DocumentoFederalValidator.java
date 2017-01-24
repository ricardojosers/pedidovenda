/*
 * @(#)DocumentoFederalValidator.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.pedidovenda.util.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.algaworks.pedidovenda.util.annotation.DocumentoFederal;


public class DocumentoFederalValidator implements ConstraintValidator<DocumentoFederal, String> {

    @Override
    public void initialize(DocumentoFederal constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean retorno = false;
        System.out.println(value);
        if (value.length() == 11) {
            retorno = CNP.isValidCPF(value);
        } else {
            retorno = CNP.isValidCNPJ(value);
        }
        return retorno;
    }

}
