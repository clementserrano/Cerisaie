package com.epul.projetoeuvre.controller;

import com.epul.projetoeuvre.dao.ProprietaireRepository;
import com.epul.projetoeuvre.entity.Proprietaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by clementserrano on 25/03/2018.
 */
@RestController
@RequestMapping("/api/proprietaire")
public class ProprietaireController {
    @Autowired
    private ProprietaireRepository proprietaireRepository;

    @GetMapping("/getAll")
    public List<Proprietaire> getAll() {
        return proprietaireRepository.findAll();
    }
}
