package pe.edu.upc.time2speak.service;

import java.util.List;
import pe.edu.upc.time2speak.model.paciente;

public interface pacienteService {
    paciente registrarPaciente(paciente Paciente);
    paciente inicioSesion(String correo,String contrasena);
    paciente editarDatos(int id,String nombre, String newContrasena, String Apellido); 
    paciente deshabilitar(int id);
    List<paciente> obtenerPacientePorDoctor(int id);
}
