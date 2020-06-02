package pe.edu.upc.time2speak.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.time2speak.model.paciente;
import pe.edu.upc.time2speak.repository.pacienteRepository;
import pe.edu.upc.time2speak.service.pacienteService;

@Service
public class pacienteServiceImpl implements pacienteService {

    @Autowired
    private final pacienteRepository repository;
    
    public pacienteServiceImpl (pacienteRepository repository){
        this.repository = repository;
    }
    
    @Override
    public paciente registrarPaciente(paciente Paciente) {
        return repository.save(Paciente);
    }

    @Override
    public paciente inicioSesion(String correo, String contrasena) {
        paciente temp = repository.findByCorreo(correo);
        String tempContra = temp.getContrasena();
        if (tempContra.equals(contrasena)){
            return temp;
        }
        else return null;
    }

    @Override
    public paciente editarDatos(int Id,String nombre, String newContrasena, String Apellido) {
        paciente temp = repository.findById(Id)
                .orElse(null);
        temp.setApellido(Apellido);
        temp.setNombre(nombre);
        temp.setContrasena(newContrasena);
        return repository.save(temp);
    }

    @Override
    public paciente deshabilitar(int Id) {
        paciente temp = repository.findById(Id)
                .orElse(null);
        temp.setDeshabilitado(true);
        return repository.save(temp);
    }

    @Override
    public List<paciente> obtenerPacientePorDoctor(int id) {
        return repository.findByDoctorId(id);
    }
}
