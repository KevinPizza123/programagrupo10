package programa.programa.repository;

 import org.springframework.data.repository.CrudRepository;

import programa.programa.entities.ProgramaCarreras;

import java.util.List;
    
    public interface ProgramaCarrerasRepository extends CrudRepository<ProgramaCarreras, Long> {
    
        List<ProgramaCarreras> findAll();
    
    
    
    }
