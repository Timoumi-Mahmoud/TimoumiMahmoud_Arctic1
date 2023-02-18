package tn.mahmoud.timoumi_1.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name ="Piste")
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long numPiste ;
    private String nomPiste;
    private Couleur couleur;
    private int longeur;
    private int pente;

    public Piste() {
    }

/*
    @ManyToMany(targetEntity = Skieur.class,cascade = {CascadeType.PERSIST, CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH} , fetch = FetchType.EAGER)
    private Set<Skieur> Skieurs  ;



*/

    @ManyToMany(mappedBy = "pistes")
    private Set<Skieur> skieurs;



    public Piste(long numPiste, String nomPiste, Couleur couleur, int longeur, int pente) {

        this.numPiste = numPiste;
        this.nomPiste = nomPiste;
        this.couleur = couleur;
        this.longeur = longeur;
        this.pente = pente;
    }






    public long getNumPiste() {
        return numPiste;
    }

    public void setNumPiste(long numPiste) {
        this.numPiste = numPiste;
    }

    public String getNomPiste() {
        return nomPiste;
    }

    public void setNomPiste(String nomPiste) {
        this.nomPiste = nomPiste;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public int getLongeur() {
        return longeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }

    public int getPente() {
        return pente;
    }

    public void setPente(int pente) {
        this.pente = pente;
    }

    @Override
    public String toString() {
        return "Piste{" +
                "numPiste=" + numPiste +
                ", nomPiste='" + nomPiste + '\'' +
                ", couleur=" + couleur +
                ", longeur=" + longeur +
                ", pente=" + pente +
                '}';
    }
}
