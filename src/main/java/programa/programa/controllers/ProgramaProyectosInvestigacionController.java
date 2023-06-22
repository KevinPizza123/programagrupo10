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

import programa.programa.entities.ProgramaProyectosInvestigacion;
import programa.programa.services.ProgramaProyectosInvestigacionService;



@RestController
@RequestMapping("api/programaproyectoinvestigacion")
@CrossOrigin({"*"})
public class ProgramaProyectosInvestigacionController {
     @Autowired 
    private ProgramaProyectosInvestigacionService programaproyectoinvestigacionService;

    //CREAR
   
    @PostMapping("/crear")
    public ProgramaProyectosInvestigacion save (@RequestBody ProgramaProyectosInvestigacion entity){
        return programaproyectoinvestigacionService.save(entity);
    }
   
    @GetMapping ("/listar/{id}/")
    public ProgramaProyectosInvestigacion findById(@PathVariable long id){
        return programaproyectoinvestigacionService.findById(id);
    }

    @GetMapping ("/listar")
    public List<ProgramaProyectosInvestigacion> findAll(){
        return programaproyectoinvestigacionService.findAll(); 
    }

    @PutMapping ("/actualizar")
    public ProgramaProyectosInvestigacion update(@RequestBody ProgramaProyectosInvestigacion entity){
        return programaproyectoinvestigacionService.save(entity);
    }

    @DeleteMapping ("/eliminar/{id}/")
    public void deleteById(@PathVariable long id){
        programaproyectoinvestigacionService.deleteById(id);
    }
}