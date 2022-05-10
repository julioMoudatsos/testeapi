package goDevs.api.Controllers;

import goDevs.api.Entity.Dev;
import goDevs.api.Entity.Projeto;
import goDevs.api.Repository.RepositorioDev;
import goDevs.api.Repository.RepositorioProjeto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/projeto")
public class ProjetoController {

    @Autowired
    private RepositorioProjeto projetoRepositorio;
    @GetMapping
    public ResponseEntity getContratante(){
        List<Projeto>  projetos = projetoRepositorio.findAll();
        return  ResponseEntity.status(200).body(projetos);
    }
}
