package tn.mahmoud.timoumi_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.mahmoud.timoumi_1.entity.Abonnement;
import tn.mahmoud.timoumi_1.repository.AbonnementRepository;

import java.util.List;
@Service
public class AbonnementService implements IAbonnement{
    @Autowired
    AbonnementRepository abonnementRepository;
    @Override
    public List<Abonnement> showAbon() {
        return  abonnementRepository.findAll();
    }

    @Override
    public Abonnement getAbonByID(long id) {
        return null;
    }

    @Override
    public Abonnement AddAbo(Abonnement abonnement) {
        return null;
    }

    @Override
    public Abonnement update(Abonnement abonnement) {
        return null;
    }

    @Override
    public void DeleteAbo(long id) {

    }
}
