package tn.mahmoud.timoumi_1.service;

import tn.mahmoud.timoumi_1.entity.Piste;
import tn.mahmoud.timoumi_1.entity.Skieur;

import java.util.List;

public interface IPiste {
    Piste addPiste(Piste p);
    Piste updatePiste(Piste p);
    Piste retrievePisteById(Long id);
    List<Piste> retrieveAllPister();
    void deletePiste(Long id);
}
