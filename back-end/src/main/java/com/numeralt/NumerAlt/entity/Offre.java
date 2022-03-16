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
    private Long id_offre;

    private String reference;

    private String titre;

    private String nom_entreprise;

    private Date date_creation;

    private Date date_fin_validite;

    private String description;

    private String ville;

    private String niveau_diplome_vise;

   // GETTER AND SETTER

    public Long getId_offre() {
        return id_offre;
    }

    public void setId_offre(Long offerId) {
        this.id_offre = offerId;
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

    public String getNom_entreprise() {
        return nom_entreprise;
    }

    public void setNom_entreprise(String companyName) {
        this.nom_entreprise = companyName;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date createdOn) {
        this.date_creation = createdOn;
    }

    public Date getDate_fin_validite() {
        return date_fin_validite;
    }

    public void setDate_fin_validite(Date endsOn) {
        this.date_fin_validite = endsOn;
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

    public String getNiveau_diplome_vise() {
        return niveau_diplome_vise;
    }

    public void setNiveau_diplome_vise(String diplomaLevel) {
        this.niveau_diplome_vise = diplomaLevel;
    }
}
