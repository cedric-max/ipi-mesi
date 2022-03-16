package com.numeralt.NumerAlt.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Formation {
    /*
    * `id_formation` INT NOT NULL AUTO_INCREMENT,
  `date_debut` DATE NOT NULL,
  `date_fin` DATE NOT NULL,
  `libelle_formation` VARCHAR(100) NOT NULL,
  `description_formation` VARCHAR(100) NULL,
  `ecole` VARCHAR(45) NOT NULL,*/
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private Long id_formation;

    private Date date_debut;

    private Date date_fin;

    private String libelle_formation;

    private String description_formation;

    private String ecole;

    //GETTER AND SETTER


    public Long getId_formation() {
        return id_formation;
    }

    public void setId_formation(Long id_formation) {
        this.id_formation = id_formation;
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

    public String getLibelle_formation() {
        return libelle_formation;
    }

    public void setLibelle_formation(String libelle_formation) {
        this.libelle_formation = libelle_formation;
    }

    public String getDescription_formation() {
        return description_formation;
    }

    public void setDescription_formation(String description_formation) {
        this.description_formation = description_formation;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }
}
