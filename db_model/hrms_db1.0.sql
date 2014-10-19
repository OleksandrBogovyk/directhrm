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
-- Table structure for table `admin_tb`
--

DROP TABLE IF EXISTS `admin_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin_tb` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(45) NOT NULL,
  `admin_password` char(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_tb`
--

LOCK TABLES `admin_tb` WRITE;
/*!40000 ALTER TABLE `admin_tb` DISABLE KEYS */;
INSERT INTO `admin_tb` VALUES (1,'Admin','319203f211d7e4e5b2d3d2e0cae0644145cfcb6f');
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
  `bonus_grade` char(1) NOT NULL,
  `bonus_sum` float unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bonus`
--

LOCK TABLES `bonus` WRITE;
/*!40000 ALTER TABLE `bonus` DISABLE KEYS */;
INSERT INTO `bonus` VALUES (1,'A',325.74),(2,'B',437.52),(3,'C',520),(4,'D',565.15),(5,'E',605.25),(6,'F',661.24),(7,'G',705.89);
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
  `contact_phone2` varchar(17) NOT NULL,
  `contact_email` varchar(25) NOT NULL,
  `contact_email2` varchar(25) DEFAULT NULL,
  `contact_internalnum` varchar(17) DEFAULT NULL,
  `skype` varchar(25) DEFAULT NULL,
  `notes` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact`
--

LOCK TABLES `contact` WRITE;
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` VALUES (1,'Днепропетровск','ул. Олеся Гончара, 19','49000','(0562) 39-57-00','(067) 399-14-21','symbolplus@gmail.com',NULL,NULL,'symbolplus@skype.com','Организация: Днепр'),(2,'Киев','ул. Красноармейская','01001','(044) 372-16-57','(050) 547-19-20','fortuna-ua@ukr.net',NULL,NULL,'fortunaua@skype.com',''),(3,'Харьков','ул. Артема, 48','61000','(057) 134-48-79','','',NULL,NULL,NULL,NULL),(4,'Донецк','ул. Первомайская, 76','83000','(062) 237-78-77','','',NULL,NULL,NULL,NULL),(5,'Днепропетровск','пр. Карла Маркса, 49','49000','(067) 374-17-56','','',NULL,NULL,NULL,NULL),(6,'Киев','ул. Крещатик, 24','01001','(044) 356-23-48','','',NULL,NULL,NULL,NULL),(7,'Львов','ул. Галицкая, 17','79000','(095) 298-88-71','','',NULL,NULL,NULL,NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contract`
--

LOCK TABLES `contract` WRITE;
/*!40000 ALTER TABLE `contract` DISABLE KEYS */;
INSERT INTO `contract` VALUES (1,'12078991','2013-08-01'),(2,'12078992','2013-08-02'),(3,'12078993','2013-08-10'),(4,'12078994','2013-08-10');
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
  `organization_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_department_organization1_idx` (`organization_id`),
  CONSTRAINT `fk_department_organization1` FOREIGN KEY (`organization_id`) REFERENCES `organization` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1,'Финансовый','2 этаж, к. 4',1),(2,'Отдел кадров','к. 26',2),(3,'Отдел кадров','1 этаж, к. 1',1),(4,'Служба безопасности','1 этаж, прох',1),(5,'Юридический','к. 34',2),(6,'IT','к. 29',2);
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
  `diploma_name` varchar(60) NOT NULL,
  `diploma_year` year(4) NOT NULL,
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
  `person_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_errand_person1_idx` (`person_id`),
  CONSTRAINT `fk_errand_person1` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `errand`
--

LOCK TABLES `errand` WRITE;
/*!40000 ALTER TABLE `errand` DISABLE KEYS */;
INSERT INTO `errand` VALUES (2,'2013-03-01','2013-03-14',1);
/*!40000 ALTER TABLE `errand` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organization`
--

LOCK TABLES `organization` WRITE;
/*!40000 ALTER TABLE `organization` DISABLE KEYS */;
INSERT INTO `organization` VALUES (1,'ООО \"Символ-Плюс\"',1),(2,'ООО \"Фортуна ЛТД\"',2),(3,'ООО \"Судотек\"',3);
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passport`
--

LOCK TABLES `passport` WRITE;
/*!40000 ALTER TABLE `passport` DISABLE KEYS */;
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
  `person_age` smallint(5) unsigned NOT NULL,
  `person_gender` enum('M','F') NOT NULL,
  `person_citizenship` varchar(25) NOT NULL,
  `person_ident` varchar(10) NOT NULL,
  `person_driver` enum('B','C','N') NOT NULL,
  `person_military` enum('Y','N') NOT NULL,
  `person_marital` enum('H','W','N') NOT NULL,
  `person_diploma` enum('Y','N') NOT NULL,
  `person_jobber` enum('Y','N') NOT NULL,
  `person_work` varchar(2) NOT NULL,
  `person_tabno` smallint(5) unsigned NOT NULL,
  `person_place` smallint(5) unsigned NOT NULL,
  `passport_id` int(10) unsigned DEFAULT NULL,
  `photo_id` int(11) unsigned DEFAULT NULL,
  `contact_id` int(10) unsigned DEFAULT NULL,
  `department_id` int(10) unsigned DEFAULT NULL,
  `organization_id` int(10) unsigned DEFAULT NULL,
  `worktime_id` int(11) unsigned DEFAULT NULL,
  `bonus_id` int(11) unsigned DEFAULT NULL,
  `contract_id` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_person_contact1_idx` (`contact_id`),
  KEY `fk_person_passport1_idx` (`passport_id`),
  KEY `fk_person_department1_idx` (`department_id`),
  KEY `fk_person_organization1_idx` (`organization_id`),
  KEY `fk_person_worktime1_idx` (`worktime_id`),
  KEY `fk_person_photo1_idx` (`photo_id`),
  KEY `fk_person_bonus1_idx` (`bonus_id`),
  KEY `fk_person_contract1_idx` (`contract_id`),
  CONSTRAINT `fk_person_bonus1` FOREIGN KEY (`bonus_id`) REFERENCES `bonus` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_person_contact1` FOREIGN KEY (`contact_id`) REFERENCES `contact` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_person_contract1` FOREIGN KEY (`contract_id`) REFERENCES `contract` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_person_department1` FOREIGN KEY (`department_id`) REFERENCES `department` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_person_organization1` FOREIGN KEY (`organization_id`) REFERENCES `organization` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_person_passport1` FOREIGN KEY (`passport_id`) REFERENCES `passport` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_person_photo1` FOREIGN KEY (`photo_id`) REFERENCES `photo` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_person_worktime1` FOREIGN KEY (`worktime_id`) REFERENCES `worktime` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (1,'Дерябин','Александр','Сергеевич','1969-02-01',45,'M','Украина','1234567891','B','Y','W','Y','N','25',41201,310,NULL,NULL,6,NULL,1,3,NULL,NULL),(2,'Калинина','Анна','Павловна','1978-12-10',36,'F','Украина','1234567892','N','N','H','Y','N','16',41202,117,NULL,NULL,NULL,NULL,1,3,NULL,NULL),(3,'Иноземцева','Евгения','Анатольевна','1981-10-15',33,'F','Украина','1234567893','B','N','N','Y','N','12',41203,122,NULL,NULL,NULL,NULL,2,1,NULL,NULL),(4,'Казарновский','Максим','Семенович','1981-08-03',33,'M','Украина','1234567894','B','Y','W','Y','N','10',41204,123,NULL,NULL,NULL,NULL,1,2,NULL,NULL),(5,'Куличенко','Анна','Павловна','1982-11-12',32,'F','Украина','1234567895','N','N','H','Y','N','10',41205,110,NULL,NULL,NULL,NULL,2,1,NULL,NULL),(6,'Кузьменко','Александр','Викторович','1987-10-15',27,'M','Украина','1234567896','N','N','N','Y','N','7',41206,223,NULL,NULL,NULL,NULL,3,2,NULL,NULL),(7,'Борисенко','Виктор','Петрович','1980-03-02',34,'M','Украина','1234567897','C','Y','W','Y','N','12',41207,224,NULL,NULL,NULL,NULL,2,3,NULL,NULL),(8,'Гурская','Екатерина','Юрьевна','1983-11-09',31,'F','Украина','1234567898','B','N','H','Y','N','11',41208,227,NULL,NULL,NULL,NULL,2,2,NULL,NULL),(9,'Боговик','Александр','Александрович','1986-07-06',28,'M','Украина','1234567899','B','N','W','Y','N','9',41209,311,NULL,NULL,NULL,NULL,3,3,NULL,NULL),(10,'Шульга','Екатерина','Сергеевна','1985-03-04',29,'F','Украина','1234567810','B','N','H','Y','N','7',41210,228,NULL,NULL,NULL,NULL,3,2,NULL,NULL),(11,'Макаров','Игорь','Иванович','1987-06-11',27,'M','Россия','1234567811','B','Y','N','N','Y','7',41211,230,NULL,NULL,NULL,NULL,1,3,NULL,NULL),(12,'Зайцев','Даниил','Олегович','1977-09-01',37,'M','Украина','1234567812','C','Y','W','Y','N','14',41212,231,NULL,NULL,NULL,NULL,2,1,NULL,NULL),(13,'Синегубова','Марина','Валериевна','1976-03-22',38,'F','Украина','1234567813','B','N','H','Y','N','15',41213,232,NULL,NULL,NULL,NULL,2,2,NULL,NULL),(14,'Антонова','Наталья','Петровна','1979-10-01',35,'F','Украина','1234567814','B','N','H','Y','N','16',41214,405,NULL,NULL,NULL,NULL,1,3,NULL,NULL),(15,'Ильинский','Иван','Сергеевич','1973-04-29',41,'M','Белоруссия','1234567815','B','Y','W','Y','Y','17',41215,405,NULL,NULL,NULL,NULL,1,2,NULL,NULL);
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
  `person_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_position_person1_idx` (`person_id`),
  CONSTRAINT `fk_position_person1` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `position`
--

LOCK TABLES `position` WRITE;
/*!40000 ALTER TABLE `position` DISABLE KEYS */;
INSERT INTO `position` VALUES (1,'Бухгалтер','2013-08-01',NULL,2),(2,'Программист','2013-08-02',NULL,9),(3,'Менеджер','2013-08-03',NULL,12),(4,'Юрист-Консультант','2013-08-03',NULL,10),(5,'Охранник','2013-08-05',NULL,5),(6,'Старший охранник','2013-08-10',NULL,1),(7,'Водитель погрузчика','2013-08-10',NULL,15),(8,'Инженер-технолог','2013-08-12',NULL,8),(9,'Администратор БД','2013-08-25',NULL,6);
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
  `person_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_salary_person1_idx` (`person_id`),
  CONSTRAINT `fk_salary_person1` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary`
--

LOCK TABLES `salary` WRITE;
/*!40000 ALTER TABLE `salary` DISABLE KEYS */;
INSERT INTO `salary` VALUES (1,2500,'2014-10-21',NULL),(2,2750,'2014-06-09',NULL),(3,3000,'2014-02-14',NULL),(4,3250,'2014-12-08',NULL),(5,4100,'2014-05-05',NULL),(6,4780,'2014-06-01',NULL);
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

-- Dump completed on 2014-08-31 16:37:36
