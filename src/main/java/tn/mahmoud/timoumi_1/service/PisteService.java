package tn.mahmoud.timoumi_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.mahmoud.timoumi_1.entity.Piste;

import java.util.List;
@Service
public class PisteService implements IPiste{
   @Autowired
    IPiste iPiste;


    @Override
    public Piste addPiste(Piste p) {
        return iPiste.addPiste(p);
    }

    @Override
    public Piste updatePiste(Piste p) {
        return iPiste.updatePiste(p);
    }

    @Override
    public Piste retrievePisteById(Long id) {
        return iPiste.retrievePisteById(id);
    }

    @Override
    public List<Piste> retrieveAllPister() {
        return iPiste.retrieveAllPister();
    }

    @Override
    public void deletePiste(Long id) {
iPiste.deletePiste(id);
    }
}
