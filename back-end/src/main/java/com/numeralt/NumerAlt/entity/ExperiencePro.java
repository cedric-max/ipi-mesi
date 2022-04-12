package com.numeralt.NumerAlt.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="experiencePro")
public class ExperiencePro {

    /*
    * `id_experience_pro` INT NOT NULL AUTO_INCREMENT,
  `date_debut` VARCHAR(45) NOT NULL,
  `date_fin` VARCHAR(45) NOT NULL,
  `entreprise` VARCHAR(45) NOT NULL,
  `libelle_experience` VARCHAR(45) NOT NULL,
  `description_experience` VARCHAR(200) NOT NULL,*/

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private Long idExperiencePro;

    private Date dateDebut;

    private Date dateFin;

    private String libelleExperience;

    private String descriptionExperience;

    private String entreprise;

    //GETTER AND SETTER


    public Long getIdExperiencePro() {
        return idExperiencePro;
    }

    public void setIdExperiencePro(Long idExperiencePro) {
        this.idExperiencePro = idExperiencePro;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getLibelleExperience() {
        return libelleExperience;
    }

    public void setLibelleExperience(String libelleExperience) {
        this.libelleExperience = libelleExperience;
    }

    public String getDescriptionExperience() {
        return descriptionExperience;
    }

    public void setDescriptionExperience(String descriptionExperience) {
        this.descriptionExperience = descriptionExperience;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }
}
