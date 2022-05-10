package goDevs.api.Controllers;

import goDevs.api.Entity.Dev;
import goDevs.api.Repository.RepositorioDev;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/dev")
public class DevController {

    @Autowired
    private RepositorioDev devRepositorio;
    @GetMapping
    public ResponseEntity getContratantes(){
        List<Dev>  devs = devRepositorio.findAll();
        return  ResponseEntity.status(200).body(devs);
    }

    @GetMapping("/{id}")
    public ResponseEntity getContratante(@PathVariable  int id){
          Optional<Dev> dev = devRepositorio.findById(id);
        return  ResponseEntity.status(200).body(dev.get());
    }
}
