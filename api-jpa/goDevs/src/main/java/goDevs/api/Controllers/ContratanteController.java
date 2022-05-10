package goDevs.api.Controllers;

import goDevs.api.Entity.Contratante;
import goDevs.api.Repository.RepositorioContrantante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/contratante")
public class ContratanteController {

    @Autowired
    private RepositorioContrantante contratanteRepositorio;
    @GetMapping
    public ResponseEntity getContratante(){
        List<Contratante>  contratantes = contratanteRepositorio.findAll();
        return  ResponseEntity.status(200).body(contratantes);
    }
}
