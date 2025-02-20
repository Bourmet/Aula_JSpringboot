package com.AulaSpring.CadastroDeNinjas.ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {
    /*Comunicação entre Service e Repository,
    isso é uma injeção de dependência -> Service ter permissão para acesar o Repository
    toda injeçao requer um construtor
     */
    //Poderia usar um @Autowired ao inves do construtor, mas foge a "bao prática"
    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    //Criar ninja
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }

    //Listar todos os meus ninjas
    public List<NinjaDTO> mostrarNinjas(){
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());


    }
    //Listar por Id
    public NinjaDTO listarPorId(Long id){
        //O optional foi utilizado pq há uma chance do usuário colocar um Id ñ existente
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.map(ninjaMapper::map).orElse(null);
    }

    //Atualizar
    public NinjaDTO atualizarDados(Long id, NinjaDTO ninjaDTO){
        Optional<NinjaModel> ninjaExistente = ninjaRepository .findById(id);
        if (ninjaExistente.isPresent()){
            NinjaModel ninjaAtualizado = ninjaMapper.map(ninjaDTO);
            ninjaAtualizado.setId(id);
            NinjaModel ninjaSalvo = ninjaRepository.save(ninjaAtualizado);
            return ninjaMapper.map(ninjaSalvo);
        }
        return null;
    }

    //Deletar -> precisa ser void
    //Não precisa passar o DTO
    public void deletarNinja(Long id){
        ninjaRepository.deleteById(id);
    }
}
