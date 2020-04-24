package pe.edu.upc.time2speak.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.time2speak.model.doctor;
import pe.edu.upc.time2speak.service.doctorService;

@RestController
public class doctorController {
    
    @Autowired
    private doctorService DoctorService;
    
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
}
