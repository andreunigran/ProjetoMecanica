/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.projetomecanica.app.models;

import br.unigran.projetomecanica.app.padroes.PadraoListar;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Cleanup;
import lombok.Data;

/**
 *
 * @author andre
 */
@Entity
public @Data  class Cliente implements Serializable,PadraoListar {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 150)
    private String nome;
    @Column(length = 150)
    private String email;
    @OneToMany(mappedBy = "cliente")
    private List<Contato> contatos;

    @OneToMany(mappedBy = "cliente")
    private List<Servico> servicos;
    
    public Cliente(){
        contatos= new LinkedList<>();
    }
    
        @Override
    public String[] getTitulo() {
        return new String[]{"Nome"};
    }

    @Override
    public Object[] getDados() {
        return new Object[]{getNome()};
    }
        @Override
    public String pesquisar(String txt) {
        return "and upper(o.nome) like upper('%"+txt+"%')";
    }
}
