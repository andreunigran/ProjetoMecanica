/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.projetomecanica.app.casosdeuso;

import br.unigran.projetomecanica.app.dao.DAO;
import java.util.List;

/**
 *
 * @author andre
 */
public abstract class Repository {
    private static final DAO dao;
   
    static{        
        dao = new DAO();
    }
    
    public static void salvar(Object objeto){
        dao.salvar(objeto);
    }
    public static void remover(Object objeto){
        dao.remove(objeto);
    }
     public static List Listar(Class classe, String where){
        return dao.lista(classe, where);
    }
}
