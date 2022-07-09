-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: cinemar
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pelicula`
--

DROP TABLE IF EXISTS `pelicula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pelicula` (
  `id_Pelicula` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(250) DEFAULT NULL,
  `Director` varchar(250) DEFAULT NULL,
  `Duracion` int DEFAULT NULL,
  `Genero` varchar(50) DEFAULT NULL,
  `Idioma` varchar(50) DEFAULT NULL,
  `id_Sala` int NOT NULL,
  PRIMARY KEY (`id_Pelicula`),
  KEY `id_Sala` (`id_Sala`),
  CONSTRAINT `pelicula_ibfk_1` FOREIGN KEY (`id_Sala`) REFERENCES `sala` (`id_Sala`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pelicula`
--

LOCK TABLES `pelicula` WRITE;
/*!40000 ALTER TABLE `pelicula` DISABLE KEYS */;
INSERT INTO `pelicula` VALUES (1,'Minions: Nace un villano','Steve Carell',87,'Infantil','Español',1),(2,'Sonic 2: La película','Jeff Fowler',122,'Infantil','Español',2),(3,'Mamma Roma','Pier Paolo Pasolini',110,'Drama','Español',3),(4,'Thor, amor y trueno','Taika Waititi',125,'Ciencia Ficcion','Español',1),(5,'El teléfono negro','Scott Derrickson',104,'Terror','Ingles',4),(6,'Alicia y el alcalde','James Benjamin Shannon',103,'Comedia','Ingles',3),(7,'Jurassic World: Dominio','Colin Trevorrow',146,'Accion','Español',2);
/*!40000 ALTER TABLE `pelicula` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-08 21:11:03
