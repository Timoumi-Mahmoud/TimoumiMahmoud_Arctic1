package tn.mahmoud.timoumi_1.entity;

import sun.print.resources.serviceui_zh_TW;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Moniteur")
public class Moniteur {
    @Id
    private long numMoniteur;
    private String nomM;
    private String prenomM ;
    private Date dateRecu;


    @OneToMany
    private Set<Cours> cour;



    public Moniteur() {
    }

    public Moniteur(long numMoniteur, String nomM, String prenomM, Date dateRecu) {
        this.numMoniteur = numMoniteur;
        this.nomM = nomM;
        this.prenomM = prenomM;
        this.dateRecu = dateRecu;
    }

    public long getNumMoniteur() {
        return numMoniteur;
    }

    public void setNumMoniteur(long numMoniteur) {
        this.numMoniteur = numMoniteur;
    }

    public String getNomM() {
        return nomM;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public String getPrenomM() {
        return prenomM;
    }

    public void setPrenomM(String prenomM) {
        this.prenomM = prenomM;
    }

    public Date getDateRecu() {
        return dateRecu;
    }

    public void setDateRecu(Date dateRecu) {
        this.dateRecu = dateRecu;
    }

    @Override
    public String toString() {
        return "Moniteur{" +
                "numMoniteur=" + numMoniteur +
                ", nomM='" + nomM + '\'' +
                ", prenomM='" + prenomM + '\'' +
                ", dateRecu=" + dateRecu +
                '}';
    }
}
