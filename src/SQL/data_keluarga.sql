-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 20, 2021 at 07:24 AM
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
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `adminName` varchar(30) NOT NULL,
  `Password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`adminName`, `Password`) VALUES
('bima_hamdani93', 'persib73');

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
(20001, 'Suhartono', '5'),
(20004, 'Mamad Al-Baghdadi', '5'),
(20006, 'Agus Hariyadi', '4'),
(20002, 'Riyanto', '5'),
(20003, 'Muslimin', '4'),
(20005, 'Raihan Simanjuntak', '5'),
(20007, 'Mustofa Ikhlas', '5'),
(20008, 'Farhan Ghifari', '5');

-- --------------------------------------------------------

--
-- Table structure for table `keluarga`
--

CREATE TABLE `keluarga` (
  `nomor_kk` varchar(35) NOT NULL,
  `kepala_keluarga` varchar(225) NOT NULL,
  `ibu` varchar(225) NOT NULL,
  `anak1` varchar(225) NOT NULL,
  `anak2` varchar(225) NOT NULL,
  `anak3` varchar(225) NOT NULL,
  `alamat` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `keluarga`
--

INSERT INTO `keluarga` (`nomor_kk`, `kepala_keluarga`, `ibu`, `anak1`, `anak2`, `anak3`, `alamat`) VALUES
('12345', 'Suhartono', 'Suhartini', 'Abi', 'Adi', 'Aji', 'Jl. Mawar'),
('200876', 'Mail', 'Mei Mei', 'Jarjit', 'Ijat', '', 'Jl. Melati');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `Username` varchar(30) NOT NULL,
  `Password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`Username`, `Password`) VALUES
('bima2', '14'),
('funikz', 'ole123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`adminName`);

--
-- Indexes for table `keluarga`
--
ALTER TABLE `keluarga`
  ADD PRIMARY KEY (`nomor_kk`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`Username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
