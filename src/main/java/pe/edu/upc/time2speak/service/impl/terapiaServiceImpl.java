package pe.edu.upc.time2speak.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.time2speak.model.terapia;
import pe.edu.upc.time2speak.repository.terapiaRepository;
import pe.edu.upc.time2speak.service.terapiaService;

@Service
public class terapiaServiceImpl implements terapiaService  {

    @Autowired
    private final terapiaRepository repository;
    
    
    public terapiaServiceImpl (terapiaRepository repository){
        this.repository = repository;
    }
    
    @Override
    public terapia agregarTerapia(terapia Terapia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public terapia obtenerTerapia(String Letra) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<terapia> getLetras() {
        return (List<terapia>) repository.findAll();
    }
    
}
