package pe.edu.upc.time2speak.service;

import java.util.List;
import pe.edu.upc.time2speak.model.mascota;

public interface mascotaService {
    mascota agregarMascota(mascota Mascota);
    List<mascota> obtenerMascotas();
    mascota obtenerMacotaPorPaciente(int id_paciente);
}
