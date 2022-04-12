package com.numeralt.NumerAlt.service;

import com.numeralt.NumerAlt.dto.UserDto;
import com.numeralt.NumerAlt.entity.Candidat;
import com.numeralt.NumerAlt.entity.Recruteur;
import com.numeralt.NumerAlt.repository.RecruteurRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class RecruteurService implements RecruteurServiceInterface {

    @Autowired
    private RecruteurRepositoryInterface recruteurRepository;

    public Recruteur registerNewRecruteurAccount(UserDto recruteurDto) throws Exception {
        if(emailExist(recruteurDto.getEmail())) {
            throw new Exception("Il existe déjà un compte pour cette adresse email : " + recruteurDto.getEmail());
        }

        Recruteur recruteur = new Recruteur();
        recruteur.setPrenom(recruteurDto.getPrenom());
        recruteur.setNom(recruteurDto.getNom());
        recruteur.setMotDePasse(recruteurDto.getMotDePasse());
        recruteur.setEmail(recruteurDto.getEmail());
        //recruteur.setRole("ROLE_USER");

        return recruteurRepository.save(recruteur);
    }

    private Boolean emailExist(String email) {
        return recruteurRepository.findByEmail(email) != null;
    }
}
