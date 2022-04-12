package com.numeralt.NumerAlt.repository;

import com.numeralt.NumerAlt.entity.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatRepositoryInterface extends JpaRepository<Candidat, Long> {
    Candidat findByEmail(String email);
}
