/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.projetomecanica.app.util;

import br.unigran.projetomecanica.app.padroes.PadraoListar;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andre
 */
public class Util {
    public static DefaultTableModel atualizaTabela(List lista, PadraoListar padrao){
        List<PadraoListar> dados=lista;
        String columnNames[] = padrao.getTitulo();
        Object[][] data = new Object[dados.size()][columnNames.length];
        for(int i=0;i<dados.size();i++){        
            data[i]=dados.get(i).getDados();
        }
        DefaultTableModel dataModel = 
                new DefaultTableModel(data, columnNames);
        return dataModel;
    }
    public static String getmd5(String s) throws NoSuchAlgorithmException, UnsupportedEncodingException{
       MessageDigest m=MessageDigest.getInstance("MD5");
        byte messageDigest[] = m.digest(s.getBytes("UTF-8"));

      return messageDigest.toString();
    }
}
