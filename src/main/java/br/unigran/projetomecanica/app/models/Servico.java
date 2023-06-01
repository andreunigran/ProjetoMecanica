/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.projetomecanica.app.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;

/**
 *
 * @author andre
 */
@Entity
public @Data class Servico implements Serializable {

    @OneToMany(mappedBy = "servico")
    private List<ItemOrcamento> itemOrcamentos;

    @OneToMany(mappedBy = "servico")
    private List<ItemServico> itemServicos;

    @OneToMany(mappedBy = "servico")
    private List<Orcamento> orcamentos;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String descricao;
    private Double preco;
    private Boolean concluido;
    @ManyToOne
    private Funcionario mecanico;
    @ManyToOne
    private Cliente cliente; 
}
