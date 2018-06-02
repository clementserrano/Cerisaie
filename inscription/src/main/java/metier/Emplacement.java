package metier;

public class Emplacement {
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

    public Emplacement(int numEmpl, short surfaceEmpl, short nbPersMaxEmpl) {

        this.numEmpl = numEmpl;
        this.surfaceEmpl = surfaceEmpl;
        this.nbPersMaxEmpl = nbPersMaxEmpl;
    }
}
