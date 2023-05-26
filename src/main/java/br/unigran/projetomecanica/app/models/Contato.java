/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.projetomecanica.app.models;

import br.unigran.projetomecanica.app.padroes.PadraoListar;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

/**
 *
 * @author andre
 */
@Entity
public @Data class Contato implements Serializable,PadraoListar {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Tipo tipo;
    @Column(length = 100)
    private String descricao;
    @ManyToOne
    private Cliente cliente;

    @Override
    public String[] getTitulo() {
        return new String[]{"Tipo","Descrição"};
    }

    @Override
    public Object[] getDados() {
        return new Object[]{getTipo(),getDescricao()};
    }
     @Override
    public String pesquisar(String txt) {
        return "";
    }
    
}
