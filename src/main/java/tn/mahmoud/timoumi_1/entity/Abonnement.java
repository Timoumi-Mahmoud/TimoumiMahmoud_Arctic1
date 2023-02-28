package tn.mahmoud.timoumi_1.entity;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;




    @Entity
    @Table(name = "Abonnement")
    public class Abonnement {
        @Id
        private long numAbon;
        private Date dateDebut;
        private Date dateFin;
        private Float prixAbon;

        @Enumerated
        private TypeAbonnement typeAbon;


        public Abonnement() {
        }

        public Abonnement(long numAbon, Date dateDebut, Date dateFin, Float prixAbon, TypeAbonnement typeAbon) {
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

        public Float getPrixAbon() {
            return prixAbon;
        }

        public void setPrixAbon(Float prixAbon) {
            this.prixAbon = prixAbon;
        }

        public TypeAbonnement getTypeAbon() {
            return typeAbon;
        }

        public void setTypeAbon(TypeAbonnement typeAbon) {
            this.typeAbon = typeAbon;
        }



    }
