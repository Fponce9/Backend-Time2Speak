package pe.edu.upc.time2speak.service;

import java.util.List;
import pe.edu.upc.time2speak.model.premios;

public interface premiosService {   
    List<premios> premioReferidosPaciente(int id_paciente);
    premios anadirPremioPaciente(premios Premio);
}
