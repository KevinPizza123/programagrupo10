package programa.programa.repository;

 import org.springframework.data.repository.CrudRepository;

import programa.programa.entities.ProgramaProyecto;

import java.util.List;
    
    public interface ProgramaProyectoRepository extends CrudRepository<ProgramaProyecto, Long> {
    
        List<ProgramaProyecto> findAll();
    
    
    
    }
