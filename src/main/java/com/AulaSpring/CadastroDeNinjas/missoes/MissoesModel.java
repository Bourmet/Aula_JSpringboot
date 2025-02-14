package com.AulaSpring.CadastroDeNinjas.missoes;

import com.AulaSpring.CadastroDeNinjas.ninjas.NinjaModel;
import jakarta.persistence.*;
import java.util.List;

@Entity // Transforma classe em entidade do DB
@Table(name = "tb_missoes") // Criar tabela
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany
    private List<NinjaModel> ninja;
}
