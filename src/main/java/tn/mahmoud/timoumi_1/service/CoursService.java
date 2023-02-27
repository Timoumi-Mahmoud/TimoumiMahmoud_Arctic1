package tn.mahmoud.timoumi_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.mahmoud.timoumi_1.entity.Abonnement;
import tn.mahmoud.timoumi_1.entity.Cours;

import java.util.List;

@Service
public class CoursService  implements ICours{

@Autowired
    ICours iCours;

    @Override
    public Cours addCours(Cours c) {
        return iCours.addCours(c);
    }

    @Override
    public Cours updateCours(Cours c) {
        return iCours.updateCours(c);
    }

    @Override
    public Cours retrieveCoursById(Long id) {
        return iCours.retrieveCoursById(id);
    }

    @Override
    public List<Cours> retrieveAllCours() {
        return iCours.retrieveAllCours();
    }

    @Override
    public void deleteCours(Long id) {
   iCours.deleteCours(id);
    }
}
