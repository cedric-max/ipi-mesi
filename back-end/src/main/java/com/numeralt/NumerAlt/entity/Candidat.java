package com.numeralt.NumerAlt.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Candidat {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
/*
* `id_candidat` INT NOT NULL AUTO_INCREMENT,
  `prenom` VARCHAR(45) NOT NULL,
  `nom` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `photo` VARCHAR(100) NULL,
  `date_naissance` DATE NOT NULL,
  `adresse` VARCHAR(100) NOT NULL,
  `permis de conduire` TINYINT NOT NULL,
  `soft_skills` VARCHAR(200) NULL,
  `centres_interet` VARCHAR(200) NULL,
  `site_internet` VARCHAR(75) NULL,
  `lien_github` VARCHAR(75) NULL,*/
    private Long id_candidat;

    private String prenom;

    private String nom;

    private String email;

    private String photo;

    private Date date_naissance;

    private String adresse;

    private String permis_de_conduire;

    private String softSkills;

    private String centres_interet;

    private String site_internet;

    private String lien_github;

    //GETTER AND SETTER

    public Long getId_candidat() {
        return id_candidat;
    }

    public void setId_candidat(Long id_candidat) {
        this.id_candidat = id_candidat;
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

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPermis_de_conduire() {
        return permis_de_conduire;
    }

    public void setPermis_de_conduire(String permis_de_conduire) {
        this.permis_de_conduire = permis_de_conduire;
    }

    public String getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(String softSkills) {
        this.softSkills = softSkills;
    }

    public String getCentres_interet() {
        return centres_interet;
    }

    public void setCentres_interet(String centres_interet) {
        this.centres_interet = centres_interet;
    }

    public String getSite_internet() {
        return site_internet;
    }

    public void setSite_internet(String site_internet) {
        this.site_internet = site_internet;
    }

    public String getLien_github() {
        return lien_github;
    }

    public void setLien_github(String lien_github) {
        this.lien_github = lien_github;
    }
}
