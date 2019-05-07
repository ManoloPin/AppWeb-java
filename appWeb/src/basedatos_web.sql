-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 03, 2019 at 10:53 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `basedatos_web`
--

-- --------------------------------------------------------

--
-- Table structure for table `comentarios`
--

CREATE TABLE `comentarios` (
  `ID_Comentarios` int(10) NOT NULL,
  `Cod_usu` int(10) NOT NULL,
  `cod_pu` int(10) NOT NULL,
  `Nombre_Usu` varchar(60) COLLATE utf8mb4_spanish_ci NOT NULL,
  `Desc_coment` varchar(500) COLLATE utf8mb4_spanish_ci NOT NULL,
  `URL_PU` varchar(400) COLLATE utf8mb4_spanish_ci NOT NULL,
  `Fecha-hora_Com` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `preguntas`
--

CREATE TABLE `preguntas` (
  `ID_Preguntas` int(10) NOT NULL,
  `Cod_Usu` int(10) NOT NULL,
  `Cod_Public` int(10) NOT NULL,
  `Nombre_usu` varchar(60) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Texto` varchar(3000) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Fecha-Hora_Pre` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `publicaciones`
--

CREATE TABLE publicaciones (
  ID_Publicacion int(10) NOT NULL,
  Cod_Usu int(10) NOT NULL,
  Tipo set('informativo','educativo') COLLATE utf8mb4_spanish_ci NOT NULL,
  Titulo_Pu varchar(60) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  Desc_Pu varchar(250) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  URL varchar(400) COLLATE utf8mb4_spanish_ci NOT NULL,
  FH_Pu datetime NOT NULL,
  Puntos int(1) NOT NULL,
  Comentarios int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

CREATE TABLE usuarios (
   id             INT(10) NOT NULL,
   Correo         VARCHAR(80) COLLATE utf8mb4_spanish_ci NOT NULL,
   Clave          CHAR(32) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL
) ;
ALTER TABLE usuarios ADD CONSTRAINT usuarios_pk PRIMARY KEY (id);
ALTER TABLE usuarios ADD CONSTRAINT usuarios_uq UNIQUE (Correo);
--
-- Dumping data for table `usuarios`
--

INSERT INTO `usuarios` (`ID_Usuario`, `Correo`, `Clave`) VALUES
(1, 'a@a.com', '12345'),
(2, 'j@j.com', 'pan4321');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `comentarios`
--
ALTER TABLE `comentarios`
  ADD PRIMARY KEY (`ID_Comentarios`),
  ADD KEY `Cod_usu` (`Cod_usu`),
  ADD KEY `cod_pu` (`cod_pu`);

--
-- Indexes for table `preguntas`
--
ALTER TABLE `preguntas`
  ADD PRIMARY KEY (`ID_Preguntas`),
  ADD KEY `Cod_Usu` (`Cod_Usu`),
  ADD KEY `Cod_Public` (`Cod_Public`);

--
-- Indexes for table `publicaciones`
--
ALTER TABLE `publicaciones`
  ADD PRIMARY KEY (`ID_Publicacion`),
  ADD KEY `Cod_Usu` (`Cod_Usu`);

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ID_Usuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `preguntas`
--
ALTER TABLE `preguntas`
  MODIFY `ID_Preguntas` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `publicaciones`
--
ALTER TABLE `publicaciones`
  MODIFY `ID_Publicacion` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `ID_Usuario` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `comentarios`
--
ALTER TABLE `comentarios`
  ADD CONSTRAINT `comentarios_ibfk_1` FOREIGN KEY (`Cod_usu`) REFERENCES `usuarios` (`ID_Usuario`),
  ADD CONSTRAINT `comentarios_ibfk_2` FOREIGN KEY (`cod_pu`) REFERENCES `publicaciones` (`ID_Publicacion`);

--
-- Constraints for table `preguntas`
--
ALTER TABLE `preguntas`
  ADD CONSTRAINT `preguntas_ibfk_1` FOREIGN KEY (`Cod_Usu`) REFERENCES `usuarios` (`ID_Usuario`),
  ADD CONSTRAINT `preguntas_ibfk_2` FOREIGN KEY (`Cod_Public`) REFERENCES `publicaciones` (`ID_Publicacion`);

--
-- Constraints for table `publicaciones`
--
ALTER TABLE `publicaciones`
  ADD CONSTRAINT `publicaciones_ibfk_1` FOREIGN KEY (`Cod_Usu`) REFERENCES `usuarios` (`ID_Usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
