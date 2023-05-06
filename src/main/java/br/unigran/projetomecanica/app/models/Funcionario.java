/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.projetomecanica.app.models;

import br.unigran.projetomecanica.app.padroes.PadraoListar;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import lombok.Data;
import lombok.Getter;

/**
 *
 * @author andre
 */
@Entity
@Data
public class Funcionario implements Serializable,PadraoListar {


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 150)
     private String nome;
    @Column(length = 100)
    private String nomeMae;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    @ManyToOne
    private Cargo cargo;
    @OneToOne
    private Usuario usuario;

    @Override
    public String[] getTitulo() {
        return new String[]{"Nome"};
    }

    @Override
    public Object[] getDados() {
        return new Object[]{getNome()};
    }
}
