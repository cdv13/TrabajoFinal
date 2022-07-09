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
-- Table structure for table `cartelera`
--

DROP TABLE IF EXISTS `cartelera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cartelera` (
  `id_Cartelera` int NOT NULL AUTO_INCREMENT,
  `id_Pelicula` int NOT NULL,
  `id_Sala` int NOT NULL,
  `Horario` time DEFAULT NULL,
  PRIMARY KEY (`id_Cartelera`),
  KEY `id_Pelicula` (`id_Pelicula`),
  KEY `id_Sala` (`id_Sala`),
  CONSTRAINT `cartelera_ibfk_1` FOREIGN KEY (`id_Pelicula`) REFERENCES `pelicula` (`id_Pelicula`),
  CONSTRAINT `cartelera_ibfk_2` FOREIGN KEY (`id_Sala`) REFERENCES `sala` (`id_Sala`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cartelera`
--

LOCK TABLES `cartelera` WRITE;
/*!40000 ALTER TABLE `cartelera` DISABLE KEYS */;
INSERT INTO `cartelera` VALUES (1,1,1,'16:00:00'),(2,2,2,'16:00:00'),(3,3,3,'18:00:00'),(4,4,1,'18:00:00'),(5,5,4,'19:00:00'),(6,6,3,'15:00:00'),(7,7,2,'20:00:00');
/*!40000 ALTER TABLE `cartelera` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-08 21:11:02
