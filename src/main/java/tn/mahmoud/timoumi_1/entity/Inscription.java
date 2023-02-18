package tn.mahmoud.timoumi_1.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Inscription")
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long numAbon;

    private Date dateDebut;
    private Date dateFin;
    private float  prixAbon;
    private TypeAbonnement typeAbon;



    @ManyToOne
    private Skieur skieur;
    @ManyToOne
    private  Cours cour;

    public Inscription() {
    }

    public Inscription(long numAbon, Date dateDebut, Date dateFin, float prixAbon, TypeAbonnement typeAbon) {
        this.numAbon = numAbon;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prixAbon = prixAbon;
        this.typeAbon = typeAbon;
    }

    public long getNumAbon() {
        return numAbon;
    }

    public void setNumAbon(long numAbon) {
        this.numAbon = numAbon;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public float getPrixAbon() {
        return prixAbon;
    }

    public void setPrixAbon(float prixAbon) {
        this.prixAbon = prixAbon;
    }

    public TypeAbonnement getTypeAbon() {
        return typeAbon;
    }

    public void setTypeAbon(TypeAbonnement typeAbon) {
        this.typeAbon = typeAbon;
    }


    @Override
    public String toString() {
        return "Inscription{" +
                "numAbon=" + numAbon +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", prixAbon=" + prixAbon +
                ", typeAbon=" + typeAbon +
                '}';
    }
}
