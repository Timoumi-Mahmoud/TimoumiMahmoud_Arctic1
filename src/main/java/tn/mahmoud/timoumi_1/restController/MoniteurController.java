package tn.mahmoud.timoumi_1.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.mahmoud.timoumi_1.entity.Cours;
import tn.mahmoud.timoumi_1.entity.Moniteur;
import tn.mahmoud.timoumi_1.service.ICours;
import tn.mahmoud.timoumi_1.service.IMoniteur;

import java.util.List;
@RestController
public class MoniteurController {


    @Autowired
    IMoniteur iMoniteur;


    // interface !! ::: visiblity
    @PostMapping("add"  )
    public Moniteur add(@RequestBody Moniteur m){
        return iMoniteur.AddMoniteur(m);
    }

    @PutMapping("update")
    public Moniteur update( @RequestBody Moniteur m){
        return iMoniteur.updateMoniteur(m);
    }
    @GetMapping("/{id}")
    public Moniteur retrieveById(@PathVariable("id")  Long id){
        return  iMoniteur.retrieveMoniteurById(id);

    }
    @GetMapping("list")
    public List<Moniteur> retrieveAll(){
        return iMoniteur.retrieveAllMoniteur();
    }


    @DeleteMapping("{id}")
    public void deleteAbon( @PathVariable("id")  Long id){
        iMoniteur.deleteMoniteur(id);
    }









}
