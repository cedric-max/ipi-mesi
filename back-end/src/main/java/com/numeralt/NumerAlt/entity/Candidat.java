package com.numeralt.NumerAlt.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="candidat")
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
  `permis_conduire` TINYINT NOT NULL,
  `soft_skills` VARCHAR(200) NULL,
  `centres_interet` VARCHAR(200) NULL,
  `site_internet` VARCHAR(75) NULL,
  `lien_github` VARCHAR(75) NULL,*/
    private Long idCandidat;

    private String prenom;

    private String nom;

    private String email;

    private String photo;

    private Date dateNaissance;

    private String adresse;

    private String permisConduire;

    private String softSkills;

    private String centresInteret;

    private String site_internet;

    private String lienGithub;

    private String motDePasse;

    private String role;

    //GETTER AND SETTER

    public Long getIdCandidat() {
        return idCandidat;
    }

    public void setIdCandidat(Long idCandidat) {
        this.idCandidat = idCandidat;
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPermisConduire() {
        return permisConduire;
    }

    public void setPermisConduire(String permisConduire) {
        this.permisConduire = permisConduire;
    }

    public String getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(String softSkills) {
        this.softSkills = softSkills;
    }

    public String getCentresInteret() {
        return centresInteret;
    }

    public void setCentresInteret(String centresInteret) {
        this.centresInteret = centresInteret;
    }

    public String getSite_internet() {
        return site_internet;
    }

    public void setSite_internet(String site_internet) {
        this.site_internet = site_internet;
    }

    public String getLienGithub() {
        return lienGithub;
    }

    public void setLienGithub(String lienGithub) {
        this.lienGithub = lienGithub;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
