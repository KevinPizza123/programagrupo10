package programa.programa.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
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
@Table(name = "programa_carreras")
public class ProgramaCarreras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idPc;

    @Column(name = "id_carrera", nullable = false)
    private int idCarrera;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_programa", referencedColumnName = "id")
    @JsonIdentityReference(alwaysAsId = true) // Utiliza @JsonIdentityReference en lugar de @JsonIdentityInfo
    private Programa idPrograma;

    // Getters y setters
}
