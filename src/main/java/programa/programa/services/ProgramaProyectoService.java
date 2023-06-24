package programa.programa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import programa.programa.entities.ProgramaProyecto;
import programa.programa.repository.ProgramaProyectoRepository;

import java.util.List;

@Service
public class ProgramaProyectoService {
    //atributo delimitador de acceso,tipo de dato,nombre del atributo
    @Autowired
    private ProgramaProyectoRepository programaproyectoRepository;

    //Crud
    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    public ProgramaProyecto save( ProgramaProyecto entity){
        return programaproyectoRepository.save(entity);
    }

    //read
    public ProgramaProyecto findById(long id){
        return programaproyectoRepository.findById(id).orElse(null);
    }
    //put

    //delete
    public void delete(ProgramaProyecto entity){
        programaproyectoRepository.delete(entity);
    }
    //traer todo

    public List findAll(){
        return (List) programaproyectoRepository.findAll();
    }


}