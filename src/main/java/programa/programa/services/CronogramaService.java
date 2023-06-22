package programa.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import programa.programa.entities.Cronograma;
import programa.programa.repository.CronogramaRepository;

@Service
public class CronogramaService {
    //atributo delimitador de acceso,tipo de dato,nombre del atributo
    @Autowired
    private CronogramaRepository cronogramaRepository;

    //Crud
    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    public Cronograma save( Cronograma entity){
        return cronogramaRepository.save(entity);
    }

    //read
    public Cronograma findById(long id){
        return cronogramaRepository.findById(id).orElse(null);
    }

    //delete
    public void deleteById(long id){
        cronogramaRepository.deleteById(id);
    }

    //traer todo
   public List<Cronograma> findAll(){
       return cronogramaRepository.findAll();
   }
}