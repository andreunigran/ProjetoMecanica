/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.projetomecanica.app.models;

import br.unigran.projetomecanica.app.padroes.PadraoListar;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

/**
 *
 * @author andre
 */
@Entity
public @Data class Cargo implements Serializable ,PadraoListar{

    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50)
    private String nome;
    @Column(length = 150)
    private String descricao; 

    @Override
    public String[] getTitulo() {
    return new String[]{"Nome","Descricao"};
    
    }

    @Override
    public Object[] getDados() {
        return new Object[]{getNome(),getDescricao()};
    }
}
