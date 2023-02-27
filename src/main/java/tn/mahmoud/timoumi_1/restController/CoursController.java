package tn.mahmoud.timoumi_1.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.mahmoud.timoumi_1.entity.Cours;
import tn.mahmoud.timoumi_1.service.ICours;

import java.util.List;
@RestController
public class CoursController {
    @Autowired
    ICours iCours;
    // interface !! ::: visiblity
    @PostMapping("add"  )
    public Cours addAbon(@RequestBody Cours c){
        return iCours.addCours(c);
    }

    @PutMapping("update")
    public Cours updateAbon( @RequestBody Cours c){
        return iCours.updateCours(c);
    }
    @GetMapping("/{id}")
    public Cours retrieveSKById(@PathVariable("id")  Long id){
        return  iCours.retrieveCoursById(id);

    }
    @GetMapping("list")
    public List<Cours> retrieveAllSkieurs(){
        return iCours.retrieveAllCours();
    }


    @DeleteMapping("{id}")
    public void deleteAbon( @PathVariable("id")  Long id){
        iCours.deleteCours(id);
    }



}
