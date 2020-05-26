package pe.edu.upc.time2speak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.time2speak.model.sesion_terapia;
import pe.edu.upc.time2speak.service.sesion_terapiaService;

@RestController
public class terapiaController {
    
    @Autowired
    private sesion_terapiaService Terapia;
    
    @PostMapping("/agregarTerapia")
    public sesion_terapia agregarTerapia(@RequestBody sesion_terapia terapia){
        return Terapia.agregarSesion_Terapia(terapia);
    }
    
    @GetMapping("/obtenerTerapia/{idPaciente}/{letra}")
    public sesion_terapia obtenerTerapia(@PathVariable("idPaciente")String id,@PathVariable("letra")String letra){
        return Terapia.obtenerTerapia(id, letra);
    }
}
