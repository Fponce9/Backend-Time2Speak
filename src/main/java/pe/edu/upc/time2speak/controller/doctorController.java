package pe.edu.upc.time2speak.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.time2speak.model.doctor;
import pe.edu.upc.time2speak.model.paciente;
import pe.edu.upc.time2speak.model.sesion_terapia;
import pe.edu.upc.time2speak.service.doctorService;
import pe.edu.upc.time2speak.service.pacienteService;
import pe.edu.upc.time2speak.service.sesion_terapiaService;

@RestController
public class doctorController {
    
    @Autowired
    private doctorService DoctorService;
    
    @Autowired
    private pacienteService PacienteService;
    
    @Autowired
    private sesion_terapiaService TerapiaService;
    
    @PostMapping("/addDoctor")
    public doctor newDoctor(@RequestBody doctor Doctor){
        return DoctorService.createDoctor(Doctor);
    }
    
    @GetMapping("/getDoctor/{id}")
    public doctor getDoctorById(@PathVariable int id){
        return DoctorService.getDoctor(id);
    }
    
    @GetMapping("/getDoctores")
    public List<doctor> getAllDoctors(){
        return DoctorService.getDoctors();
    }
    
    @GetMapping("/getPacientes/{doctorID}")
    public List<paciente> getPacienteById(@PathVariable int doctorID){
        return PacienteService.obtenerPacientePorDoctor(doctorID);
    }
    
    @PostMapping("/Feedback")
    public sesion_terapia postFeedbackUsuario(@RequestBody sesion_terapia Terapia){
        return TerapiaService.agregarSesion_Terapia(Terapia);
    }
    
    @PutMapping("/actualizarDoctor")
    public doctor updateDoctor(@RequestBody doctor Doctor){
        return DoctorService.actualizar(Doctor);
    }
    
    @GetMapping("inciarsesionDoctor/{correo}/{contrasena}")
    public doctor iniciarSesion(@PathVariable String correo,@PathVariable String contrasena){    
        return DoctorService.iniciarSesion(correo,contrasena);
    }
}
