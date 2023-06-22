package programa.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import programa.programa.entities.ProgramaParticipante;
import programa.programa.repository.ProgramaParticipanteRepository;

@Service
public class ProgramaParticipanteService {

   
    @Autowired
    private ProgramaParticipanteRepository programaparticipanteRepository;

 
  //Crear
   public ProgramaParticipante save (ProgramaParticipante entity){
    return programaparticipanteRepository.save(entity);
   }

   //Leer
   public ProgramaParticipante findById(long id){
    return programaparticipanteRepository.findById(id).orElse(null);
   }

   //Eliminar
   public void deleteById(long id){
    programaparticipanteRepository.deleteById(id);
   }

   //Lista
   public List <ProgramaParticipante> findAll(){
   return programaparticipanteRepository.findAll();
   }
   }