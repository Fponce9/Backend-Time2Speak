package pe.edu.upc.time2speak.model;

import java.sql.Blob;
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
    private Blob image;
    private String Terapia_id_letra;
}
