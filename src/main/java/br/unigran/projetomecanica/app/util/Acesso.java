/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.projetomecanica.app.util;

import br.unigran.projetomecanica.app.casosdeuso.Repository;
import br.unigran.projetomecanica.app.models.Usuario;
import java.awt.Component;
import java.util.Base64;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author andre
 */
public class Acesso {
    private static Usuario user;

    public static Usuario getUser() {
        return user;
    }

    public static void setUser(Usuario user) {
        Acesso.user = user;
    }
    public static void login(String usuario, char[] senha)throws SecurityException{
        if (!usuario.isEmpty() && !senha.toString().isEmpty()) {
//            user=(Usuario) Repository.findObject(Usuario.class, " and o.login='"
//                    + usuario + "' and o.senha ='" +new String(senha)+ "'");
        try{
            
        user=(Usuario) Repository.findObject(Usuario.class, " and o.login='"+usuario+"' and o.senha ='"+new String(senha)+"'");
        } catch(NoResultException ex) {
            throw new SecurityException("Senha errada");
        }
    }else   throw new SecurityException("Senha e senha em branco");
    }
    public static void temAcesso(Component c) throws SecurityException{
        
    }
    
    
}
