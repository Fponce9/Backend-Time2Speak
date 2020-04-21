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
@Table(name = "sesion_terapia")
public class sesion_terapia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sesion_terapia;
    private int Paciente_id_paciente;
    private String Terapia_id_letra;
    private boolean resultado;
    private int audio; //Tiene que ser valor Binary
    private String comentarios;
}
