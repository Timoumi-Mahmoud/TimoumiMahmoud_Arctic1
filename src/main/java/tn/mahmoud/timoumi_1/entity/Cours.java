package tn.mahmoud.timoumi_1.entity;
/*

oneTomany uni TR
 */



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="Cours")
public class Cours {
    @Id
    private long numSkieur ;
    private String nomS;
    private String prenomS;
    private Date dateNaissance;
    private String vile;

    public Cours() {
    }

    public Cours(long numSkieur, String nomS, String prenomS, Date dateNaissance, String vile) {
        this.numSkieur = numSkieur;
        this.nomS = nomS;
        this.prenomS = prenomS;
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

    public String getPrenomS() {
        return prenomS;
    }

    public void setPrenomS(String prenomS) {
        this.prenomS = prenomS;
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


    @OneToMany(mappedBy = "cour")
    private Set<Inscription> inscriptions;

    @Override
    public String toString() {
        return "Cours{" +
                "numSkieur=" + numSkieur +
                ", nomS='" + nomS + '\'' +
                ", prenomS='" + prenomS + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", vile='" + vile + '\'' +
                '}';
    }
}
