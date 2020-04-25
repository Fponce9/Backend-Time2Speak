package pe.edu.upc.time2speak.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.time2speak.model.premios;
import pe.edu.upc.time2speak.service.premiosService;

@RestController
public class premioController {
    
    @Autowired
    private premiosService PremioService;
    
    @GetMapping("/getPremioPaciente/{Id}")
    public List<premios> getPremiosPaciente(@PathVariable int Id){
        return PremioService.premioReferidosPaciente(Id);
    }    
    
    @PostMapping("/agregarPremio/{Id}")
    public premios agregarPremio(@RequestBody premios Premio){
        return PremioService.anadirPremioPaciente(Premio);
    }
}
