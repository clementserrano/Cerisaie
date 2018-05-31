package com.epul.cerisaie.demo.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Client {
    @Id
    @GeneratedValue
    private Long numCli;

    private @NonNull
    String nomCli;

    private @NonNull
    String adrRueCli;

    private @NonNull
    Integer cpCli;

    private @NonNull
    String villeCli;

    private @NonNull
    String pieceCli;

    private @NonNull
    Integer numPieceCli;

}
