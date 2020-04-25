package pe.edu.upc.time2speak.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.time2speak.model.mascota;
import pe.edu.upc.time2speak.service.mascotaService;

@RestController
public class mascotaController {
    
    @Autowired
    private mascotaService MascotaService;
    
    @PostMapping("/addMascota")
    public mascota getMascota(@RequestBody mascota temp){
        return MascotaService.agregarMascota(temp);
    }
    
    @GetMapping("/getAllMascotas")
    public List<mascota> getAllMascotas(){
        return MascotaService.obtenerMascotas();
    }
    
    @GetMapping("/getMascotaPaciente/{id}")
    public mascota getMascotaByIdPaciente(@PathVariable int id){
        return MascotaService.obtenerMacotaPorPaciente(id);
    }
    
}
