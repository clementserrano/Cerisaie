package com.epul.projetoeuvre.dao;

import com.epul.projetoeuvre.entity.Reservation;
import com.epul.projetoeuvre.entity.ReservationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Created by clementserrano on 25/03/2018.
 */
@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface ReservationRepository extends JpaRepository<Reservation, ReservationId> {
}
