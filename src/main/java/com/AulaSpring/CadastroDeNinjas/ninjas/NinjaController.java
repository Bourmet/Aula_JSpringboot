package com.AulaSpring.CadastroDeNinjas.ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping //Definir rota
public class NinjaController {

    @GetMapping("/boasvindas") //Retorna algo por essa rota
    public  String boasVindas(){
        return "1° msg";
    }
}
