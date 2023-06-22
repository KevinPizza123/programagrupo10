package programa.programa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import programa.programa.entities.Objetivo;

public interface ObjetivoRepository extends CrudRepository <Objetivo, Long> { // crear la entidad cronograma

    List<Objetivo> findAll();
    
}