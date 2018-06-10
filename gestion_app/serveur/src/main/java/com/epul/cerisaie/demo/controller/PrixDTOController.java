package com.epul.cerisaie.demo.controller;

import com.epul.cerisaie.demo.dto.IPrixProjection;
import com.epul.cerisaie.demo.dto.ISportProjection;
import com.epul.cerisaie.demo.service.impl.PrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api/prix")
public class PrixDTOController {

    @Autowired
    PrixService prixService;

    @GetMapping("/getAll")
    public ResponseEntity<?> getPrix() {
        List<IPrixProjection> prix = prixService.getPrix();

        return new ResponseEntity<>(prix, HttpStatus.OK);
    }

}
