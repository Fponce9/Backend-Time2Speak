package pe.edu.upc.time2speak.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.websocket.Decoder.Binary;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sesion_Terapia")
public class sesion_terapia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sesion_terapia;
    @Column(name = "Paciente_id_paciente", nullable = false)
    private int pacienteIdPaciente;
    @Column(name = "Terapia_id_letra", nullable = false)
    private String terapiaIdLetra;
    
    private boolean resultado;
    private String audio; //Tiene que ser valor Binary
    private String comentarios;
}
