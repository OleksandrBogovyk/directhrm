CREATE DATABASE  IF NOT EXISTS `hrms` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `hrms`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: hrms
-- ------------------------------------------------------
-- Server version	5.6.15-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `about`
--

DROP TABLE IF EXISTS `about`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `about` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `about_text` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `about`
--

LOCK TABLES `about` WRITE;
/*!40000 ALTER TABLE `about` DISABLE KEYS */;
INSERT INTO `about` VALUES (1,'Кузьменко Александр Викторович, 1988 года рождения является сотрудником  ООО «Моя компания» с 2013 года по настоящее время. Трудолюбие и высокая работоспособность так же являются отличительными чертами Александра Викторовича. ');
/*!40000 ALTER TABLE `about` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin_tb`
--

DROP TABLE IF EXISTS `admin_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin_tb` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(45) NOT NULL,
  `admin_fullname` varchar(45) NOT NULL,
  `admin_password` char(40) NOT NULL,
  `admin_register` datetime DEFAULT CURRENT_TIMESTAMP,
  `admin_last` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_tb`
--

LOCK TABLES `admin_tb` WRITE;
/*!40000 ALTER TABLE `admin_tb` DISABLE KEYS */;
INSERT INTO `admin_tb` VALUES (1,'Admin','Администратор','319203f211d7e4e5b2d3d2e0cae0644145cfcb6f','2014-10-24 11:24:49','2014-10-27 11:45:24'),(2,'obogovyk','Боговик Александр','e558ba89c53a1a6b5c327d1b0fc8313a45a7e3f8','2014-10-27 11:45:24',NULL),(3,'yakandre','Якивчук Андрей','34b92ed65511a0f620b3fabb1ee3198a37309829','2014-10-27 16:01:09',NULL);
/*!40000 ALTER TABLE `admin_tb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bonus`
--

DROP TABLE IF EXISTS `bonus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bonus` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `bonus_sum` float unsigned NOT NULL,
  `bonus_category` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bonus`
--

LOCK TABLES `bonus` WRITE;
/*!40000 ALTER TABLE `bonus` DISABLE KEYS */;
INSERT INTO `bonus` VALUES (1,266.37,''),(2,325.74,''),(3,384.76,''),(4,425.17,''),(5,498.36,'');
/*!40000 ALTER TABLE `bonus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contact` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `contact_city` varchar(25) NOT NULL,
  `contact_address` varchar(45) NOT NULL,
  `zipcode` varchar(5) NOT NULL,
  `contact_phone` varchar(17) NOT NULL,
  `contact_phone2` varchar(17) DEFAULT NULL,
  `contact_email` varchar(25) NOT NULL,
  `contact_email2` varchar(25) DEFAULT NULL,
  `contact_intnum` varchar(17) DEFAULT NULL,
  `skype` varchar(25) DEFAULT NULL,
  `notes` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact`
--

LOCK TABLES `contact` WRITE;
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` VALUES (1,'Днепропетровск','ул. Олеся Гончара 19','49000','(0562) 39-57-00','(067) 399-14-21','',NULL,'4024',NULL,'ООО \"Софт-Медиа\"'),(2,'Днепропетровск','пр. Карла Маркса 49','49001','(095) 372-16-57',NULL,'',NULL,'4025',NULL,'ООО \"Символ-Плюс\"'),(3,'Днепропетровск','ул. Комсомольская 16','49008','(095) 372-10-11','(093) 472-21-10','',NULL,'4026',NULL,NULL),(4,'Днепропетровск','ул. Ленина 24','49000','(095) 372-10-12','(093) 472-21-11','',NULL,'4027',NULL,NULL),(5,'Днепропетровск','ул. Артема 121/2','49000','(095) 372-10-13','(093) 472-21-12','',NULL,'4028',NULL,NULL),(6,'Днепропетровск','ул. Строителей 19/27','49000','(095) 372-10-14',NULL,'',NULL,'4024',NULL,NULL),(7,'Днепропетровск','ул. Карла Либкнехта 178/39','49000','(095) 372-10-15','(093) 472-21-14','',NULL,'4029',NULL,NULL),(8,'Днепропетровск','пр. Карла Маркса 124/77','49000','(095) 372-10-16','(093) 472-21-15','',NULL,'4030',NULL,NULL),(9,'Днепропетровск','ул. Юрия Савченко 76/23','49000','(095) 372-10-17',NULL,'',NULL,'4031',NULL,NULL),(10,'Днепропетровск','пр. Пушкина 56/12','49000','(095) 372-10-18','(093) 472-21-17','',NULL,'4032',NULL,NULL),(11,'Днепропетровск','ул. Рабочая 17/260','49000','(095) 372-10-19','(093) 472-21-18','',NULL,'4033',NULL,NULL),(12,'Днепропетровск','пр. Мира 230/179','49000','(095) 372-10-20','(093) 472-21-19','',NULL,'4034',NULL,NULL);
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contract`
--

DROP TABLE IF EXISTS `contract`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contract` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `contract_number` varchar(10) NOT NULL,
  `contract_date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contract`
--

LOCK TABLES `contract` WRITE;
/*!40000 ALTER TABLE `contract` DISABLE KEYS */;
INSERT INTO `contract` VALUES (1,'12078991','2013-08-01'),(2,'12078992','2013-08-02'),(3,'12078993','2013-08-10');
/*!40000 ALTER TABLE `contract` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `department` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `department_name` varchar(45) NOT NULL,
  `department_place` varchar(12) NOT NULL,
  `department_place2` varchar(12) DEFAULT NULL,
  `organization_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_department_organization1_idx` (`organization_id`),
  CONSTRAINT `fk_department_organization1` FOREIGN KEY (`organization_id`) REFERENCES `organization` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1,'','2/28',NULL,NULL),(2,'','2/21',NULL,NULL),(3,'','1/14',NULL,NULL),(4,'','3/24',NULL,NULL),(5,'','1/12',NULL,NULL),(6,'','1/10',NULL,NULL),(7,'','1/19',NULL,NULL);
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diploma`
--

DROP TABLE IF EXISTS `diploma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `diploma` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `diploma_value` varchar(60) NOT NULL,
  `diploma_year` year(4) NOT NULL,
  `diploma_fstudy` enum('дневная','заочная') NOT NULL,
  `person_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_diploma_person1_idx` (`person_id`),
  CONSTRAINT `fk_diploma_person1` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diploma`
--

LOCK TABLES `diploma` WRITE;
/*!40000 ALTER TABLE `diploma` DISABLE KEYS */;
/*!40000 ALTER TABLE `diploma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `errand`
--

DROP TABLE IF EXISTS `errand`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `errand` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `errand_from` date NOT NULL,
  `errand_till` date NOT NULL,
  `errand_aim` varchar(60) NOT NULL,
  `person_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_errand_person1_idx` (`person_id`),
  CONSTRAINT `fk_errand_person1` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `errand`
--

LOCK TABLES `errand` WRITE;
/*!40000 ALTER TABLE `errand` DISABLE KEYS */;
INSERT INTO `errand` VALUES (0,'2013-03-01','2013-03-14','',NULL);
/*!40000 ALTER TABLE `errand` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `experience`
--

DROP TABLE IF EXISTS `experience`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `experience` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `experience_company` varchar(45) NOT NULL,
  `experience_dbegin` date NOT NULL,
  `experience_dend` date NOT NULL,
  `experience_position` varchar(45) NOT NULL,
  `experience_freason` varchar(45) NOT NULL,
  `person_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_experience_person1_idx` (`person_id`),
  CONSTRAINT `fk_experience_person1` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experience`
--

LOCK TABLES `experience` WRITE;
/*!40000 ALTER TABLE `experience` DISABLE KEYS */;
/*!40000 ALTER TABLE `experience` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `organization`
--

DROP TABLE IF EXISTS `organization`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `organization` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `organization_name` varchar(60) NOT NULL,
  `contact_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_organization_contact1_idx` (`contact_id`),
  CONSTRAINT `fk_organization_contact1` FOREIGN KEY (`contact_id`) REFERENCES `contact` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organization`
--

LOCK TABLES `organization` WRITE;
/*!40000 ALTER TABLE `organization` DISABLE KEYS */;
INSERT INTO `organization` VALUES (1,'ООО \"Символ-Плюс\"',2),(2,'ООО \"Софт-Медиа\"',1);
/*!40000 ALTER TABLE `organization` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parents`
--

DROP TABLE IF EXISTS `parents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `parents` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `parent_name` varchar(45) NOT NULL,
  `parent_lastname` varchar(45) NOT NULL,
  `parent_middlename` varchar(45) NOT NULL,
  `parent_gender` enum('M','F') NOT NULL,
  `parent_age` tinyint(4) NOT NULL,
  `parent_position` varchar(45) NOT NULL,
  `person_id` int(10) unsigned DEFAULT NULL,
  `contact_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_parents_contact1_idx` (`contact_id`),
  KEY `fk_parents_person1_idx` (`person_id`),
  CONSTRAINT `fk_parents_contact1` FOREIGN KEY (`contact_id`) REFERENCES `contact` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_parents_person1` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parents`
--

LOCK TABLES `parents` WRITE;
/*!40000 ALTER TABLE `parents` DISABLE KEYS */;
/*!40000 ALTER TABLE `parents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passport`
--

DROP TABLE IF EXISTS `passport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `passport` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `passport_snum` varchar(12) NOT NULL,
  `passport_date` date NOT NULL,
  `passport_issue` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passport`
--

LOCK TABLES `passport` WRITE;
/*!40000 ALTER TABLE `passport` DISABLE KEYS */;
INSERT INTO `passport` VALUES (1,'АН061552','1981-01-10','Ленинским РО УМВС в Днепропетровской обл.'),(2,'АН061553','1981-01-11','Бабушкинским РО УМВС в Днепропетровской обл.'),(3,'АН061554','1981-01-12','Красногвардейским РО УМВС в Днепропетровской обл.'),(4,'АН061555','1981-01-13','Кировским РО УМВС в Днепропетровской обл.'),(5,'АН061556','1981-01-14','Днепровским РО УМВС в Днепропетровской обл.'),(6,'АН061557','1981-01-15','Бабушкинским РО УМВС в Днепропетровской обл.'),(7,'АН061558','1981-01-16','Кировским РО УМВС в Днепропетровской обл.'),(8,'АН061559','1981-01-17','Ленинским РО УМВС в Днепропетровской обл.'),(9,'АН061560','1981-01-18','Красногвардейским РО УМВС в Днепропетровской обл.'),(10,'АН061561','1981-01-19','Ленинским РО УМВС в Днепропетровской обл.');
/*!40000 ALTER TABLE `passport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `person` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `person_lastname` varchar(45) NOT NULL,
  `person_name` varchar(45) NOT NULL,
  `person_middlename` varchar(45) NOT NULL,
  `person_dob` date NOT NULL,
  `person_gender` enum('M','F') NOT NULL,
  `person_citizenship` varchar(15) NOT NULL,
  `person_marital` enum('H','W','N') NOT NULL,
  `person_military` enum('Y','N') NOT NULL,
  `person_driver` enum('A','B','C','D','N') NOT NULL,
  `person_diploma` enum('Y','N') NOT NULL,
  `person_ident` varchar(12) NOT NULL,
  `person_jobber` enum('Y','N') NOT NULL,
  `person_tabno` varchar(10) NOT NULL,
  `passport_id` int(10) unsigned DEFAULT NULL,
  `organization_id` int(10) unsigned DEFAULT NULL,
  `about_id` int(10) unsigned DEFAULT NULL,
  `department_id` int(10) unsigned DEFAULT NULL,
  `worktime_id` int(11) unsigned DEFAULT NULL,
  `salary_id` int(10) unsigned DEFAULT NULL,
  `bonus_id` int(11) unsigned DEFAULT NULL,
  `contract_id` int(11) unsigned DEFAULT NULL,
  `contact_id` int(10) unsigned DEFAULT NULL,
  `photo_id` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_person_contact1_idx` (`contact_id`),
  KEY `fk_person_passport1_idx` (`passport_id`),
  KEY `fk_person_department1_idx` (`department_id`),
  KEY `fk_person_worktime1_idx` (`worktime_id`),
  KEY `fk_person_photo1_idx` (`photo_id`),
  KEY `fk_person_bonus1_idx` (`bonus_id`),
  KEY `fk_person_contract1_idx` (`contract_id`),
  KEY `fk_person_organization1_idx` (`organization_id`),
  KEY `fk_person_salary1_idx` (`salary_id`),
  KEY `fk_person_about1_idx` (`about_id`),
  CONSTRAINT `fk_person_about1` FOREIGN KEY (`about_id`) REFERENCES `about` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_person_bonus1` FOREIGN KEY (`bonus_id`) REFERENCES `bonus` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_person_contact1` FOREIGN KEY (`contact_id`) REFERENCES `contact` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_person_contract1` FOREIGN KEY (`contract_id`) REFERENCES `contract` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_person_department1` FOREIGN KEY (`department_id`) REFERENCES `department` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_person_organization1` FOREIGN KEY (`organization_id`) REFERENCES `organization` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_person_passport1` FOREIGN KEY (`passport_id`) REFERENCES `passport` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_person_photo1` FOREIGN KEY (`photo_id`) REFERENCES `photo` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_person_salary1` FOREIGN KEY (`salary_id`) REFERENCES `salary` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_person_worktime1` FOREIGN KEY (`worktime_id`) REFERENCES `worktime` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (1,'Дерябин','Александр','Сергеевич','1969-02-01','M','Украина','W','Y','D','Y','1234567891','N','41201',2,1,0,NULL,1,2,1,NULL,3,NULL),(2,'Калинина','Анна','Павловна','1978-12-10','F','Россия','H','N','B','Y','1234567892','Y','41202',5,1,0,NULL,2,2,3,2,5,NULL),(3,'Иноземцева','Евгения','Анатольевна','1981-10-15','F','Украина','N','N','B','Y','1234567893','N','41203',4,1,0,NULL,1,2,1,NULL,4,NULL),(4,'Казарновский','Максим','Семенович','1981-08-03','M','Молдова','W','Y','B','Y','1234567894','N','41204',3,2,0,NULL,1,1,2,NULL,6,NULL),(5,'Куличенко','Алена','Павловна','1982-11-12','F','Украина','H','N','N','Y','1234567895','N','41205',1,2,0,NULL,3,3,3,NULL,9,NULL),(6,'Кузьменко','Алексей','Викторович','1987-10-15','M','Россия','N','N','C','N','1234567896','Y','41206',6,2,0,NULL,3,4,4,1,8,NULL),(7,'Борисенко','Виктор','Петрович','1980-03-02','M','Украина','W','Y','C','Y','1234567897','N','41207',8,2,0,NULL,2,3,1,NULL,7,NULL),(8,'Гурская','Екатерина','Юрьевна','1983-11-09','F','Украина','H','N','N','Y','1234567898','N','41208',7,1,0,NULL,3,2,3,NULL,10,NULL),(9,'Боговик','Александр','Александрович','1986-07-06','M','Украина','W','N','B','Y','1234567899','N','41209',10,2,0,NULL,3,4,4,NULL,11,NULL),(10,'Шульга','Екатерина','Сергеевна','1985-03-04','F','Украина','H','N','B','Y','1234567810','N','41210',9,1,0,NULL,1,3,3,NULL,12,NULL);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `photo`
--

DROP TABLE IF EXISTS `photo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `photo` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `photo_value` blob,
  `photo_upload` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `photo`
--

LOCK TABLES `photo` WRITE;
/*!40000 ALTER TABLE `photo` DISABLE KEYS */;
/*!40000 ALTER TABLE `photo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `position`
--

DROP TABLE IF EXISTS `position`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `position` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `position_name` varchar(60) NOT NULL,
  `position_hiredate` date NOT NULL,
  `position_firedate` date DEFAULT NULL,
  `position_head` char(1) DEFAULT NULL,
  `person_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_position_person1_idx` (`person_id`),
  CONSTRAINT `fk_position_person1` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `position`
--

LOCK TABLES `position` WRITE;
/*!40000 ALTER TABLE `position` DISABLE KEYS */;
/*!40000 ALTER TABLE `position` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salary` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `salary_value` float NOT NULL,
  `salary_date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary`
--

LOCK TABLES `salary` WRITE;
/*!40000 ALTER TABLE `salary` DISABLE KEYS */;
INSERT INTO `salary` VALUES (1,2500,'2014-10-21'),(2,2750,'2014-06-09'),(3,3000,'2014-02-14'),(4,3250,'2014-12-08'),(5,3550,'2014-05-05');
/*!40000 ALTER TABLE `salary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sicklist`
--

DROP TABLE IF EXISTS `sicklist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sicklist` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `sicklist_number` varchar(12) NOT NULL,
  `sicklist_from` date NOT NULL,
  `sicklist_till` date NOT NULL,
  `person_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_sicklist_person1_idx` (`person_id`),
  CONSTRAINT `fk_sicklist_person1` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sicklist`
--

LOCK TABLES `sicklist` WRITE;
/*!40000 ALTER TABLE `sicklist` DISABLE KEYS */;
/*!40000 ALTER TABLE `sicklist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vacation`
--

DROP TABLE IF EXISTS `vacation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vacation` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `vacation_date` date NOT NULL,
  `person_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_vacation_person1_idx` (`person_id`),
  CONSTRAINT `fk_vacation_person1` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vacation`
--

LOCK TABLES `vacation` WRITE;
/*!40000 ALTER TABLE `vacation` DISABLE KEYS */;
/*!40000 ALTER TABLE `vacation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `worktime`
--

DROP TABLE IF EXISTS `worktime`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `worktime` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `worktime_from` char(5) NOT NULL,
  `worktime_till` char(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `worktime`
--

LOCK TABLES `worktime` WRITE;
/*!40000 ALTER TABLE `worktime` DISABLE KEYS */;
INSERT INTO `worktime` VALUES (1,'08:00','17:00'),(2,'08:30','17:30'),(3,'09:00','18:00'),(4,'10:00','20:00'),(5,'10:00','22:00');
/*!40000 ALTER TABLE `worktime` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-11-15 21:40:10
