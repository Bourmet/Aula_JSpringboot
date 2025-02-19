package com.AulaSpring.CadastroDeNinjas.ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    /*Comunicação entre Service e Repository,
    isso é uma injeção de dependência -> Service ter permissão para acesar o Repository
    toda injeçao requer um construtor
     */
    //Poderia usar um @Autowired ao inves do construtor, mas foge a "bao prática"
    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;

    }

    //Criar ninja
    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    //Listar todos os meus ninjas
    public List<NinjaModel> mostrarNinjas(){
        return ninjaRepository.findAll();

    }
    //Listar por Id
    public NinjaModel listarPorId(Long id){
        //O optional foi utilizado pq há uma chance do usuário colocar um Id ñ existente
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }
}
