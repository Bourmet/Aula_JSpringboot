package com.AulaSpring.CadastroDeNinjas.ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping //Definir rota
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas") //Retorna algo por essa rota
    public  String boasVindas(){
        return "1° msg";
    }

    //FAMOSO CRUDzão da massa!!
    //Add ninja (CREATE)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }

    //Mostrar ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> mostrarNinjas(){
        return ninjaService.mostrarNinjas();
    }
    //Mostrar ninja por id
    @GetMapping("/listar/{id}")
    public NinjaModel listarPorId(@PathVariable Long id){
        return ninjaService.listarPorId(id);
    }
    //Alterar dados dos ninjas (UPDATE)
    @PutMapping("/atualizar/{id}")
    //Não altera pontualmente
    public NinjaModel atualizarDados(@PathVariable Long id,@RequestBody NinjaModel ninjaAtualizado){

        return ninjaService.atualizarDados(id, ninjaAtualizado);
    }

    //Del ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinja(@PathVariable Long id){
        ninjaService.deletarNinja(id);
    }
}
