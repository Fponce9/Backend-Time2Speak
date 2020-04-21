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

  
    
}
