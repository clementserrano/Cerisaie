package metier;

import javax.persistence.*;

@Entity
@Table(name = "client", schema = "cerisaie", catalog = "")
public class ClientEntity {
    private int numCli;
    private String nomCli;
    private String adrRueCli;
    private int cpCli;
    private String villeCli;
    private String pieceCli;
    private int numPieceCli;

    @Id
    @Column(name = "NumCli")
    public int getNumCli() {
        return numCli;
    }

    public void setNumCli(int numCli) {
        this.numCli = numCli;
    }

    @Basic
    @Column(name = "NomCli")
    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    @Basic
    @Column(name = "AdrRueCli")
    public String getAdrRueCli() {
        return adrRueCli;
    }

    public void setAdrRueCli(String adrRueCli) {
        this.adrRueCli = adrRueCli;
    }

    @Basic
    @Column(name = "CpCli")
    public int getCpCli() {
        return cpCli;
    }

    public void setCpCli(int cpCli) {
        this.cpCli = cpCli;
    }

    @Basic
    @Column(name = "VilleCli")
    public String getVilleCli() {
        return villeCli;
    }

    public void setVilleCli(String villeCli) {
        this.villeCli = villeCli;
    }

    @Basic
    @Column(name = "PieceCli")
    public String getPieceCli() {
        return pieceCli;
    }

    public void setPieceCli(String pieceCli) {
        this.pieceCli = pieceCli;
    }

    @Basic
    @Column(name = "NumPieceCli")
    public int getNumPieceCli() {
        return numPieceCli;
    }

    public void setNumPieceCli(int numPieceCli) {
        this.numPieceCli = numPieceCli;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientEntity that = (ClientEntity) o;

        if (numCli != that.numCli) return false;
        if (cpCli != that.cpCli) return false;
        if (numPieceCli != that.numPieceCli) return false;
        if (nomCli != null ? !nomCli.equals(that.nomCli) : that.nomCli != null) return false;
        if (adrRueCli != null ? !adrRueCli.equals(that.adrRueCli) : that.adrRueCli != null) return false;
        if (villeCli != null ? !villeCli.equals(that.villeCli) : that.villeCli != null) return false;
        if (pieceCli != null ? !pieceCli.equals(that.pieceCli) : that.pieceCli != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numCli;
        result = 31 * result + (nomCli != null ? nomCli.hashCode() : 0);
        result = 31 * result + (adrRueCli != null ? adrRueCli.hashCode() : 0);
        result = 31 * result + cpCli;
        result = 31 * result + (villeCli != null ? villeCli.hashCode() : 0);
        result = 31 * result + (pieceCli != null ? pieceCli.hashCode() : 0);
        result = 31 * result + numPieceCli;
        return result;
    }
}
