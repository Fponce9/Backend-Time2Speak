package pe.edu.upc.time2speak.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.time2speak.model.palabra;
import pe.edu.upc.time2speak.repository.palabraRepository;
import pe.edu.upc.time2speak.service.palabraService;

@Service
public class palabraServiceImpl implements palabraService {

    @Autowired
    private final palabraRepository repository;
    
    public palabraServiceImpl (palabraRepository repository){
        this.repository = repository;
    }
    
    @Override
    public List<palabra> palabrasReferidasLetra(String Letra) {
        return (List<palabra>) repository.findByTerapiaId(Letra);
    }
    
}
