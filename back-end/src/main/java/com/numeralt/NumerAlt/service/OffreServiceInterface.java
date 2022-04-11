package com.numeralt.NumerAlt.service;

import com.numeralt.NumerAlt.entity.Offre;

import java.util.List;
import java.util.Optional;

public interface OffreServiceInterface {

    Optional<Offre> findById(Long idOffre);

    List<Offre> findAll();
}
