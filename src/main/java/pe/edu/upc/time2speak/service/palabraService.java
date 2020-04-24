package pe.edu.upc.time2speak.service;

import java.util.List;
import pe.edu.upc.time2speak.model.palabra;

public interface palabraService {
    List<palabra> palabrasReferidasLetra(String Letra);
}
