package com.numeralt.NumerAlt.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="formation")
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
    private Long idFormation;

    private Date dateDebut;

    private Date dateFin;

    private String libelleFormation;

    private String descriptionFormation;

    private String ecole;

    public Long getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(Long idFormation) {
        this.idFormation = idFormation;
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

    public String getLibelleFormation() {
        return libelleFormation;
    }

    public void setLibelleFormation(String libelleFormation) {
        this.libelleFormation = libelleFormation;
    }

    public String getDescriptionFormation() {
        return descriptionFormation;
    }

    public void setDescriptionFormation(String descriptionFormation) {
        this.descriptionFormation = descriptionFormation;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }
}
