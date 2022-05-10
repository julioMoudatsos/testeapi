package goDevs.api.Controllers;

import goDevs.api.Entity.Contrato;
import goDevs.api.Entity.Dev;
import goDevs.api.Entity.Projeto;
import goDevs.api.Repository.RepositorioContrato;
import goDevs.api.Repository.RepositorioProjeto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/contrato")
public class ContratoController {

    @Autowired
    private RepositorioContrato contratoRepositorio;

    @GetMapping
    public ResponseEntity getContratante(){
        List<Contrato>  contratos = contratoRepositorio.findAll();
        return  ResponseEntity.status(200).body(contratos);
    }

    @GetMapping("/{id}")
    public ResponseEntity getContratante(@PathVariable int id){
        Optional<Contrato> contrato = contratoRepositorio.findById(id);
        return  ResponseEntity.status(200).body(contrato.get());
    }
}


