package com.AulaSpring.CadastroDeNinjas.missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class  MissoesController {

    @GetMapping("/listar")
    public String listarMissao(){
        return "ok";
    }

    @PostMapping("/criar")
    public String criarMissao(){
        return "ok";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "ok";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "ok";
    }
}
