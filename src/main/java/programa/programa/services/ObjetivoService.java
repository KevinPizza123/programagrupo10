package programa.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import programa.programa.entities.Objetivo;
import programa.programa.repository.ObjetivoRepository;

@Service
public class ObjetivoService {
    //atributo delimitador de acceso,tipo de dato,nombre del atributo
    @Autowired
    private ObjetivoRepository objetivoRepository;

    //Crud
    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    public Objetivo save( Objetivo entity){
        return objetivoRepository.save(entity);
    }

    //read
    public Objetivo findById(long id){
        return objetivoRepository.findById(id).orElse(null);
    }

    //delete
    public void deleteById(long id){
        objetivoRepository.deleteById(id);
    }

    //traer todo
   public List<Objetivo> findAll(){
       return objetivoRepository.findAll();
   }
}