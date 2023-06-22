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

import programa.programa.entities.Objetivo;
import programa.programa.services.ObjetivoService;

@RestController
@RequestMapping("api/objetivo")
@CrossOrigin("*")

public class ObjetivoController {

    @Autowired
    private ObjetivoService objetivoService;

    // crear
    // metod delimitador de acceso,tipo de dato que retorna,nombre del
    // metodo/funcion
 
    @PostMapping("/crear")

    public Objetivo save(@RequestBody Objetivo entity) {
        return objetivoService.save(entity);
    }

    // traer por id
    @GetMapping("/listar/{id}")

    public Objetivo findById(@PathVariable long id) {
        return objetivoService.findById(id);
    }

    // traer todo
    @GetMapping("/listar")

    public List<Objetivo> findAll() {
        return objetivoService.findAll();
    }

    // actualizar
    @PutMapping("/actualizar")

    public Objetivo update(@RequestBody Objetivo entity) {
        return objetivoService.save(entity);
    }

    

    // eliminar
    @DeleteMapping("/eliminar/{id}")

    public void deleteById(@PathVariable long id) {
        objetivoService.deleteById(id);
    }

}