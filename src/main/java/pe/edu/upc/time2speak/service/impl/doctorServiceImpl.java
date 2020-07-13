package pe.edu.upc.time2speak.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.time2speak.model.doctor;
import pe.edu.upc.time2speak.repository.doctorRepository;
import pe.edu.upc.time2speak.service.doctorService;


@Service
public class doctorServiceImpl implements doctorService{

    @Autowired
    private final doctorRepository repository;
    
    public doctorServiceImpl (doctorRepository repository){
        this.repository = repository;
    }
    
    @Override
    public doctor createDoctor(doctor Doctor) {
        return repository.save(Doctor);
    }

    @Override
    public doctor getDoctor(int id) {
        doctor Doctor = repository.findById(id)
                .orElse(null);
        return Doctor;
    }

    @Override
    public List<doctor> getDoctors() {
         return (List<doctor>) repository.findAll();
    }

    @Override
    public doctor actualizar(doctor Doctor) {
        doctor temp = repository.findById(Doctor.getId_doctor())
                .orElse(null);
        
        temp.setContrasena(Doctor.getContrasena());
        temp.setTelefono(Doctor.getTelefono());
        return repository.save(temp);
    }

    @Override
    public doctor iniciarSesion(String correo, String contrasena) {
        doctor temp = repository.findByCorreo(correo);
        String tempContra = temp.getContrasena();
        if (tempContra.equals(contrasena)){
            return temp;
        }
        else return null;
    }

    @Override
    public doctor deshabilitar(int id) {
       doctor temp = repository.findById(id)
                .orElse(null);
       temp.setDeshabilitar(true);
       
       return repository.save(temp);
    }

    

  
    
}
