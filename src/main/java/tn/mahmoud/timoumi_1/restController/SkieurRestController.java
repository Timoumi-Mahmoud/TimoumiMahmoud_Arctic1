package tn.mahmoud.timoumi_1.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.mahmoud.timoumi_1.entity.Skieur;
import tn.mahmoud.timoumi_1.service.ISkieur;

import java.util.List;

@RestController
public class SkieurRestController {

    @Autowired
    ISkieur iSkieur;
    // interface !! ::: visiblity
@PostMapping("add"  )
    public Skieur addSkieur(@RequestBody Skieur sk){
    return iSkieur.addSkieur(sk);
}

   @PutMapping("update")
    public Skieur updateSkieur( @RequestBody Skieur sk){
    return iSkieur.updateSkieur(sk);
   }
    @GetMapping("byid/{id}")
    public Skieur retrieveSKById(@PathVariable("id")  Long id){
    return  iSkieur.retrieveSkieurById(id);

    }
   @GetMapping("list")
    public List<Skieur> retrieveAllSkieurs(){
     return iSkieur.retrieveAllSkieur();
   }


  @DeleteMapping("delete/{id}")
    public void deleteSkieur( @PathVariable("id")  Long id){
       iSkieur.deleteSkieur(id);
  }

}
/*


@Entity
/*@Getter
@ToString
@NoArgsConstructor
    @Id
    //auto ===> table hibernate sequece
    // identity 1 2 3 4
 */