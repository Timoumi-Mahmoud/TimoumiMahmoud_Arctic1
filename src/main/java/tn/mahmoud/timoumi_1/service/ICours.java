package tn.mahmoud.timoumi_1.service;

import tn.mahmoud.timoumi_1.entity.Cours;
import tn.mahmoud.timoumi_1.entity.Skieur;

import java.util.List;

public interface ICours {
    Cours addCours(Cours c);
    Cours updateCours(Cours c);
    Cours retrieveCoursById(Long id);
    List<Cours> retrieveAllCours();
    void deleteCours(Long id);
}
