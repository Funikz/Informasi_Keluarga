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
-- Table structure for table `keluarga`
--

CREATE TABLE `keluarga` (
  `NoKK` int(10) NOT NULL,
  `kepala_keluarga` varchar(225) NOT NULL,
  `ibu` varchar(225) NOT NULL,
  `anak1` varchar(225) NOT NULL,
  `anak2` varchar(225) NOT NULL,
  `anak3` varchar(225) NOT NULL,
  `alamat` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `keluarga`
--

INSERT INTO `keluarga` (`NoKK`, `kepala_keluarga`, `ibu`, `anak1`, `anak2`, `anak3`, `alamat`) VALUES
(20001, 'Wahyu Nugroho', 'Lesti Lestari', 'Putri Kencana', 'Muhammad Siroj', 'Ahmad Sudirman', 'Jl. Arjuno 45'),
(20004, 'Mamad Al-Baghdadi', 'Maya Lestari', 'Farhan', 'Yusuf', 'Dewi ', 'Jl. Gajah Mada 1'),
(20006, 'Agus Hariyadi', 'Yuyun Ismawati', 'Aulian Irawan', 'Pratama Arhan', 'Witan Sulaiman', 'Jl. Patimura 10');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `keluarga`
--
ALTER TABLE `keluarga`
  ADD PRIMARY KEY (`NoKK`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `keluarga`
--
ALTER TABLE `keluarga`
  MODIFY `NoKK` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20007;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
