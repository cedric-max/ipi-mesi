package com.numeralt.NumerAlt.repository;

import com.numeralt.NumerAlt.entity.Offre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OffreRepository extends JpaRepository<Offre, Long> {

    List<Offre> findAll();
}