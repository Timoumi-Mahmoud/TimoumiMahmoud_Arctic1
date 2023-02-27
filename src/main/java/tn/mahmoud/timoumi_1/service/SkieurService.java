package tn.mahmoud.timoumi_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.mahmoud.timoumi_1.entity.Skieur;
import tn.mahmoud.timoumi_1.repository.SkieurRepository;

import java.util.List;
@Service
public class SkieurService implements ISkieur {
    @Autowired
    SkieurRepository skieurRepository;

    @Override
    public Skieur addSkieur(Skieur sk) {
     return   skieurRepository.save(sk);
    }

    @Override
    public Skieur updateSkieur(Skieur sk) {
        return skieurRepository.save(sk);
    }

    @Override
    public Skieur retrieveSkieurById(Long id) {
       return skieurRepository.findById(id).orElse(null);
    }

    @Override
    public List<Skieur> retrieveAllSkieur() {
        return skieurRepository.findAll();
    }

    @Override
    public void deleteSkieur(Long id) {

   skieurRepository.deleteById(id);
    }
}
