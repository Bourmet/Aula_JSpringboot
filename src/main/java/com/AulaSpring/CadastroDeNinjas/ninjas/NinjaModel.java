package com.AulaSpring.CadastroDeNinjas.ninjas;

import com.AulaSpring.CadastroDeNinjas.missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity // Transforma classe em entidade do DB
@Table(name = "tb_cadastro") // Criar tabela
@NoArgsConstructor // Construtor vazio
@AllArgsConstructor
@Data //Criar getters e setters
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Column(unique = true)
    private String email;
    @Column(name = "img_url")
    private String imgUrl;
    private String rank;
    private int idade;

    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key
    private MissoesModel missoes;

}
