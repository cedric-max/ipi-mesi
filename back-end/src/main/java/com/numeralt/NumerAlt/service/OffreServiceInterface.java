package com.numeralt.NumerAlt.service;

import com.numeralt.NumerAlt.entity.Offre;

import java.util.List;
import java.util.Optional;

public interface OffreServiceInterface {

    Optional<Offre> findById(Long id_offre);
    List<Offre> findAll();
}
