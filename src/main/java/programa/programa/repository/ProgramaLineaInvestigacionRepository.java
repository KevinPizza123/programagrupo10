package programa.programa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import programa.programa.entities.ProgramaLineaInvestigacion;

public interface ProgramaLineaInvestigacionRepository extends CrudRepository<ProgramaLineaInvestigacion, Long> {
     
    List<ProgramaLineaInvestigacion> findAll();



}