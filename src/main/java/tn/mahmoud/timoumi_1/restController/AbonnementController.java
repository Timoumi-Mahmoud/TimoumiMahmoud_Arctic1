package tn.mahmoud.timoumi_1.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.mahmoud.timoumi_1.entity.Abonnement;
import tn.mahmoud.timoumi_1.service.IAbonnement;

import java.util.List;

@RestController()
public class AbonnementController {
    @Autowired
    IAbonnement iAbonnement;
    // interface !! ::: visiblity
    @PostMapping("add"  )
    public Abonnement addAbon(@RequestBody Abonnement abo)
    {
        return iAbonnement.AddAbo(abo);
    }

    @PutMapping("update")
    public Abonnement updateAbon( @RequestBody Abonnement abo){
        return iAbonnement.update(abo);
    }
    @GetMapping("/{id}")
    public Abonnement retrieveSKById(@PathVariable("id")  Long id){
        return  iAbonnement.getAbonByID(id);

    }
    @GetMapping("list")
    public List<Abonnement> retrieveAllSkieurs()
    {
        return iAbonnement.showAbon();
    }


    @DeleteMapping("{id}")
    public void deleteAbon( @PathVariable("id")  Long id){
        iAbonnement.DeleteAbo(id);
    }



}
