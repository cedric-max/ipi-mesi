package com.numeralt.NumerAlt.repository;

import com.numeralt.NumerAlt.entity.Recruteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruteurRepositoryInterface extends JpaRepository<Recruteur, Long> {
    Recruteur findByEmail(String email);
}
