package metier;

import java.sql.Date;

public class Sejour {
    private int numSej;
    private Date datedebSej;
    private Date dateFinSej;
    private int nbPersonnes;

    public int getNumSej() {
        return numSej;
    }

    public void setNumSej(int numSej) {
        this.numSej = numSej;
    }

    public Date getDatedebSej() {
        return datedebSej;
    }

    public void setDatedebSej(Date datedebSej) {
        this.datedebSej = datedebSej;
    }

    public Date getDateFinSej() {
        return dateFinSej;
    }

    public void setDateFinSej(Date dateFinSej) {
        this.dateFinSej = dateFinSej;
    }

    public int getNbPersonnes() {
        return nbPersonnes;
    }

    public void setNbPersonnes(int nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    public Sejour(int numSej, Date datedebSej, Date dateFinSej, int nbPersonnes) {

        this.numSej = numSej;
        this.datedebSej = datedebSej;
        this.dateFinSej = dateFinSej;
        this.nbPersonnes = nbPersonnes;
    }
}
