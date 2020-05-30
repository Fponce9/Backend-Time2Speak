package pe.edu.upc.time2speak.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.time2speak.model.palabra;
import pe.edu.upc.time2speak.model.sesion_terapia;
import pe.edu.upc.time2speak.model.terapia;
import pe.edu.upc.time2speak.service.palabraService;
import pe.edu.upc.time2speak.service.sesion_terapiaService;
import pe.edu.upc.time2speak.service.terapiaService;

@RestController
public class terapiaController {
    
    @Autowired
    private sesion_terapiaService sesion_terapia;
    
    @Autowired
    private terapiaService Terapia;
    
    @Autowired
    private palabraService palabra;
    
    @PostMapping("/agregarTerapia")
    public sesion_terapia agregarTerapia(@RequestBody sesion_terapia terapia){
        return sesion_terapia.agregarSesion_Terapia(terapia);
    }
    
    @GetMapping("/obtenerTerapia/{idPaciente}/{letra}")
    public sesion_terapia obtenerTerapia(@PathVariable("idPaciente")String id,@PathVariable("letra")String letra){
        return sesion_terapia.obtenerTerapia(id, letra);
    }
    
    @GetMapping("/obtenerLetras")
    public List<terapia> obtenerLetras(){
        return Terapia.getLetras();
    }
    
    @GetMapping("obtenerPalabras/{letra}")
    public List<palabra> obtenerPalabrasPorLetra(@PathVariable("letra")String letra){
        return palabra.palabrasReferidasLetra(letra);
    }
}
