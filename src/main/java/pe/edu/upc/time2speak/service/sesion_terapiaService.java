package pe.edu.upc.time2speak.service;

import pe.edu.upc.time2speak.model.sesion_terapia;

public interface sesion_terapiaService {
    sesion_terapia agregarSesion_Terapia(sesion_terapia sesionTerapia);
    sesion_terapia obtenerTerapia(String id, String letra);
}
