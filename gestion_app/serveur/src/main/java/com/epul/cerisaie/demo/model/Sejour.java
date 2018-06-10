package com.epul.cerisaie.demo.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "sejour", schema = "cerisaie")
public class Sejour {
    private Integer numSej;
    private Integer numCli;
    private Integer numEmpl;
    private Date datedebSej;
    private Date dateFinSej;
    private int nbPersonnes;

    @Id
    @Column(name = "NumSej")
    public Integer getNumSej() {
        return numSej;
    }

    public void setNumSej(Integer numSej) {
        this.numSej = numSej;
    }

    @Basic
    @Column(name = "NumCli")
    public Integer getNumCli(){ return numCli; }

    public void setNumCli(Integer numCli) { this.numCli = numCli; }

    @Basic
    @Column(name = "NumEmpl")
    public Integer getNumEmpl(){ return numEmpl; }

    public void setNumEmpl(Integer numEmpl) {
        this.numEmpl = numEmpl;
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
        Sejour that = (Sejour) o;
        return  Objects.equals(numSej, that.numSej) &&
                nbPersonnes == that.nbPersonnes &&
                Objects.equals(datedebSej, that.datedebSej) &&
                Objects.equals(dateFinSej, that.dateFinSej);
    }

    @Override
    public int hashCode() {

        return Objects.hash(numSej, datedebSej, dateFinSej, nbPersonnes);
    }
}
