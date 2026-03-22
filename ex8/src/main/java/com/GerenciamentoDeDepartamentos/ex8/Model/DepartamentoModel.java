package com.GerenciamentoDeDepartamentos.ex8.Model;

import jakarta.persistence.*;

@Entity(name = "Departamento")
@Table(name = "tb_departamento")
public class DepartamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Requisito 1

    @Column(name = "nome_do_departamento")
    private String nome;


    @Column(name = "predio_localizacao")
    private String localizacao;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
