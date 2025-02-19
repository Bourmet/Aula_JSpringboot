package com.AulaSpring.CadastroDeNinjas.missoes;

import com.AulaSpring.CadastroDeNinjas.ninjas.NinjaModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany
    //Caso de loop de serialização pois aqui gera loop use @JsonIgnore
    @JsonIgnore
    private List<NinjaModel> ninja;
}
