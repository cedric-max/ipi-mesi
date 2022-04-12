package com.numeralt.NumerAlt.entity;

import javax.persistence.*;
import java.util.Date;


@Entity @Table(name = "offre")
public class Offre {

     /* `id_offre` INT NOT NULL AUTO_INCREMENT,
  `titre` VARCHAR(45) NOT NULL,
  `reference` VARCHAR(45) NOT NULL,
  `nom_entreprise` VARCHAR(45) NOT NULL,
  `date_creation` DATETIME NOT NULL,
  `date_fin_validite` DATE NULL,
  `description` VARCHAR(45) NOT NULL,
  `ville` VARCHAR(45) NOT NULL,
  `niveau_diplome_vise` VARCHAR(45) NULL,
  `id_recruteur` INT NOT NULL,*/

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private Long idOffre;

    private String reference;

    private String titre;

    private String nomEntreprise;

    private Date dateCreation;

    private Date dateFinValidite;

    private String description;

    private String ville;

    private String niveauDiplomeVise;

    public Long getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(Long offerId) {
        this.idOffre = offerId;
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

    public void setTitre(String title) {
        this.titre = title;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String companyName) {
        this.nomEntreprise = companyName;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date createdOn) {
        this.dateCreation = createdOn;
    }

    public Date getDateFinValidite() {
        return dateFinValidite;
    }

    public void setDateFinValidite(Date endsOn) {
        this.dateFinValidite = endsOn;
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

    public void setVille(String city) {
        this.ville = city;
    }

    public String getNiveauDiplomeVise() {
        return niveauDiplomeVise;
    }

    public void setNiveauDiplomeVise(String diplomaLevel) {
        this.niveauDiplomeVise = diplomaLevel;
    }
}
