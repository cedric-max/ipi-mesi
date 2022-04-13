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
<<<<<<< HEAD:back-end/src/main/resources/NewScriptCreationBDD_2.sql
=======

>>>>>>> develop:back-end/src/main/resources/Script_BDD_11_04.sql

CREATE TABLE `mesi`.`recruteur` (
  `idRecruteur` INT NOT NULL AUTO_INCREMENT,
  `prenom` VARCHAR(45) NOT NULL,
  `nom` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `photo` VARCHAR(100) NULL,
<<<<<<< HEAD:back-end/src/main/resources/NewScriptCreationBDD_2.sql
  `libelleEntreprise` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idRecruteur`));
=======
  `libelle_entreprise` VARCHAR(45) NOT NULL,
  `mot_de_passe` VARCHAR(45) NULL,
   PRIMARY KEY (`id_recruteur`));
>>>>>>> develop:back-end/src/main/resources/Script_BDD_11_04.sql
  
  CREATE TABLE `mesi`.`offre` (
  `idOffre` INT NOT NULL AUTO_INCREMENT,
  `titre` VARCHAR(255) NOT NULL,
  `reference` VARCHAR(45) NOT NULL,
  `nomEntreprise` VARCHAR(80) NOT NULL,
  `dateCreation` DATETIME NOT NULL,
  `dateFinValidite` DATE NULL,
  `description` VARCHAR(1000) NOT NULL,
  `ville` VARCHAR(45) NOT NULL,
<<<<<<< HEAD:back-end/src/main/resources/NewScriptCreationBDD_2.sql
  `niveauDiplomeVise` VARCHAR(45) NULL,
  `idRecruteur` INT NOT NULL,
  PRIMARY KEY (`id_offre`),
  INDEX `idRecruteur_idx` (`idRecruteur` ASC) VISIBLE,
  CONSTRAINT `idRecruteur`
    FOREIGN KEY (`idRecruteur`)
    REFERENCES `mesi`.`recruteur` (`idRecruteur`)
=======
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
>>>>>>> develop:back-end/src/main/resources/Script_BDD_11_04.sql
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
    CREATE TABLE `mesi`.`candidat` (
  `idCandidat` INT NOT NULL AUTO_INCREMENT,
  `prenom` VARCHAR(45) NOT NULL,
  `nom` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `photo` VARCHAR(100) NULL,
  `dateNaissance` DATE NOT NULL,
  `adresse` VARCHAR(100) NOT NULL,
<<<<<<< HEAD:back-end/src/main/resources/NewScriptCreationBDD_2.sql
  `permisConduire` TINYINT NOT NULL,
  `softSkills` VARCHAR(200) NULL,
  `centresInteret` VARCHAR(200) NULL,
  `siteInternet` VARCHAR(75) NULL,
  `lienGithub` VARCHAR(75) NULL,
  PRIMARY KEY (`idCandidat`));
=======
  `permis_conduire` TINYINT NOT NULL,
  `soft_skills` VARCHAR(200) NULL,
  `centres_interet` VARCHAR(200) NULL,
  `site_internet` VARCHAR(75) NULL,
  `lien_github` VARCHAR(75) NULL,
  `mot_de_passe` VARCHAR(45) NULL,
  PRIMARY KEY (`id_candidat`));
>>>>>>> develop:back-end/src/main/resources/Script_BDD_11_04.sql
  
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
  `idFormation` INT NOT NULL AUTO_INCREMENT,
  `dateDebut` DATE NOT NULL,
  `dateFin` DATE NOT NULL,
  `libelleFormation` VARCHAR(100) NOT NULL,
  `descriptionFormation` VARCHAR(100) NULL,
  `ecole` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idFormation`));
  
  CREATE TABLE `mesi`.`experiencePro` (
<<<<<<< HEAD:back-end/src/main/resources/NewScriptCreationBDD_2.sql
  `idExperiencePro` INT NOT NULL AUTO_INCREMENT,
  `dateDebut` VARCHAR(45) NOT NULL,
  `dateFin` VARCHAR(45) NOT NULL,
=======
  `id_experience_pro` INT NOT NULL AUTO_INCREMENT,
  `date_debut` VARCHAR(45) NOT NULL,
  `date_fin` VARCHAR(45) NOT NULL,
>>>>>>> develop:back-end/src/main/resources/Script_BDD_11_04.sql
  `entreprise` VARCHAR(45) NOT NULL,
  `libelleExperience` VARCHAR(45) NOT NULL,
  `descriptionExperience` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`idExperiencePro`));

