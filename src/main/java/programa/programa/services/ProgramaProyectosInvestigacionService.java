package programa.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import programa.programa.entities.Programa;
import programa.programa.entities.ProgramaParticipante;
import programa.programa.entities.ProgramaProyectosInvestigacion;
import programa.programa.repository.ProgramaParticipanteRepository;
import programa.programa.repository.ProgramaProyectosInvestigacionRepository;

@Service
public class ProgramaProyectosInvestigacionService {

   
    @Autowired
    private ProgramaProyectosInvestigacionRepository programaProyectosInvestigacionRepository;

 
  //Crear
   public ProgramaProyectosInvestigacion save (ProgramaProyectosInvestigacion entity){
    return programaProyectosInvestigacionRepository.save(entity);
   }

   //Leer
   public ProgramaProyectosInvestigacion findById(long id){
    return programaProyectosInvestigacionRepository.findById(id).orElse(null);
   }

   //Eliminar
   public void deleteById(long id){
    programaProyectosInvestigacionRepository.deleteById(id);
   }

   //Lista
   public List <ProgramaProyectosInvestigacion> findAll(){
   return programaProyectosInvestigacionRepository.findAll();
   }
   }