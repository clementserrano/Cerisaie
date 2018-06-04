package com.epul.cerisaie.demo.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "activite", schema = "cerisaie")
@IdClass(ActiviteEntityPK.class)
public class ActiviteEntity {
    private int codeSport;
    private Date dateJour;
    private int numSej;
    private short nbLoc;

    @Id
    @Column(name = "CodeSport")
    public int getCodeSport() {
        return codeSport;
    }

    public void setCodeSport(int codeSport) {
        this.codeSport = codeSport;
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
    public short getNbLoc() {
        return nbLoc;
    }

    public void setNbLoc(short nbLoc) {
        this.nbLoc = nbLoc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActiviteEntity that = (ActiviteEntity) o;
        return codeSport == that.codeSport &&
                numSej == that.numSej &&
                nbLoc == that.nbLoc &&
                Objects.equals(dateJour, that.dateJour);
    }

    @Override
    public int hashCode() {

        return Objects.hash(codeSport, dateJour, numSej, nbLoc);
    }
}
