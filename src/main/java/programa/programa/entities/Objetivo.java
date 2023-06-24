package programa.programa.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@Table(name = "objetivo")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Objetivo {

    @JsonProperty("id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_objetivo", nullable = false)
    private Integer idObjetivo;

    @Column(name = "avance", nullable = false)
    private Integer avance;

    @Column(name = "objetivo_especifico", nullable = false)
    private String objetivoEspecifico;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

    @Column(name = "idtipoObjetivo", nullable = false)
    private Integer idtipoObjetivo;

    @Column(name = "idProyecto", nullable = false)
    private Integer idProyecto;

    @ManyToOne
    @JoinColumn(name = "programa", referencedColumnName = "id")
    private Programa programa;

    // Getters y setters
}
