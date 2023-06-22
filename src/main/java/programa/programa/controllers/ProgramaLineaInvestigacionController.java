package programa.programa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import programa.programa.entities.ProgramaLineaInvestigacion;
import programa.programa.services.ProgramaLineaInvestigacionService;

@RestController
@RequestMapping("api/programalineainvestigacion")
@CrossOrigin("*")
public class ProgramaLineaInvestigacionController {

    @Autowired
    private ProgramaLineaInvestigacionService programaLineaInvestigacionService;

    // crear
    // metod delimitador de acceso,tipo de dato que retorna,nombre del
    // metodo/funcion
 
    @PostMapping("/crear")

    public ProgramaLineaInvestigacion save(@RequestBody ProgramaLineaInvestigacion entity) {
        return programaLineaInvestigacionService.save(entity);
    }

    // traer por id
    @GetMapping("/listar/{id}")

    public ProgramaLineaInvestigacion findById(@PathVariable long id) {
        return programaLineaInvestigacionService.findById(id);
    }

    // traer todo
    @GetMapping("/listar")

    public List<ProgramaLineaInvestigacion> findAll() {
        return programaLineaInvestigacionService.findAll();
    }

    // actualizar
    @PutMapping("/actualizar")

    public ProgramaLineaInvestigacion update(@RequestBody ProgramaLineaInvestigacion entity) {
        return programaLineaInvestigacionService.save(entity);
    }

    

    // eliminar
    @DeleteMapping("/eliminar/{id}")

    public void deleteById(@PathVariable long id) {
        programaLineaInvestigacionService.deleteById(id);
    }

}
