package com.numeralt.NumerAlt.service;

import com.numeralt.NumerAlt.dto.UserDto;
import com.numeralt.NumerAlt.entity.Candidat;
import com.numeralt.NumerAlt.repository.CandidatRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CandidatService implements CandidatServiceInterface {

    @Autowired
    private CandidatRepositoryInterface candidatRepository;

    public Candidat registerNewCandidatAccount(UserDto candidatDto) throws Exception {
        if(emailExist(candidatDto.getEmail())) {
            throw new Exception("Il existe déjà un compte pour cette adresse email : " + candidatDto.getEmail());
        }

        Candidat candidat = new Candidat();
        candidat.setPrenom(candidatDto.getPrenom());
        candidat.setNom(candidatDto.getNom());
        candidat.setMotDePasse(candidatDto.getMotDePasse());
        candidat.setEmail(candidatDto.getEmail());
        //candidat.setRole("ROLE_USER");

        return candidatRepository.save(candidat);
    }

    private Boolean emailExist(String email) {
        return candidatRepository.findByEmail(email) != null;
    }
}
