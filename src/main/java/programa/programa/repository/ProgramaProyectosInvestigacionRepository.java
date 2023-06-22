package programa.programa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import programa.programa.entities.ProgramaProyectosInvestigacion;

public interface ProgramaProyectosInvestigacionRepository extends CrudRepository <ProgramaProyectosInvestigacion, Long> { // crear la entidad cronograma

    List<ProgramaProyectosInvestigacion> findAll();
    
}