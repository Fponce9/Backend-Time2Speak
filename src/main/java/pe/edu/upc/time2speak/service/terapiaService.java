package pe.edu.upc.time2speak.service;

import java.util.List;
import pe.edu.upc.time2speak.model.terapia;

public interface terapiaService {
    terapia agregarTerapia(terapia Terapia);
    terapia obtenerTerapia(String Letra);
    List<terapia> getLetras();
}
