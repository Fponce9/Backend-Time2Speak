package pe.edu.upc.time2speak.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import pe.edu.upc.time2speak.model.paciente;

public interface pacienteRepository extends CrudRepository<paciente, Integer> {
    paciente findByCorreo(String correo);
    List<paciente> findByDoctorId(int ID);
}
