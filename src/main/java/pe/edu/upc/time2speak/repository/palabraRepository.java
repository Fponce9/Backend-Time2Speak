package pe.edu.upc.time2speak.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import pe.edu.upc.time2speak.model.palabra;

public interface palabraRepository extends CrudRepository<palabra, Integer> {
    List<palabra> findByTerapiaId(String TerapiaId);
}
