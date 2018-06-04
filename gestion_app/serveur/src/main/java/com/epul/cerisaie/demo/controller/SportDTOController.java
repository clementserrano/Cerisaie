package com.epul.cerisaie.demo.controller;

import com.epul.cerisaie.demo.dto.ISportProjection;
import com.epul.cerisaie.demo.service.impl.SportService;
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
@RequestMapping("/api/sport")
public class SportDTOController {

    @Autowired
    private SportService sportService;

    @GetMapping("/getAll")
    public ResponseEntity<?> getSports() {
        List<ISportProjection> sports = sportService.getSports();

        return new ResponseEntity<>(sports, HttpStatus.OK);
    }
}
