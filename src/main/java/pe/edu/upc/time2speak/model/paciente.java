package pe.edu.upc.time2speak.model;

import java.util.Date;
import javax.persistence.Column;
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
@Table(name = "paciente")
public class paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_paciente;
    
    private String nombre;
    private String apellido;
    private String contrasena;
    private String correo;
    private Date fecha_nacimiento;
    private boolean deshabilitado;
    
    @Column(name = "Doctor_id_doctor", nullable = false)
    private int doctorId;
}
