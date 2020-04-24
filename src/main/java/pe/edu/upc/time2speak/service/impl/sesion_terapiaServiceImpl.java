package pe.edu.upc.time2speak.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.time2speak.model.sesion_terapia;
import pe.edu.upc.time2speak.repository.sesion_terapiaRepository;
import pe.edu.upc.time2speak.service.sesion_terapiaService;

@Service
public class sesion_terapiaServiceImpl implements sesion_terapiaService{

    @Autowired
    private final sesion_terapiaRepository repository;
    
    public sesion_terapiaServiceImpl(sesion_terapiaRepository repository){
        this.repository = repository;
    }
    
    @Override
    public sesion_terapia agregarSesion_Terapia(sesion_terapia sesionTerapia) {
        return repository.save(sesionTerapia);
    }
    
}
