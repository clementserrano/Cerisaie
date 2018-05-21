package com.epul.projetoeuvre.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by clementserrano on 25/03/2018.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Proprietaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProprietaire;
    private @NonNull
    String nomProprietaire;
    private @NonNull
    String prenomProprietaire;
}
