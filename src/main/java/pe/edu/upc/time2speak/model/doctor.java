package pe.edu.upc.time2speak.model;

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
@Table(name = "doctor")
public class doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_doctor;
    
    private String  Nombre;
    private String Apellido;
    
    @Column(name = "Correo", nullable = false)
    private String correo;
    
    private int Telefono;
    private boolean deshabilitar;
    private String contrasena;
}
