package programa.programa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import programa.programa.entities.ProgramaCarreras;
import programa.programa.entities.ProgramaProyecto;
import programa.programa.services.ProgramaProyectoService;

import java.util.List;

@RestController
@RequestMapping("api/programaproyecto")
@CrossOrigin( "*")
public class ProgramaProyectoController {


    @Autowired
    private ProgramaProyectoService programaproyectoService;



    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    @PostMapping("/crear")
    public ProgramaProyecto save(@RequestBody ProgramaProyecto entity){
        return programaproyectoService.save(entity);
    }
    //read
    @GetMapping("/listar/{id}")
    public ProgramaProyecto findById(@PathVariable long id){
        return programaproyectoService.findById(id);
    }
    @PutMapping("/actualizar")
    public ProgramaProyecto update(@RequestBody ProgramaProyecto entity) {
        return programaproyectoService.save(entity);
    }

    @DeleteMapping("eliminar/{id}")
    public void delete(@PathVariable long id){
        ProgramaProyecto programaproyecto = programaproyectoService.findById(id);
        programaproyectoService.delete(programaproyecto);
    }

    @GetMapping("/listar")

    public List<ProgramaCarreras> findAll() {
        return programaproyectoService.findAll();
    }
    /*@GetMapping("/listar")
    public List<ProgramaProyecto> findAll(){
        return (List<ProgramaProyecto>) programaproyectoService.findAll();
    }*/
}