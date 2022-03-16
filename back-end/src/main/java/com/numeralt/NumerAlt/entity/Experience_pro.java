package com.numeralt.NumerAlt.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Experience_pro {

    /*
    * `id_experience_pro` INT NOT NULL AUTO_INCREMENT,
  `date_debut` VARCHAR(45) NOT NULL,
  `date_fin` VARCHAR(45) NOT NULL,
  `entreprise` VARCHAR(45) NOT NULL,
  `libelle_experience` VARCHAR(45) NOT NULL,
  `description_experience` VARCHAR(200) NOT NULL,*/

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private Long id_experience_pro;

    private Date date_debut;

    private Date date_fin;

    private String libelle_experience;

    private String description_experience;

    private String entreprise;

    //GETTER AND SETTER


    public Long getId_experience_pro() {
        return id_experience_pro;
    }

    public void setId_experience_pro(Long id_experience_pro) {
        this.id_experience_pro = id_experience_pro;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public String getLibelle_experience() {
        return libelle_experience;
    }

    public void setLibelle_experience(String libelle_experience) {
        this.libelle_experience = libelle_experience;
    }

    public String getDescription_experience() {
        return description_experience;
    }

    public void setDescription_experience(String description_experience) {
        this.description_experience = description_experience;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }
}
