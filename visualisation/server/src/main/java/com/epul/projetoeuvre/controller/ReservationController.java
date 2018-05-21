package com.epul.projetoeuvre.controller;

import com.epul.projetoeuvre.dao.ReservationRepository;
import com.epul.projetoeuvre.entity.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by clementserrano on 25/03/2018.
 */
@RestController
@RequestMapping("/api/reservation")
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;

    @PostMapping("/add")
    public Reservation add(@RequestBody Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
