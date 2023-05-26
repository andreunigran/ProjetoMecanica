/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.projetomecanica.app.dao;

import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author andre
 */
public class DAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.unigran.projetomecanica.app_ProjetoMecanica_jar_1.0-SNAPSHOTPU");
    EntityManager em =emf.createEntityManager();
    EntityTransaction tx =em.getTransaction();
    
    public void salvar(Object o){
        tx.begin();
        em.merge(o);// inserir ou update
        tx.commit();
    }
    public void salvarI(Object o){
        tx.begin();
        em.persist(o);// inserir
        tx.commit();
    }
    public void remove(Object o){
        tx.begin();
        em.remove(o);
        tx.commit();
    }
    public List lista(Class c, String where){ 
        return  em.createQuery("select o from "+c.getName()+ " o "
                + "where 1=1 "+where).getResultList();
    }
  
    
     public List listaComParamentros(Class c, String where, Map<String,String> parametro){ 
        Query createQuery = em.createQuery("select o from "+c.getSimpleName()+ " o "
                + "where 1=1 "+where);

         for (Map.Entry<String,String> object : parametro.entrySet()) {
             createQuery.setParameter(object.getKey(),object.getValue());
         }
        
        return createQuery.getResultList();
    }
    
      public Object getObjeto(Class c, String where){ 
        return  em.createQuery("select o from "+c.getSimpleName()+ " o "
                + "where 1=1 "+where).getSingleResult();
    }
    
}
