package pe.edu.upc.time2speak.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mascota")
public class mascota {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_mascota;
    
    private String nombre;
    private int imagen;
    private int paciente_id_paciente;
}
