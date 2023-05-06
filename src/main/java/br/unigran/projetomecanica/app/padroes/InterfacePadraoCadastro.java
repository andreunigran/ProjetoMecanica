/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.projetomecanica.app.padroes;

import javax.swing.JPanel;

/**
 *
 * @author andre
 */
public abstract class InterfacePadraoCadastro extends JPanel{
    protected Object objeto;
    public abstract Object getObjeto();   
    public  void setObjeto(Object o){
        objeto=o;
    };   
}
