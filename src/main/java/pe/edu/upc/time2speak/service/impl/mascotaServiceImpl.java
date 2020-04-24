
package pe.edu.upc.time2speak.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.time2speak.model.mascota;
import pe.edu.upc.time2speak.repository.mascotaRepository;
import pe.edu.upc.time2speak.service.mascotaService;

@Service
public class mascotaServiceImpl implements mascotaService {

    @Autowired
    private final mascotaRepository repository;
    
    public mascotaServiceImpl (mascotaRepository repository){
        this.repository = repository;
    }
    
    @Override
    public mascota agregarMascota(mascota Mascota) {
        return repository.save(Mascota);
    }

    @Override
    public List<mascota> obtenerMascotas() {
        return (List<mascota>) repository.findAll();
    }

    @Override
    public mascota obtenerMacotaPorPaciente(int id_paciente) {
        return repository.findById(id_paciente)
                .orElse(null);
    }
}
