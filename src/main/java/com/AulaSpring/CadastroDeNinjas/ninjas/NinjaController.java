package com.AulaSpring.CadastroDeNinjas.ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping //Definir rota
public class NinjaController {

    @GetMapping("/boasvindas") //Retorna algo por essa rota
    public  String boasVindas(){
        return "1° msg";
    }

    //FAMOSO CRUDzão da massa!!
    //Add ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "ok";
    }
    //Mostrar ninjas (READ)
    @GetMapping("/todos")
    public String mostrarNinja(){
        return "ok";
    }

    //Mostrar ninja por id

    //Alterar dados dos ninjas (UPDATE)
    @PutMapping("/atualizar")
    public String atualizarNinja(){
        return "ok";
    }
    //Del ninja (DELETE)
    @DeleteMapping("/deletar")
    public String deletarNinja(){
        return "ok";
    }
}
