package com.epul.cerisaie.demo.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "sejour", schema = "cerisaie")
public class SejourEntity {
    private int numSej;
    private Date datedebSej;
    private Date dateFinSej;
    private int nbPersonnes;

    @Id
    @Column(name = "NumSej")
    public int getNumSej() {
        return numSej;
    }

    public void setNumSej(int numSej) {
        this.numSej = numSej;
    }

    @Basic
    @Column(name = "DatedebSej")
    public Date getDatedebSej() {
        return datedebSej;
    }

    public void setDatedebSej(Date datedebSej) {
        this.datedebSej = datedebSej;
    }

    @Basic
    @Column(name = "DateFinSej")
    public Date getDateFinSej() {
        return dateFinSej;
    }

    public void setDateFinSej(Date dateFinSej) {
        this.dateFinSej = dateFinSej;
    }

    @Basic
    @Column(name = "NbPersonnes")
    public int getNbPersonnes() {
        return nbPersonnes;
    }

    public void setNbPersonnes(int nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SejourEntity that = (SejourEntity) o;
        return numSej == that.numSej &&
                nbPersonnes == that.nbPersonnes &&
                Objects.equals(datedebSej, that.datedebSej) &&
                Objects.equals(dateFinSej, that.dateFinSej);
    }

    @Override
    public int hashCode() {

        return Objects.hash(numSej, datedebSej, dateFinSej, nbPersonnes);
    }
}
