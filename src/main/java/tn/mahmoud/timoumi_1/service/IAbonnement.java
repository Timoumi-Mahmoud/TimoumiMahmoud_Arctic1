package tn.mahmoud.timoumi_1.service;

import tn.mahmoud.timoumi_1.entity.Abonnement;

import java.util.List;

public interface IAbonnement {

     List<Abonnement> showAbon();
     Abonnement getAbonByID(long id);
     Abonnement AddAbo(Abonnement abonnement);
     Abonnement update (Abonnement abonnement);
     void DeleteAbo( long id );
}
