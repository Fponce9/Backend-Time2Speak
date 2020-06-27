package pe.edu.upc.time2speak.service;

import java.util.List;
import pe.edu.upc.time2speak.model.doctor;

public interface doctorService {
    doctor createDoctor(doctor Doctor);
    
    doctor getDoctor(int id);
    
    List<doctor> getDoctors();
    
    doctor actualizar(doctor Doctor);
    
    doctor iniciarSesion(String correo, String contrasena);
}
