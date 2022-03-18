package com.numeralt.NumerAlt.service;

import com.numeralt.NumerAlt.entity.Offre;
import com.numeralt.NumerAlt.repository.OffreRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class OffreService implements OffreServiceInterface {

    @Autowired
    private OffreRepositoryInterface offreRepository;

    @Override
    public Optional<Offre>findById(Long id_offre) {
        Optional<Offre> offre = offreRepository.findById(id_offre);
        if (offre.isEmpty()) {
            throw new EntityNotFoundException("L'offre avec l'identifiant " + id_offre + " n'existe pas !");
        }
        return offre;
    }

    @Override
    public List<Offre> findAll() {
        List<Offre> offreResponse = offreRepository.findAll();
        if (offreResponse.isEmpty()) {
            throw new EntityNotFoundException("Il n'y a pas d'offres en BDD !");
        }
        return offreResponse;
    }
}
