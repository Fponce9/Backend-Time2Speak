package pe.edu.upc.time2speak.model;

import java.sql.Blob;
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
@Table(name = "palabra")
public class palabra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_palabra;
    private String palabra;
    private String imagen;
    
    @Column(name = "Terapia_id_letra", nullable = false)
    private String terapiaId;
}
