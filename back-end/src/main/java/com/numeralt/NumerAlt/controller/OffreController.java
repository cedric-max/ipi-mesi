package com.numeralt.NumerAlt.controller;

import com.numeralt.NumerAlt.entity.Offre;


import com.numeralt.NumerAlt.repository.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/offre")
public class OffreController {

    @Autowired
    private OffreRepository offreRepository;



    //  Permet de récupérer une offre avec son iD
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{id_offre}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )

    public Offre getOfferById(@PathVariable Long id_offre) {
        Optional<Offre> offre = offreRepository.findById(id_offre);
        if (offre.isEmpty()) {
            throw new EntityNotFoundException("L'offre avec l'identifiant " + id_offre + " n'existe pas !");
        }

        return offre.get();
    }

    //  Permet de récupérer l'intégralité des offres
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/",
            produces = MediaType.APPLICATION_JSON_VALUE
    )

    public List<Offre> findAll() {
        List<Offre> offreResponse = offreRepository.findAll();
        return offreResponse;
    }
}

