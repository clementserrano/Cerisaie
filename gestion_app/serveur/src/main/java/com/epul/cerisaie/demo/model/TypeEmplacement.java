package com.epul.cerisaie.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "type_emplacement", schema = "cerisaie")
public class TypeEmplacementEntity {
    private int codeTypeE;
    private String libtypepl;
    private int tariftypepl;

    @Id
    @Column(name = "CodeTypeE")
    public int getCodeTypeE() {
        return codeTypeE;
    }

    public void setCodeTypeE(int codeTypeE) {
        this.codeTypeE = codeTypeE;
    }

    @Basic
    @Column(name = "LIBTYPEPL")
    public String getLibtypepl() {
        return libtypepl;
    }

    public void setLibtypepl(String libtypepl) {
        this.libtypepl = libtypepl;
    }

    @Basic
    @Column(name = "TARIFTYPEPL")
    public int getTariftypepl() {
        return tariftypepl;
    }

    public void setTariftypepl(int tariftypepl) {
        this.tariftypepl = tariftypepl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeEmplacementEntity that = (TypeEmplacementEntity) o;
        return codeTypeE == that.codeTypeE &&
                tariftypepl == that.tariftypepl &&
                Objects.equals(libtypepl, that.libtypepl);
    }

    @Override
    public int hashCode() {

        return Objects.hash(codeTypeE, libtypepl, tariftypepl);
    }
}
