package programa.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import programa.programa.entities.ProgramaCarreras;
import programa.programa.repository.ProgramaCarrerasRepository;


@Service
public class ProgramaCarrerasService {
    //atributo delimitador de acceso,tipo de dato,nombre del atributo
    @Autowired
    private ProgramaCarrerasRepository programacarrerasRepository;

    //Crud
    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    public ProgramaCarreras save( ProgramaCarreras entity){
        return programacarrerasRepository.save(entity);
    }

    //read
    public ProgramaCarreras findById(long id){
        return programacarrerasRepository.findById(id).orElse(null);
    }
    //put

    //delete
    public void delete(ProgramaCarreras entity){
        programacarrerasRepository.delete(entity);
    }
    //traer todo

    public List findAll(){
        return (List) programacarrerasRepository.findAll();
    }


}