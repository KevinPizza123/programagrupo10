package programa.programa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import programa.programa.entities.Programa;
import programa.programa.entities.ProgramaCarreras;
import programa.programa.services.ProgramaCarrerasService;

import java.util.List;

@RestController
@RequestMapping("api/programacarreras")
@CrossOrigin( "*")
public class ProgramaCarrerasController {


    @Autowired
    private ProgramaCarrerasService programacarrerasService;



    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    @PostMapping("/crear")
    public ProgramaCarreras save(@RequestBody ProgramaCarreras entity){
        return programacarrerasService.save(entity);
    }
    //read
    @GetMapping("/listar/{id}")
    public ProgramaCarreras findById(@PathVariable long id){
        return programacarrerasService.findById(id);
    }
    @PutMapping("/actualizar")
    public ProgramaCarreras update(@RequestBody ProgramaCarreras entity) {
        return programacarrerasService.save(entity);
    }

    @DeleteMapping("eliminar/{id}")
    public void delete(@PathVariable long id){
        ProgramaCarreras programacarreras = programacarrerasService.findById(id);
        programacarrerasService.delete(programacarreras);
    }

    @GetMapping("/listar")

    public List<ProgramaCarreras> findAll() {
        return programacarrerasService.findAll();
    }

    /*@GetMapping("/listar")
    public List<ProgramaCarreras> findAll(){
        return (List<ProgramaCarreras>) programacarrerasService.findAll();
    }*/
}