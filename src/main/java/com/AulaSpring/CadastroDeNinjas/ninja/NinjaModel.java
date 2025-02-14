package com.AulaSpring.CadastroDeNinjas.ninja;

import jakarta.persistence.*;

@Entity // Transforma classe em entidade do DB
@Table(name = "tb_cadastro") // Criar tabela
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}
