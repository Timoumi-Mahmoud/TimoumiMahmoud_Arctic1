package tn.mahmoud.timoumi_1.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Skieur")
public class Skieur {
    @Id
    private long numSkieur;
    private String nomS;
    private Date dateNaissance;
    private String  vile;
/*

    @ManyToMany(targetEntity = Piste.class,cascade = {CascadeType.PERSIST, CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH} , fetch = FetchType.EAGER)
    private Set<Piste> Pistes  ;

 */

    @OneToOne
   private Abonnement Abonnements;


    @OneToMany(mappedBy = "skieur")
    private Set<Inscription> insc ;


    @ManyToMany
    private Set<Piste> pistes;


    public Skieur() {
    }


    public Skieur(long numSkieur, String nomS, Date dateNaissance, String vile) {
        this.numSkieur = numSkieur;
        this.nomS = nomS;
        this.dateNaissance = dateNaissance;
        this.vile = vile;
    }


    public long getNumSkieur() {
        return numSkieur;
    }

    public void setNumSkieur(long numSkieur) {
        this.numSkieur = numSkieur;
    }

    public String getNomS() {
        return nomS;
    }

    public void setNomS(String nomS) {
        this.nomS = nomS;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVile() {
        return vile;
    }

    public void setVile(String vile) {
        this.vile = vile;
    }
}
//oneToMany uni / mapped by