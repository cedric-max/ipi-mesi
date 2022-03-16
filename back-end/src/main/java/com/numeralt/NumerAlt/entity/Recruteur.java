package com.numeralt.NumerAlt.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Recruteur {

    /*
    * `id_recruteur` INT NOT NULL AUTO_INCREMENT,
  `prenom` VARCHAR(45) NOT NULL,
  `nom` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `photo` VARCHAR(100) NULL,
  `libelle_entreprise` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_recruteur`));*/
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private Long id_recruteur;

    private String prenom;

    private String nom;

    private String email;

    private String photo;

    private String libelle_entreprise;

    //GETTER AND SETTER


    public Long getId_recruteur() {
        return id_recruteur;
    }

    public void setId_recruteur(Long id_recruteur) {
        this.id_recruteur = id_recruteur;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getLibelle_entreprise() {
        return libelle_entreprise;
    }

    public void setLibelle_entreprise(String libelle_entreprise) {
        this.libelle_entreprise = libelle_entreprise;
    }
}
