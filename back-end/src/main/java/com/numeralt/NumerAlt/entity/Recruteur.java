package com.numeralt.NumerAlt.entity;

import javax.persistence.*;

@Entity
@Table(name = "recruteur")
public class Recruteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recruteur")
    private Long idRecruteur;

    private String prenom;

    private String nom;

    private String email;

    private String photo;

    @Column(name = "libelle_entreprise")
    private String libelleEntreprise;

    private String motDePasse;

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

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
