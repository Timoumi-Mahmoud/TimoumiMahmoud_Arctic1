package tn.mahmoud.timoumi_1.service;

import tn.mahmoud.timoumi_1.entity.Moniteur;

import java.util.List;

public interface IMoniteur {

    Moniteur AddMoniteur(Moniteur sk);
    Moniteur updateMoniteur(Moniteur sk);
    Moniteur retrieveMoniteurById(Long id);
    List<Moniteur> retrieveAllMoniteur();
    void deleteMoniteur(Long id);
}
