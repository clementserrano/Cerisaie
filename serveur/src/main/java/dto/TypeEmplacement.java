package dto;

import java.io.Serializable;

public class TypeEmplacement implements Serializable {
    private int codeTypeE;
    private String libtypepl;
    private int tariftypepl;

    public int getCodeTypeE() {
        return codeTypeE;
    }

    public void setCodeTypeE(int codeTypeE) {
        this.codeTypeE = codeTypeE;
    }

    public String getLibtypepl() {
        return libtypepl;
    }

    public void setLibtypepl(String libtypepl) {
        this.libtypepl = libtypepl;
    }

    public int getTariftypepl() {
        return tariftypepl;
    }

    public void setTariftypepl(int tariftypepl) {
        this.tariftypepl = tariftypepl;
    }
}
