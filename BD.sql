-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-11-2021 a las 19:47:38
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.11

create database edificios;
use edificios;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `edificios`
--






DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarinspeccion` (IN `new_idP` VARCHAR(10))  BEGIN
    select * from inspeccion where ID_Inspeccion = new_idP;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarpostulacionP` (IN `new_idPP` VARCHAR(10))  BEGIN
    select * from postulacion_proveedor where ID_PostulacionP = new_idPP;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarpostulacionT` (IN `new_id` VARCHAR(10))  BEGIN
    select * from postulacion_transporte where ID_PostulacionT = new_id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarproductos` (IN `new_idPP` VARCHAR(10))  BEGIN
    select * from producto where RUT_P = new_idPP;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarreporte` (IN `new_idR` VARCHAR(10))  BEGIN
    select * from reporte_transporte where ID_ReporteT = new_idR;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarresumen` (IN `new_idRR` VARCHAR(10))  BEGIN
    select * from resumen_venta_cx where ID_Venta = new_idRR;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarsolicitud` (IN `new_idSS` VARCHAR(10))  BEGIN
    select * from solicitud_compra where ID_Solicitud = new_idSS;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarventaEX` (IN `new_idRR` VARCHAR(10))  BEGIN
    select * from venta_externa where ID_Venta = new_idRR;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listarinspeccion` ()  BEGIN
    select * from inspeccion;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listarpostulacionP` ()  BEGIN
    select * from postulacion_proveedor;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listarpostulacionT` ()  BEGIN
    select * from postulacion_transporte;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listarproductos` ()  BEGIN
    select * from producto;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listarsolicitud` ()  BEGIN
    select * from solicitud_compra;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listarsresumen` ()  BEGIN
    select * from resumen_venta_cx;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listarsventasEX` ()  BEGIN
    select * from venta_externa;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `Rut_Admin` varchar(10) NOT NULL,
  `Nom_Admin` varchar(50) NOT NULL,
  `Direccion_Admin` varchar(50) NOT NULL,
  `Telefono_Admin` varchar(10) NOT NULL,
  `Tipo_Usuario` varchar(30) NOT NULL DEFAULT 'Administrador',
  `Contraseña` varchar(30) NOT NULL DEFAULT 'ADMIN'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`Rut_Admin`, `Nom_Admin`, `Direccion_Admin`, `Telefono_Admin`, `Tipo_Usuario`, `Contraseña`) VALUES
('111', '111', '111', '111', 'administrador', '111'),
('5555', 'dasdsa', 'asdsad', '5555', 'administrador', 'ADMIN'),
('9999999', 'nueve nueve nuevecito', 'las nueve 999', '9999999', 'Administrador', 'ADMIN');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente_externo`
--

CREATE TABLE `cliente_externo` (
  `RUT_CX` varchar(10) NOT NULL,
  `Nom_CX` varchar(50) NOT NULL,
  `Direccion_CX` varchar(50) NOT NULL,
  `Telefono_CX` int(10) NOT NULL,
  `Pais` varchar(15) NOT NULL,
  `Tipo_Usuario` varchar(30) NOT NULL DEFAULT 'Cliente_Ex',
  `Contraseña` varchar(30) NOT NULL DEFAULT 'ClientEX'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente_externo`
--

INSERT INTO `cliente_externo` (`RUT_CX`, `Nom_CX`, `Direccion_CX`, `Telefono_CX`, `Pais`, `Tipo_Usuario`, `Contraseña`) VALUES
('11111', 'adadsa', 'asdasd', 1111, 'asdsd', 'Cliente Externo', '111'),
('145618937', 'Dinosaurio roberto anacleto', 'El campo titirilquen 3013', 968716381, 'Africa', 'Cliente_Ex', 'ClientEX');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente_interno`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contrato`
--

CREATE TABLE `contrato` (
  `ID_Contrato` varchar(10) NOT NULL,
  `Descripcion` varchar(5000) NOT NULL,
  `RUT_CX` varchar(20) NOT NULL,
  `ID` varchar(20) NOT NULL,
  `Fecha_Inicio` varchar(20) NOT NULL,
  `Fecha_Termino` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `contrato`
--


--

CREATE TABLE `edificios` (
  `ID` varchar(10) NOT NULL,
  `Nombre` varchar(1000) NOT NULL,
  `Descripcion` varchar(5000) NOT NULL,
  `Rut_Admin` varchar(10) NOT NULL,
  `Npisos` varchar(10) NOT NULL,
  `fecha` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `publicacion_venta`
--

INSERT INTO `edificios` (`ID`, `Nombre`, `Descripcion`, `Rut_Admin`, `Npisos`, `fecha`) VALUES
('1', 'EDIFICIO XD', 'XD', '203279825', '13', 'Oct 15, 2021');


--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`Rut_Admin`);

--
-- Indices de la tabla `cliente_externo`
--
ALTER TABLE `cliente_externo`
  ADD PRIMARY KEY (`RUT_CX`);


--
-- Indices de la tabla `cliente_externo`
--
ALTER TABLE `contrato`
  ADD PRIMARY KEY (`ID_Contrato`),
  ADD KEY `RUT_CX` (`RUT_CX`),
  ADD KEY `ID` (`ID`);

--
-- Indices de la tabla `edificio`
--
ALTER TABLE `edificios`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `Rut_Admin` (`Rut_Admin`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
