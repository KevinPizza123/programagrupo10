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

import programa.programa.entities.ProgramaParticipante;
import programa.programa.services.ProgramaParticipanteService;

@RestController
@RequestMapping("api/programaparticipante")
@CrossOrigin({"*"})
public class ProgramaParticipanteController {

    @Autowired 
    private ProgramaParticipanteService programaparticipanteService; //crear el servicio

    //CREAR

   
    @PostMapping("/crear")
    public ProgramaParticipante save (@RequestBody ProgramaParticipante entity){
        return programaparticipanteService.save(entity);
    }

  
    @GetMapping ("/listar{id}/")
    public ProgramaParticipante findById(@PathVariable long id){
        return programaparticipanteService.findById(id);
    }

    @GetMapping ("/listar")
    public List<ProgramaParticipante> findAll(){
        return programaparticipanteService.findAll(); 
    }
    

    @PutMapping ("/actualizar")
    public ProgramaParticipante update(@RequestBody ProgramaParticipante entity){
        return programaparticipanteService.save(entity);
    }
    

    @DeleteMapping ("/eliminar/{id}/")
    public void deleteById(@PathVariable long id){
        programaparticipanteService.deleteById(id);
    }
}