-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 22, 2021 at 04:35 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `data_keluarga`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_rt`
--

CREATE TABLE `data_rt` (
  `NoKK` int(10) NOT NULL,
  `Kepala_Keluarga` varchar(225) NOT NULL,
  `Jumlah_Anggota` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_rt`
--

INSERT INTO `data_rt` (`NoKK`, `Kepala_Keluarga`, `Jumlah_Anggota`) VALUES
(20004, 'Mamad Al-Baghdadi', '5'),
(20006, 'Agus Hariyadi', '4'),
(20005, 'Raihan Simanjuntak', '5'),
(20007, 'Mustofa Ikhlas', '5'),
(20008, 'Farhan Ghifari', '5'),
(20001, 'Wahyu Nugroho', '5'),
(20003, 'Aris Budianto', '4'),
(20002, 'Surya Lesmana', '4');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
