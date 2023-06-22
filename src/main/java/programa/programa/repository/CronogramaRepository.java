package programa.programa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import programa.programa.entities.Cronograma;

public interface CronogramaRepository extends CrudRepository <Cronograma, Long> { // crear la entidad cronograma

    List<Cronograma> findAll();
    
}
