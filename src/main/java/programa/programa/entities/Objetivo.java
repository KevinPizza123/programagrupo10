package programa.programa.entities;

import java.io.Serializable;

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
;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "objetivo")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Objetivo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_objetivo")
    private Integer idObjetivo;
    @Column(name = "avance")
    private Integer avance;
    @Column(name = "objetivo_especifico")
    private String objetivoEspecifico;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "idtipoObjetivo")
    private Integer idtipoObjetivo;
    @Column(name = "idProyecto")
    private Integer idProyecto;
    @JoinColumn(name = "programa", referencedColumnName = "id")
    @ManyToOne
    private Programa programa;

    }