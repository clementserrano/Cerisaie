package com.epul.projetoeuvre.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by clementserrano on 25/03/2018.
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class ReservationId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "id_oeuvrevente")
    private Oeuvrevente oeuvrevente;
    @ManyToOne
    @JoinColumn(name = "id_adherent")
    private Adherent adherent;
}
