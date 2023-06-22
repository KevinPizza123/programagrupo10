package programa.programa.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "programaproyectosinvestigacion")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ProgramaProyectosInvestigacion  {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "idprograma", nullable = false)
    private Integer idprograma;
    @Column(name = "idproyectoinvestigacion", nullable = false)
    private String idproyectoinvestigacion;
    @Column(name = "estado", nullable = false)
    private Boolean estado;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "programaproyectosinvestigacion")
    private Programa programa;

    }