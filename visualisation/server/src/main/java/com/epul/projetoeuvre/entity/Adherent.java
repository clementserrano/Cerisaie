package com.epul.projetoeuvre.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created by clementserrano on 24/03/2018.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Adherent {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idAdherent;
    private @NonNull
    String nomAdherent;
    private @NonNull
    String prenomAdherent;
    private String villeAdherent;
}
