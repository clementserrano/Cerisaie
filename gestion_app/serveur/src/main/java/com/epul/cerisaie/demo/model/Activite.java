package com.epul.cerisaie.demo.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "activite", schema = "cerisaie")
@IdClass(ActivitePK.class)
public class Activite {
    private int sport;
    private Date dateJour;
    private int numSej;
    private Integer nbLoc;

    @Id
    @Column(name = "CodeSport")
    public int getSport() {
        return sport;
    }

    public void setSport(int codeSport) {
        this.sport = codeSport;
    }

    @Id
    @Column(name = "DateJour")
    public Date getDateJour() {
        return dateJour;
    }

    public void setDateJour(Date dateJour) {
        this.dateJour = dateJour;
    }

    @Id
    @Column(name = "NumSej")
    public int getNumSej() {
        return numSej;
    }

    public void setNumSej(int numSej) {
        this.numSej = numSej;
    }

    @Basic
    @Column(name = "NbLoc")
    public Integer getNbLoc() {
        return nbLoc;
    }

    public void setNbLoc(Integer nbLoc) {
        this.nbLoc = nbLoc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activite that = (Activite) o;
        return sport == that.sport &&
                numSej == that.numSej &&
                Objects.equals(nbLoc, that.nbLoc) &&
                Objects.equals(dateJour, that.dateJour);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sport, dateJour, numSej, nbLoc);
    }
}
