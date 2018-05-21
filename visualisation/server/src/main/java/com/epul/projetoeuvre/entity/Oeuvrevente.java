package com.epul.projetoeuvre.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created by clementserrano on 25/03/2018.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Oeuvrevente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOeuvrevente;
    private @NonNull
    String titreOeuvrevente;
    private String etatOeuvrevente;
    private Float prixOeuvrevente;
    @ManyToOne
    @JoinColumn(name = "id_proprietaire")
    private Proprietaire proprietaire;
}
