CREATE SCHEMA IF NOT EXISTS `mesi`;

DROP TABLE IF EXISTS `mesi`.`postuler`;
DROP TABLE IF EXISTS `mesi`.`etre_en_contact`;
DROP TABLE IF EXISTS `mesi`.`detenir`;
DROP TABLE IF EXISTS `mesi`.`avoir`;
DROP TABLE IF EXISTS `mesi`.`offre`;
DROP TABLE IF EXISTS `mesi`.`recruteur`;
DROP TABLE IF EXISTS `mesi`.`candidat`;
DROP TABLE IF EXISTS `mesi`.`formation`;
DROP TABLE IF EXISTS `mesi`.`experience_pro`;

CREATE TABLE `mesi`.`recruteur` (
  `id_recruteur` INT NOT NULL AUTO_INCREMENT,
  `prenom` VARCHAR(45) NOT NULL,
  `nom` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `photo` VARCHAR(100) NULL,
  `libelle_entreprise` VARCHAR(45) NOT NULL,
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
  PRIMARY KEY (`id_offre`),
  INDEX `id_recruteur_idx` (`id_recruteur` ASC) VISIBLE,
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
  `permis de conduire` TINYINT NOT NULL,
  `soft_skills` VARCHAR(200) NULL,
  `centres_interet` VARCHAR(200) NULL,
  `site_internet` VARCHAR(75) NULL,
  `lien_github` VARCHAR(75) NULL,
  PRIMARY KEY (`id_candidat`));
  
  CREATE TABLE `mesi`.`formation` (
  `id_formation` INT NOT NULL AUTO_INCREMENT,
  `date_debut` DATE NOT NULL,
  `date_fin` DATE NOT NULL,
  `libelle_formation` VARCHAR(100) NOT NULL,
  `description_formation` VARCHAR(100) NULL,
  `ecole` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_formation`));
  
  CREATE TABLE `mesi`.`experience_pro` (
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
  INDEX `id_offre_idx` (`id_offre` ASC) VISIBLE,
  INDEX `id_candidat_idx` (`id_candidat` ASC) VISIBLE,
  CONSTRAINT `postuler_id_offre`
    FOREIGN KEY (`id_offre`)
    REFERENCES `mesi`.`offre` (`id_offre`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `postuler_id_candidat`
    FOREIGN KEY (`id_candidat`)
    REFERENCES `mesi`.`candidat` (`id_candidat`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `mesi`.`etre_en_contact` (
  `id_recruteur` INT NOT NULL,
  `id_candidat` INT NOT NULL,
  INDEX `id_recruteur_idx` (`id_recruteur` ASC) VISIBLE,
  INDEX `id_candidat_idx` (`id_candidat` ASC) VISIBLE,
  CONSTRAINT `contact_id_recruteur`
    FOREIGN KEY (`id_recruteur`)
    REFERENCES `mesi`.`recruteur` (`id_recruteur`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `contact_id_candidat`
    FOREIGN KEY (`id_candidat`)
    REFERENCES `mesi`.`candidat` (`id_candidat`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
CREATE TABLE `mesi`.`detenir` (
  `id_candidat` INT NOT NULL,
  `id_formation` INT NOT NULL,
  INDEX `id_candidat_idx` (`id_candidat` ASC) VISIBLE,
  INDEX `id_formation_idx` (`id_formation` ASC) VISIBLE,
  CONSTRAINT `detenir_id_candidat`
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
  `avoir_id_candidat` INT NOT NULL,
  `avoir_id_experience` INT NOT NULL,
  INDEX `avoir_id_candidat_idx` (`avoir_id_candidat` ASC) VISIBLE,
  INDEX `avoir_id_experience_idx` (`avoir_id_experience` ASC) VISIBLE,
  CONSTRAINT `avoir_id_candidat`
    FOREIGN KEY (`avoir_id_candidat`)
    REFERENCES `mesi`.`candidat` (`id_candidat`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `avoir_id_experience`
    FOREIGN KEY (`avoir_id_experience`)
    REFERENCES `mesi`.`experience_pro` (`id_experience_pro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);



