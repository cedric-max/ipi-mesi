package com.numeralt.NumerAlt.controller;

import com.numeralt.NumerAlt.entity.Offre;
import com.numeralt.NumerAlt.service.OffreServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping(value = "/offre")
@CrossOrigin
public class OffreController {

    @Autowired
    private OffreServiceInterface offreService;

    //  Permet de récupérer une offre avec son iD
    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{id_offre}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Offre getOfferById(@PathVariable Long id_offre) {
        return offreService.findById(id_offre).get();
    }

    //  Permet de récupérer l'intégralité des offres
    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Offre> findAll() {
        return offreService.findAll();
    }
}