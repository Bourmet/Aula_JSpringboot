package com.AulaSpring.CadastroDeNinjas.ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

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

    //Listar todos os meus ninjas
    public List<NinjaModel> mostrarNinjas(){
        return ninjaRepository.findAll();

    }
}
