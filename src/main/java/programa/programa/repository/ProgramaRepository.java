package programa.programa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import programa.programa.entities.Programa;

public interface ProgramaRepository  extends CrudRepository <Programa, Long>{
    List<Programa> findAll();
}
