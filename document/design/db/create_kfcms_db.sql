-- MySQL Script generated by MySQL Workbench
-- 08/02/14 10:58:31
-- Model: New Model    Version: 1.0
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema kfcms_db
-- -----------------------------------------------------
-- kan kai fu database
DROP SCHEMA IF EXISTS `kfcms_db` ;
CREATE SCHEMA IF NOT EXISTS `kfcms_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `kfcms_db` ;

-- -----------------------------------------------------
-- Table `kfcms_db`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kfcms_db`.`user` ;

CREATE TABLE IF NOT EXISTS `kfcms_db`.`user` (
  `id` INT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(16) NULL,
  `password` VARCHAR(32) NULL,
  `status` TINYINT(1) NULL,
  `email` VARCHAR(100) NULL,
  `tel` VARCHAR(100) NULL,
  `qqmsn` VARCHAR(100) NULL,
  `gmt_created` DATETIME NULL,
  `gmt_modified` DATETIME NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `kfcms_db`.`company`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kfcms_db`.`company` ;

CREATE TABLE IF NOT EXISTS `kfcms_db`.`company` (
  `id` INT(20) NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(45) NULL,
  `name` VARCHAR(200) NULL,
  `platform` VARCHAR(100) NULL,
  `website` VARCHAR(100) NULL,
  `contact_name` VARCHAR(45) NULL,
  `contact_position` VARCHAR(45) NULL,
  `contact_tel` VARCHAR(100) NULL,
  `gmt_created` DATETIME NULL,
  `gmt_modified` DATETIME NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = 'Member Table';


-- -----------------------------------------------------
-- Table `kfcms_db`.`game`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `kfcms_db`.`game` ;

CREATE TABLE IF NOT EXISTS `kfcms_db`.`game` (
  `id` INT(20) NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(45) NULL,
  `name` VARCHAR(45) NULL,
  `start_time` DATETIME NULL,
  `server_name` VARCHAR(100) NULL,
  `url` VARCHAR(200) NULL,
  `category` VARCHAR(100) NULL,
  `gift_name` VARCHAR(100) NULL,
  `platform` VARCHAR(100) NULL,
  `gmt_created` DATETIME NULL,
  `gmt_modified` DATETIME NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
