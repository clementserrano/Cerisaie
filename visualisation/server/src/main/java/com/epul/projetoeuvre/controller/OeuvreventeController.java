package com.epul.projetoeuvre.controller;

import com.epul.projetoeuvre.dao.OeuvreventeRepository;
import com.epul.projetoeuvre.entity.Oeuvrevente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by clementserrano on 25/03/2018.
 */
@RestController
@RequestMapping("/api/oeuvrevente")
public class OeuvreventeController {
    @Autowired
    private OeuvreventeRepository oeuvreventeRepository;

    @GetMapping("/getAll")
    public List<Oeuvrevente> getAll() {
        return oeuvreventeRepository.findAll();
    }

    @GetMapping("/get/{idOeuvrevente}")
    public Oeuvrevente get(@PathVariable Long idOeuvrevente) {
        return oeuvreventeRepository.getOne(idOeuvrevente);
    }

    @PostMapping("/add")
    public Oeuvrevente add(@RequestBody Oeuvrevente oeuvrevente) {
        return oeuvreventeRepository.save(oeuvrevente);
    }
}
