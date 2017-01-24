/*
 * @(#)DocumentoFederal.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.pedidovenda.util.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.algaworks.pedidovenda.util.validators.DocumentoFederalValidator;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy={DocumentoFederalValidator.class})
public @interface DocumentoFederal {

    String message() default "{Conteúdo Inválido}";
    
    Class<?>[] groups() default {};
    
    Class<? extends Payload>[] payload() default {};
}
