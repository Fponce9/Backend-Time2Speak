package pe.edu.upc.time2speak.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.time2speak.model.premios;
import pe.edu.upc.time2speak.repository.premiosRepository;
import pe.edu.upc.time2speak.service.premiosService;

@Service
public class premiosServiceImpl implements premiosService {

    @Autowired
    private final premiosRepository repository;
    
    public premiosServiceImpl (premiosRepository repository){
        this.repository = repository;
    }
    
    @Override
    public List<premios> premioReferidosPaciente(int id_paciente) {
        return (List<premios>) repository.findByPacienteId(id_paciente);
    }

    @Override
    public premios anadirPremioPaciente(premios Premio) {
        return repository.save(Premio);
    }
    
}
