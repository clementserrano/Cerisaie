package com.epul.cerisaie.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "client", schema = "cerisaie")
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
        return numCli == that.numCli &&
                cpCli == that.cpCli &&
                numPieceCli == that.numPieceCli &&
                Objects.equals(nomCli, that.nomCli) &&
                Objects.equals(adrRueCli, that.adrRueCli) &&
                Objects.equals(villeCli, that.villeCli) &&
                Objects.equals(pieceCli, that.pieceCli);
    }

    @Override
    public int hashCode() {

        return Objects.hash(numCli, nomCli, adrRueCli, cpCli, villeCli, pieceCli, numPieceCli);
    }
}
