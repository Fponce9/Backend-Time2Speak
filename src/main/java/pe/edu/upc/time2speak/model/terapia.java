package pe.edu.upc.time2speak.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "terapia")
public class terapia {
    @Id
    private String id_letra;
    private String nombre_terapia;
    private String descripcion_terapia;
}
