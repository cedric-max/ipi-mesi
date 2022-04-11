package com.numeralt.NumerAlt.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "offre")
public class Offre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_offre")
    private Long idOffre;

    private String reference;

    private String titre;

    @Column(name = "nom_entreprise")
    private String nomEntreprise;

    @Column(name = "date_creation")
    private Date dateCreation;

    @Column(name = "date_fin_validite")
    private Date dateFinValidite;

    private String description;

    private String ville;

    @Column(name = "niveau_diplome_vise")
    private String niveauDiplomeVise;

    private String logo;

    @Column(name = "profil_souhaite")
    private String profilSouhaite;

    @Column(name = "profil_minimum")
    private String profilMinimum;

    @Column(name = "connaissance_necessaire")
    private String connaissancesNecessaires;

    @Column(name = "outil_necessaire")
    private String outilsNecessaires;

    @Column(name = "salaire_indicatif")
    private Integer salaireIndicatif;

    // GETTER AND SETTER


    public Long getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(Long idOffre) {
        this.idOffre = idOffre;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateFinValidite() {
        return dateFinValidite;
    }

    public void setDateFinValidite(Date dateFinValidite) {
        this.dateFinValidite = dateFinValidite;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNiveauDiplomeVise() {
        return niveauDiplomeVise;
    }

    public void setNiveauDiplomeVise(String niveauDiplomeVise) {
        this.niveauDiplomeVise = niveauDiplomeVise;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getProfilSouhaite() {
        return profilSouhaite;
    }

    public void setProfilSouhaite(String profilSouhaite) {
        this.profilSouhaite = profilSouhaite;
    }

    public String getProfilMinimum() {
        return profilMinimum;
    }

    public void setProfilMinimum(String profilMinimum) {
        this.profilMinimum = profilMinimum;
    }

    public String getConnaissancesNecessaires() {
        return connaissancesNecessaires;
    }

    public void setConnaissancesNecessaires(String connaissancesNecessaires) {
        this.connaissancesNecessaires = connaissancesNecessaires;
    }

    public String getOutilsNecessaires() {
        return outilsNecessaires;
    }

    public void setOutilsNecessaires(String outilsNecessaires) {
        this.outilsNecessaires = outilsNecessaires;
    }

    public Integer getSalaireIndicatif() {
        return salaireIndicatif;
    }

    public void setSalaireIndicatif(Integer salaireIndicatif) {
        this.salaireIndicatif = salaireIndicatif;
    }
}
