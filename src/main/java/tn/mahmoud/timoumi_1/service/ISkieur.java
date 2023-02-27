package tn.mahmoud.timoumi_1.service;

import tn.mahmoud.timoumi_1.entity.Skieur;

import java.util.List;

public interface ISkieur {


        Skieur addSkieur(Skieur sk);


        List<Skieur> retrieveAllSkieur();;
        Skieur retrieveSkieurById(Long id);
        Skieur updateSkieur(Skieur sk);
        void deleteSkieur(Long id);

    }
