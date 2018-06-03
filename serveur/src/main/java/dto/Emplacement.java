package dto;

import java.io.Serializable;

public class Emplacement implements Serializable {
    private int numEmpl;
    private short surfaceEmpl;
    private short nbPersMaxEmpl;

    public int getNumEmpl() {
        return numEmpl;
    }

    public void setNumEmpl(int numEmpl) {
        this.numEmpl = numEmpl;
    }

    public short getSurfaceEmpl() {
        return surfaceEmpl;
    }

    public void setSurfaceEmpl(short surfaceEmpl) {
        this.surfaceEmpl = surfaceEmpl;
    }

    public short getNbPersMaxEmpl() {
        return nbPersMaxEmpl;
    }

    public void setNbPersMaxEmpl(short nbPersMaxEmpl) {
        this.nbPersMaxEmpl = nbPersMaxEmpl;
    }
}
