package programa.programa.entities;

import java.io.Serializable;
import java.math.BigInteger;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "programa")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Programa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "fecha_finalizacion", nullable = false)
    private Date fechaFinalizacion;

    @Column(name = "metodologia", nullable = false)
    private String metodologia;

    @Column(name = "fecha_inicio_programa", nullable = false)
    private Date fechaInicioPrograma;

    @Column(name = "numero_acta_aprobacion", nullable = false)
    private String numeroActaAprobacion;

    @Column(name = "presupuesto")
    private BigInteger presupuesto;

    @Column(name = "fecha_aprobacion", nullable = false)
    private Date fechaAprobacion;

    @Column(name = "adjuntos_acta", nullable = false)
    private String adjuntosActa;

    @Column(name = "adjuntos_programa", nullable = false)
    private String adjuntosPrograma;

    @Column(name = "antecedentes", nullable = false)
    private String antecedentes;

    @Column(name = "alcance", nullable = false)
    private String alcance;

    @Column(name = "justificacion", nullable = false)
    private String justificacion;

    @Column(name = "estrategias", nullable = false)
    private String estrategias;

    @Column(name = "seguimiento_evaluacion", nullable = false)
    private String seguimientoEvaluacion;

    @Column(name = "observaciones", nullable = false)
    private String observaciones;

    @Column(name = "elaborado_por", nullable = false)
    private String elaboradoPor;

    @Column(name = "revisado_por", nullable = false)
    private String revisadoPor;

    @Column(name = "aprobado_por", nullable = false)
    private String aprobadoPor;

    @Column(name = "id_carreraprograma")
    private int idCarreraprograma;

    @Column(name = "id_estadoprograma")
    private int idEstadoprograma;

    @Column(name = "estado", nullable = false)
    private String estado;

    @OneToMany(mappedBy = "programa")
    private List<Objetivo> objetivoList;

    @OneToMany(mappedBy = "idprograma")
    private List<Cronograma> cronogramaList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPrograma")
    private List<ProgramaProyecto> programaProyectoList;

    @OneToMany(mappedBy = "programa")
    private List<ProgramaLineaInvestigacion> programalíneainvestigaciónList;

    @OneToOne(mappedBy = "programa", cascade = CascadeType.ALL)
    private ProgramaProyectosInvestigacion programaproyectosinvestigacion;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPrograma")
    private List<ProgramaCarreras> programaCarrerasList;

    @OneToMany(mappedBy = "programa")
    private List<ProgramaParticipante> programaparticipanteList;

    // Getters y setters
}
