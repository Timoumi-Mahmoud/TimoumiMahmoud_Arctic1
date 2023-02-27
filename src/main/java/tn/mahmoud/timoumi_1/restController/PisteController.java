package tn.mahmoud.timoumi_1.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.mahmoud.timoumi_1.entity.Moniteur;
import tn.mahmoud.timoumi_1.entity.Piste;
import tn.mahmoud.timoumi_1.service.IMoniteur;
import tn.mahmoud.timoumi_1.service.IPiste;

import java.util.List;
@RestController
public class PisteController {
    @Autowired
    IPiste iPiste;


    // interface !! ::: visiblity
    @PostMapping("add"  )
    public Piste add(@RequestBody Piste p){
        return iPiste.addPiste(p);
    }

    @PutMapping("update")
    public Piste update( @RequestBody Piste p){
        return iPiste.updatePiste(p);
    }
    @GetMapping("/{id}")
    public Piste retrieveById(@PathVariable("id")  Long id){
        return  iPiste.retrievePisteById(id);

    }
    @GetMapping("list")
    public List<Piste> retrieveAll(){
        return iPiste.retrieveAllPister();
    }


    @DeleteMapping("{id}")
    public void deleteAbon( @PathVariable("id")  Long id){
        iPiste.deletePiste(id);
    }


}
