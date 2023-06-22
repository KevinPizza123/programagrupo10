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

import programa.programa.entities.Cronograma;
import programa.programa.services.CronogramaService;

@RestController
@RequestMapping("api/cronograma")
@CrossOrigin("*")

public class CronogramaController {

    @Autowired
    private CronogramaService cronogramaService;

    // crear
    // metod delimitador de acceso,tipo de dato que retorna,nombre del
    // metodo/funcion
 
    @PostMapping("/crear")

    public Cronograma save(@RequestBody Cronograma entity) {
        return cronogramaService.save(entity);
    }

    // traer por id
    @GetMapping("/listar/{id}")

    public Cronograma findById(@PathVariable long id) {
        return cronogramaService.findById(id);
    }

    // traer todo
    @GetMapping("/listar")

    public List<Cronograma> findAll() {
        return cronogramaService.findAll();
    }

    // actualizar
    @PutMapping("/actualizar")

    public Cronograma update(@RequestBody Cronograma entity) {
        return cronogramaService.save(entity);
    }

    

    // eliminar
    @DeleteMapping("/eliminar/{id}")

    public void deleteById(@PathVariable long id) {
        cronogramaService.deleteById(id);
    }

}