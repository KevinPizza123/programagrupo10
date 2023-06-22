package programa.programa.entities;

import java.io.Serializable;
import java.sql.Date;

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
@Table(name = "cronograma")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Cronograma  {

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "tarea", nullable = false)
    private String tarea;
    @Column(name = "responsable", nullable = false)
    private String responsable;
    @Column(name = "fecha_inicio", nullable = false)
  
    private Date fechaInicio;
    @Column(name = "fecha_finalizacion", nullable = false)
  
    private Date fechaFinalizacion;
    @Column(name = "avance", nullable = false)
    private String avance;
    @Column(name = "estado_tarea", nullable = false)
    private Boolean estadoTarea;
    @JoinColumn(name = "idprograma", referencedColumnName = "id")
    @ManyToOne
    private Programa idprograma;

}