package pe.edu.upc.time2speak.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import pe.edu.upc.time2speak.model.premios;

public interface premiosRepository extends CrudRepository<premios, Integer> {
    List<premios> findByPacienteId(int PacienteId);
}
