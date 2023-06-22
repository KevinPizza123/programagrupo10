package programa.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import programa.programa.entities.ProgramaLineaInvestigacion;
import programa.programa.repository.ProgramaLineaInvestigacionRepository;

@Service
public class ProgramaLineaInvestigacionService {
     //atributo delimitador de acceso,tipo de dato,nombre del atributo
    @Autowired
    private ProgramaLineaInvestigacionRepository programaLineaRepository;

    //Crud
    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    public ProgramaLineaInvestigacion save( ProgramaLineaInvestigacion entity){
        return programaLineaRepository.save(entity);
    }

    //read
    public ProgramaLineaInvestigacion findById(long id){
        return programaLineaRepository.findById(id).orElse(null);
    }

    //delete
    public void deleteById(long id){
        programaLineaRepository.deleteById(id);
    }

    //traer todo
   public List<ProgramaLineaInvestigacion> findAll(){
       return programaLineaRepository.findAll();
   }
} 