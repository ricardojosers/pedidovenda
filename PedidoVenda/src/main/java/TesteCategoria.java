import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.algaworks.pedidovenda.model.Categoria;

/*
 * @(#)TesteCategoria.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */

public class TesteCategoria {
    
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidoPU");
        EntityManager manager = factory.createEntityManager();
        
        EntityTransaction trx = manager.getTransaction();
        trx.begin();
        
//        List<String> catNomes = new ArrayList<>();
//        catNomes.add("Computadores");
//        catNomes.add("Notebooks");
//        catNomes.add("Tablets");
//        catNomes.add("Monitores");
//        catNomes.add("Impressoras");
//        catNomes.add("Acessórios");
//        
//        for(String string : catNomes) {
//            Categoria categoria = new Categoria();
//            categoria.setDescricao(string);
//            
//            manager.persist(categoria);            
//        }
        
        trx.commit();
    }
    
}
