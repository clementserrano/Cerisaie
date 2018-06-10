package com.epul.cerisaie.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "emplacement", schema = "cerisaie")
public class Emplacement {
    private int numEmpl;
    private short surfaceEmpl;
    private short nbPersMaxEmpl;

    @Id
    @Column(name = "NumEmpl")
    public int getNumEmpl() {
        return numEmpl;
    }

    public void setNumEmpl(int numEmpl) {
        this.numEmpl = numEmpl;
    }

    @Basic
    @Column(name = "SurfaceEmpl")
    public short getSurfaceEmpl() {
        return surfaceEmpl;
    }

    public void setSurfaceEmpl(short surfaceEmpl) {
        this.surfaceEmpl = surfaceEmpl;
    }

    @Basic
    @Column(name = "NbPersMaxEmpl")
    public short getNbPersMaxEmpl() {
        return nbPersMaxEmpl;
    }

    public void setNbPersMaxEmpl(short nbPersMaxEmpl) {
        this.nbPersMaxEmpl = nbPersMaxEmpl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emplacement that = (Emplacement) o;
        return numEmpl == that.numEmpl &&
                surfaceEmpl == that.surfaceEmpl &&
                nbPersMaxEmpl == that.nbPersMaxEmpl;
    }

    @Override
    public int hashCode() {

        return Objects.hash(numEmpl, surfaceEmpl, nbPersMaxEmpl);
    }
}
