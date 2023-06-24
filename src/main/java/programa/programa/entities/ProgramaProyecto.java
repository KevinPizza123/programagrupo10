package programa.programa.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "programa_proyecto")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idPp")

public class ProgramaProyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pp")
    private Integer idPp;

    @Column(name = "id_proyecto")
    private int idProyecto;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_programa", referencedColumnName = "id")
    private Programa idPrograma;

    // Getters y setters
}
