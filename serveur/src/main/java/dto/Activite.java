package dto;

import java.sql.Date;

public class Activite {
    private int codeSport;
    private Date dateJour;
    private int numSej;
    private short nbLoc;

    public Activite(int codeSport, Date dateJour, int numSej, short nbLoc) {
        this.codeSport = codeSport;
        this.dateJour = dateJour;
        this.numSej = numSej;
        this.nbLoc = nbLoc;
    }

    public int getCodeSport() {
        return codeSport;
    }

    public void setCodeSport(int codeSport) {
        this.codeSport = codeSport;
    }

    public Date getDateJour() {
        return dateJour;
    }

    public void setDateJour(Date dateJour) {
        this.dateJour = dateJour;
    }

    public int getNumSej() {
        return numSej;
    }

    public void setNumSej(int numSej) {
        this.numSej = numSej;
    }

    public short getNbLoc() {
        return nbLoc;
    }

    public void setNbLoc(short nbLoc) {
        this.nbLoc = nbLoc;
    }
}
