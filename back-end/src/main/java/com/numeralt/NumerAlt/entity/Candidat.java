package com.numeralt.NumerAlt.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "candidat")
public class Candidat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_candidat")
    private Long idCandidat;

    private String prenom;

    private String nom;

    private String email;

    private String photo;
    @Column(name = "date_naissance")
    private Date dateNaissance;

    private String adresse;
    @Column(name = "permis_conduire")
    private String permisDeConduire;
    @Column(name = "soft_skills")
    private String softSkills;
    @Column(name = "centres_interet")
    private String centresInteret;
    @Column(name = "site_internet")
    private String siteInternet;
    @Column(name = "lien_github")
    private String lienGithub;
    @Column(name = "mot_de_passe")
    private String motDePasse;

    // GETTER AND SETTER

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

    public String getPermisDeConduire() {
        return permisDeConduire;
    }

    public void setPermisDeConduire(String permisDeConduire) {
        this.permisDeConduire = permisDeConduire;
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

    public String getSiteInternet() {
        return siteInternet;
    }

    public void setSiteInternet(String siteInternet) {
        this.siteInternet = siteInternet;
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
}
