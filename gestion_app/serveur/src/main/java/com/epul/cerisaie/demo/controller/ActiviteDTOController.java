package com.epul.cerisaie.demo.controller;

import com.epul.cerisaie.demo.dto.IActiviteProjection;
import com.epul.cerisaie.demo.service.impl.ActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api/activite")
public class ActiviteDTOController {

    @Autowired
    private ActiviteService activiteService;

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getActiviteDTO(@PathVariable("id") int id) {
        List<IActiviteProjection> activites = activiteService.getActivite(id);

        return new ResponseEntity<>(activites, HttpStatus.OK);
    }


    @GetMapping("/getAll")
    public ResponseEntity<?> getActivites() {
        List<IActiviteProjection> activites = activiteService.getActivites();

        return new ResponseEntity<>(activites, HttpStatus.OK);
    }
}
