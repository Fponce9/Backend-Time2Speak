package pe.edu.upc.time2speak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.time2speak.model.paciente;
import pe.edu.upc.time2speak.service.pacienteService;

@RestController
public class pacienteController {
    
    @Autowired
    private pacienteService PacienteService;
    
    @PostMapping("/registrarPaciente")
    public paciente registrarPaciente (@RequestBody paciente Paciente){
        return PacienteService.registrarPaciente(Paciente);
    }
    
    @GetMapping("/inicioSesion/{correo}/{contrasena}")
    public paciente iniciarPaciente (@PathVariable("correo") String correo,@PathVariable("contrasena") String contrasena){
        return PacienteService.inicioSesion(correo, contrasena);
    }
    
    @PostMapping("/deshabilitarPaciente/{Id}")
    public paciente deshabilitarCuenta(@PathVariable int Id){
        return PacienteService.deshabilitar(Id);
    }
    
    @PutMapping("/actualizarPaciente")
    public paciente actualizarCuenta(@RequestBody paciente Paciente){
        
        return PacienteService.editarDatos(Paciente.getDoctorId(), Paciente.getNombre(), Paciente.getContrasena(), 
                Paciente.getApellido(), Paciente.getCorreo());
    }
    
    
}
