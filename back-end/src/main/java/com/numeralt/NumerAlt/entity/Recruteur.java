package com.numeralt.NumerAlt.entity;

import javax.persistence.*;

@Entity
@Table(name="recruteur")
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
    private Long idRecruteur;

    private String prenom;

    private String nom;

    private String email;

    private String motDePasse;

    private String photo;

    private String libelleEntreprise;

    public Long getIdRecruteur() {
        return idRecruteur;
    }

    public void setIdRecruteur(Long idRecruteur) {
        this.idRecruteur = idRecruteur;
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

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getLibelleEntreprise() {
        return libelleEntreprise;
    }

    public void setLibelleEntreprise(String libelleEntreprise) {
        this.libelleEntreprise = libelleEntreprise;
    }
}
