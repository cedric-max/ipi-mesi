CREATE SCHEMA IF NOT EXISTS `mesi`;

DROP TABLE IF EXISTS `mesi`.`postuler`;
DROP TABLE IF EXISTS `mesi`.`etreEnContact`;
DROP TABLE IF EXISTS `mesi`.`detenir`;
DROP TABLE IF EXISTS `mesi`.`avoir`;
DROP TABLE IF EXISTS `mesi`.`offre`;
DROP TABLE IF EXISTS `mesi`.`recruteur`;
DROP TABLE IF EXISTS `mesi`.`candidat`;
DROP TABLE IF EXISTS `mesi`.`formation`;
DROP TABLE IF EXISTS `mesi`.`experiencePro`;


CREATE TABLE `mesi`.`recruteur` (
  `id_recruteur` INT NOT NULL AUTO_INCREMENT,
  `prenom` VARCHAR(45) NOT NULL,
  `nom` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `photo` VARCHAR(100) NULL,
  `libelle_entreprise` VARCHAR(45) NOT NULL,
  `mot_de_passe` VARCHAR(45) NULL,
   PRIMARY KEY (`id_recruteur`));
  
  CREATE TABLE `mesi`.`offre` (
  `id_offre` INT NOT NULL AUTO_INCREMENT,
  `titre` VARCHAR(255) NOT NULL,
  `reference` VARCHAR(45) NOT NULL,
  `nom_entreprise` VARCHAR(80) NOT NULL,
  `date_creation` DATETIME NOT NULL,
  `date_fin_validite` DATE NULL,
  `description` VARCHAR(1000) NOT NULL,
  `ville` VARCHAR(45) NOT NULL,
  `niveau_diplome_vise` VARCHAR(45) NULL,
  `id_recruteur` INT NOT NULL,
  `logo` VARCHAR(45) NULL,
  `profil_souhaite` VARCHAR(2000) NULL,
  `profil_minimum` VARCHAR(2000) NULL,
  `connaissance_necessaire` VARCHAR(1000) NULL,
  `outil_necessaire` VARCHAR(500) NULL,
  `salaire_indicatif` INT NOT NULL,
  PRIMARY KEY (`id_offre`),
  INDEX `id_recruteurIdx` (`id_recruteur` ASC) VISIBLE,
  CONSTRAINT `id_recruteur`
    FOREIGN KEY (`id_recruteur`)
    REFERENCES `mesi`.`recruteur` (`id_recruteur`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
    CREATE TABLE `mesi`.`candidat` (
  `id_candidat` INT NOT NULL AUTO_INCREMENT,
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
  `lien_github` VARCHAR(75) NULL,
  `mot_de_passe` VARCHAR(45) NULL,
  PRIMARY KEY (`id_candidat`));
  
  CREATE TABLE `mesi`.`technologie`(
    `id_technologie` INT NOT NULL AUTO_INCREMENT,
	`libelle_technologie` VARCHAR(100) NOT NULL,
     PRIMARY KEY (`id_technologie`));
     
  CREATE TABLE `mesi`.`offreTechnologie`(
  `id_offre_technologie` INT NOT NULL AUTO_INCREMENT,
  `id_offre` INT NOT NULL,
  `id_technologie` INT NOT NULL,
  PRIMARY KEY (`id_offre_technologie`),
   INDEX `id_offreIdx` (`id_offre` ASC) VISIBLE,
   INDEX `id_technologieIdx` (`id_technologie` ASC) VISIBLE,
  CONSTRAINT `id_offre`
    FOREIGN KEY (`id_offre`)
    REFERENCES `mesi`.`offre` (`id_offre`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_technologie`
    FOREIGN KEY (`id_technologie`)
    REFERENCES `mesi`.`technologie` (`id_technologie`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
  

  
  CREATE TABLE `mesi`.`formation` (
  `id_formation` INT NOT NULL AUTO_INCREMENT,
  `date_debut` DATE NOT NULL,
  `date_fin` DATE NOT NULL,
  `libelle_formation` VARCHAR(100) NOT NULL,
  `description_formation` VARCHAR(100) NULL,
  `ecole` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_formation`));
  
  CREATE TABLE `mesi`.`experiencePro` (
  `id_experience_pro` INT NOT NULL AUTO_INCREMENT,
  `date_debut` VARCHAR(45) NOT NULL,
  `date_fin` VARCHAR(45) NOT NULL,
  `entreprise` VARCHAR(45) NOT NULL,
  `libelle_experience` VARCHAR(45) NOT NULL,
  `description_experience` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id_experience_pro`));

CREATE TABLE `mesi`.`postuler` (
  `id_offre` INT NOT NULL,
  `id_candidat` INT NOT NULL,
  INDEX `id_offreIdx` (`id_offre` ASC) VISIBLE,
  INDEX `id_candidatIdx` (`id_candidat` ASC) VISIBLE,
  CONSTRAINT `postulerid_offre`
    FOREIGN KEY (`id_offre`)
    REFERENCES `mesi`.`offre` (`id_offre`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `postulerid_candidat`
    FOREIGN KEY (`id_candidat`)
    REFERENCES `mesi`.`candidat` (`id_candidat`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `mesi`.`etreEnContact` (
  `id_recruteur` INT NOT NULL,
  `id_candidat` INT NOT NULL,
  INDEX `id_recruteurIdx` (`id_recruteur` ASC) VISIBLE,
  INDEX `id_candidatIdx` (`id_candidat` ASC) VISIBLE,
  CONSTRAINT `contactid_recruteur`
    FOREIGN KEY (`id_recruteur`)
    REFERENCES `mesi`.`recruteur` (`id_recruteur`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `contactid_candidat`
    FOREIGN KEY (`id_candidat`)
    REFERENCES `mesi`.`candidat` (`id_candidat`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
CREATE TABLE `mesi`.`detenir` (
  `id_candidat` INT NOT NULL,
  `id_formation` INT NOT NULL,
  INDEX `id_candidatIdx` (`id_candidat` ASC) VISIBLE,
  INDEX `id_formationIdx` (`id_formation` ASC) VISIBLE,
  CONSTRAINT `detenirid_candidat`
    FOREIGN KEY (`id_candidat`)
    REFERENCES `mesi`.`candidat` (`id_candidat`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `detenir_id_formation`
    FOREIGN KEY (`id_formation`)
    REFERENCES `mesi`.`formation` (`id_formation`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `mesi`.`avoir` (
  `avoirid_candidat` INT NOT NULL,
  `avoirid_experience` INT NOT NULL,
  INDEX `avoirid_candidatIdx` (`avoirid_candidat` ASC) VISIBLE,
  INDEX `avoirid_experienceIdx` (`avoirid_experience` ASC) VISIBLE,
  CONSTRAINT `avoirid_candidat`
    FOREIGN KEY (`avoirid_candidat`)
    REFERENCES `mesi`.`candidat` (`id_candidat`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `avoirid_experience`
    FOREIGN KEY (`avoirid_experience`)
    REFERENCES `mesi`.`experiencePro` (`id_experience_pro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);