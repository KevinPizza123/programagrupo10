package programa.programa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import programa.programa.entities.ProgramaParticipante;

public interface ProgramaParticipanteRepository  extends CrudRepository <ProgramaParticipante, Long>{
    List<ProgramaParticipante> findAll();
}
