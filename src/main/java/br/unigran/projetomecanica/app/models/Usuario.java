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
import javax.persistence.OneToOne;
import lombok.Data;

/**
 *
 * @author andre
 */
@Entity
public @Data class Usuario implements Serializable,PadraoListar {

    @OneToOne(mappedBy = "usuario")
    private Funcionario funcionario;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length = 15)
    private String login;
    @Column(length = 15)
    private String senha;

    @Override
    public String[] getTitulo() {
        return new String[]{"Login","Funcionario"};
    }

    @Override
    public Object[] getDados() {
        return new Object[]{getLogin(),
            getFuncionario()!=null?
            getFuncionario().getNome():""};
    }
    
}
