package com.epul.projetoeuvre.entity;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by clementserrano on 25/03/2018.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Reservation {
    @EmbeddedId
    private ReservationId reservationId;
    private Date dateReservation;
    private String statut;
}
