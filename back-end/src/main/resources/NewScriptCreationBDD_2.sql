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
  `idRecruteur` INT NOT NULL AUTO_INCREMENT,
  `prenom` VARCHAR(45) NOT NULL,
  `nom` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `photo` VARCHAR(100) NULL,
  `libelleEntreprise` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idRecruteur`));
  
  CREATE TABLE `mesi`.`offre` (
  `idOffre` INT NOT NULL AUTO_INCREMENT,
  `titre` VARCHAR(255) NOT NULL,
  `reference` VARCHAR(45) NOT NULL,
  `nomEntreprise` VARCHAR(80) NOT NULL,
  `dateCreation` DATETIME NOT NULL,
  `dateFinValidite` DATE NULL,
  `description` VARCHAR(1000) NOT NULL,
  `ville` VARCHAR(45) NOT NULL,
  `niveauDiplomeVise` VARCHAR(45) NULL,
  `idRecruteur` INT NOT NULL,
  PRIMARY KEY (`id_offre`),
  INDEX `idRecruteur_idx` (`idRecruteur` ASC) VISIBLE,
  CONSTRAINT `idRecruteur`
    FOREIGN KEY (`idRecruteur`)
    REFERENCES `mesi`.`recruteur` (`idRecruteur`)
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
  `permisConduire` TINYINT NOT NULL,
  `softSkills` VARCHAR(200) NULL,
  `centresInteret` VARCHAR(200) NULL,
  `siteInternet` VARCHAR(75) NULL,
  `lienGithub` VARCHAR(75) NULL,
  PRIMARY KEY (`idCandidat`));
  
  CREATE TABLE `mesi`.`formation` (
  `idFormation` INT NOT NULL AUTO_INCREMENT,
  `dateDebut` DATE NOT NULL,
  `dateFin` DATE NOT NULL,
  `libelleFormation` VARCHAR(100) NOT NULL,
  `descriptionFormation` VARCHAR(100) NULL,
  `ecole` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idFormation`));
  
  CREATE TABLE `mesi`.`experiencePro` (
  `idExperiencePro` INT NOT NULL AUTO_INCREMENT,
  `dateDebut` VARCHAR(45) NOT NULL,
  `dateFin` VARCHAR(45) NOT NULL,
  `entreprise` VARCHAR(45) NOT NULL,
  `libelleExperience` VARCHAR(45) NOT NULL,
  `descriptionExperience` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`idExperiencePro`));

CREATE TABLE `mesi`.`postuler` (
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
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `mesi`.`etreEnContact` (
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
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
CREATE TABLE `mesi`.`detenir` (
  `idCandidat` INT NOT NULL,
  `idFormation` INT NOT NULL,
  INDEX `idCandidat_idx` (`idCandidat` ASC) VISIBLE,
  INDEX `idFormation_idx` (`idFormation` ASC) VISIBLE,
  CONSTRAINT `detenir_idCandidat`
    FOREIGN KEY (`idCandidat`)
    REFERENCES `mesi`.`candidat` (`idCandidat`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `detenir_idFormation`
    FOREIGN KEY (`idFormation`)
    REFERENCES `mesi`.`formation` (`idFormation`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `mesi`.`avoir` (
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
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);



