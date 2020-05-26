
package pe.edu.upc.time2speak.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import pe.edu.upc.time2speak.model.sesion_terapia;

public interface sesion_terapiaRepository extends CrudRepository<sesion_terapia, Integer> {
    List<sesion_terapia> findByPacienteIdPacienteAndTerapiaIdLetra(int pacienteId,String terapiaidLetra);
}
