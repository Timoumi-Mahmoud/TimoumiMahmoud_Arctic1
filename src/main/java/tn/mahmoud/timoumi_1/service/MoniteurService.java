package tn.mahmoud.timoumi_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.mahmoud.timoumi_1.entity.Moniteur;

import java.util.List;
@Service
public class MoniteurService implements IMoniteur{
    @Autowired
    IMoniteur iMoniteur;

    @Override
    public Moniteur AddMoniteur(Moniteur m) {
        return iMoniteur.AddMoniteur(m);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur m) {
        return  iMoniteur.updateMoniteur(m);
    }

    @Override
    public Moniteur retrieveMoniteurById(Long id) {
        return iMoniteur.retrieveMoniteurById(id);
    }

    @Override
    public List<Moniteur> retrieveAllMoniteur() {
        return iMoniteur.retrieveAllMoniteur();
    }

    @Override
    public void deleteMoniteur(Long id) {
        iMoniteur.deleteMoniteur(id);

    }
}