CREATE TABLE `mesi`.`postuler` (
<<<<<<< HEAD:back-end/src/main/resources/NewScriptCreationBDD_2.sql
  `idOffre` INT NOT NULL,
  `idCandidat` INT NOT NULL,
  INDEX `idOffre_idx` (`idOffre` ASC) VISIBLE,
  INDEX `idCandidat_idx` (`idCandidat` ASC) VISIBLE,
  CONSTRAINT `postuler_idOffre`
    FOREIGN KEY (`idOffre`)
    REFERENCES `mesi`.`offre` (`idOffre`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `postuler_idCandidat`
    FOREIGN KEY (`idCandidat`)
    REFERENCES `mesi`.`candidat` (`idCandidat`)
=======
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
>>>>>>> develop:back-end/src/main/resources/Script_BDD_11_04.sql
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `mesi`.`etreEnContact` (
<<<<<<< HEAD:back-end/src/main/resources/NewScriptCreationBDD_2.sql
  `idRecruteur` INT NOT NULL,
  `idCandidat` INT NOT NULL,
  INDEX `idRecruteur_idx` (`idRecruteur` ASC) VISIBLE,
  INDEX `idCandidat_idx` (`idCandidat` ASC) VISIBLE,
  CONSTRAINT `contact_idRecruteur`
    FOREIGN KEY (`idRecruteur`)
    REFERENCES `mesi`.`recruteur` (`idRecruteur`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `contact_idCandidat`
    FOREIGN KEY (`idCandidat`)
    REFERENCES `mesi`.`candidat` (`idCandidat`)
=======
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
>>>>>>> develop:back-end/src/main/resources/Script_BDD_11_04.sql
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
CREATE TABLE `mesi`.`detenir` (
<<<<<<< HEAD:back-end/src/main/resources/NewScriptCreationBDD_2.sql
  `idCandidat` INT NOT NULL,
  `idFormation` INT NOT NULL,
  INDEX `idCandidat_idx` (`idCandidat` ASC) VISIBLE,
  INDEX `idFormation_idx` (`idFormation` ASC) VISIBLE,
  CONSTRAINT `detenir_idCandidat`
    FOREIGN KEY (`idCandidat`)
    REFERENCES `mesi`.`candidat` (`idCandidat`)
=======
  `id_candidat` INT NOT NULL,
  `id_formation` INT NOT NULL,
  INDEX `id_candidatIdx` (`id_candidat` ASC) VISIBLE,
  INDEX `id_formationIdx` (`id_formation` ASC) VISIBLE,
  CONSTRAINT `detenirid_candidat`
    FOREIGN KEY (`id_candidat`)
    REFERENCES `mesi`.`candidat` (`id_candidat`)
>>>>>>> develop:back-end/src/main/resources/Script_BDD_11_04.sql
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `detenir_idFormation`
    FOREIGN KEY (`idFormation`)
    REFERENCES `mesi`.`formation` (`idFormation`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `mesi`.`avoir` (
<<<<<<< HEAD:back-end/src/main/resources/NewScriptCreationBDD_2.sql
  `avoir_idCandidat` INT NOT NULL,
  `avoir_idExperience` INT NOT NULL,
  INDEX `avoir_idCandidat_idx` (`avoir_idCandidat` ASC) VISIBLE,
  INDEX `avoir_idExperience_idx` (`avoir_idExperience` ASC) VISIBLE,
  CONSTRAINT `avoir_idCandidat`
    FOREIGN KEY (`avoir_idCandidat`)
    REFERENCES `mesi`.`candidat` (`idCandidat`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `avoir_idExperience`
    FOREIGN KEY (`avoir_idExperience`)
    REFERENCES `mesi`.`experiencePro` (`idExperiencePro`)
=======
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
>>>>>>> develop:back-end/src/main/resources/Script_BDD_11_04.sql
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);