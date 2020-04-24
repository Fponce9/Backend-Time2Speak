package pe.edu.upc.time2speak.service.impl;

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
    public boolean inicioSesion(String correo, String contrasena) {
        paciente temp = repository.findByCorreo(correo);
        String tempContra = temp.getContrasena();
        return tempContra.equals(contrasena);
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
    public paciente deshabilitar(int Id,boolean flag) {
        paciente temp = repository.findById(Id)
                .orElse(null);
        temp.setDeshabilitado(flag);
        return repository.save(temp);
    }
    
}
