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

import programa.programa.entities.Programa;
import programa.programa.services.ProgramaService;


@RestController
@RequestMapping("api/programa")
@CrossOrigin("*")
public class ProgramaController {

    @Autowired
    private ProgramaService programaService;

    // crear
    // metod delimitador de acceso,tipo de dato que retorna,nombre del
    // metodo/funcion
 
    @PostMapping("/crear")

    public Programa save(@RequestBody Programa entity) {
        return programaService.save(entity);
    }

    // traer por id
    @GetMapping("/listar/{id}")

    public Programa findById(@PathVariable long id) {
        return programaService.findById(id);
    }

    // traer todo
    @GetMapping("/listar")

    public List<Programa> findAll() {
        return programaService.findAll();
    }

    // actualizar
    @PutMapping("/actualizar")

    public Programa update(@RequestBody Programa entity) {
        return programaService.save(entity);
    }

    

    // eliminar
    @DeleteMapping("/eliminar/{id}")

    public void deleteById(@PathVariable long id) {
        programaService.deleteById(id);
    }

}