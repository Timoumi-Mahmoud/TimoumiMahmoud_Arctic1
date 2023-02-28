package tn.mahmoud.timoumi_1.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.mahmoud.timoumi_1.entity.Abonnement;
import tn.mahmoud.timoumi_1.repository.AbonnementRepository;

import java.util.List;
@Service
public class AbonnementService implements IAbonnement{
    @Autowired
    AbonnementRepository abonnementRepository;


 //AbonnementRepository abonnementRepository;   //@AllArgsConstructor

  //AbonnementRepository  abonnementRepository =new AbonnementService();
//controller communicate with view(html, css)
    // controllerRest expose api (with React, angulate



    @Override
    public List<Abonnement> showAbon() {
        return  abonnementRepository.findAll();
    }

    @Override
    public Abonnement getAbonByID(long id) {
        return abonnementRepository.findById(id).orElse(null);
    }

    @Override
    public Abonnement AddAbo(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement update(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public void DeleteAbo(long id) {
        abonnementRepository.deleteById(id);

    }
}
