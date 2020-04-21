package pe.edu.upc.time2speak.model;

import java.sql.Blob;
import java.util.Date;
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
@Table(name = "premios")
public class premios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_premio;
    private String nombre_premio;
    private Blob medalla;
    private Date tiempo;
    private int Paciente_id_paciente;
}
