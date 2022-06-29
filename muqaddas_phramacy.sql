-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 08, 2022 at 07:26 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `muqaddas_phramacy`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `ID` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`ID`, `username`, `password`) VALUES
(1, 'admin', 'admin'),
(2, 'admin2', 'admin2');

-- --------------------------------------------------------

--
-- Table structure for table `audit_table`
--

CREATE TABLE `audit_table` (
  `ID` int(11) NOT NULL,
  `year` year(4) NOT NULL,
  `month` varchar(30) NOT NULL,
  `monthly_sell` text NOT NULL,
  `monthly_buy` text NOT NULL,
  `total_profit` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `medicine_table`
--

CREATE TABLE `medicine_table` (
  `ID` int(11) NOT NULL,
  `medicine_name` varchar(50) NOT NULL,
  `medicine_formula` varchar(40) NOT NULL,
  `medicine_weight` varchar(30) NOT NULL,
  `medicine_quantity` varchar(255) DEFAULT NULL,
  `expire_date` date DEFAULT NULL,
  `medicine_one_price` varchar(255) DEFAULT NULL,
  `total_price` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `medicine_table`
--

INSERT INTO `medicine_table` (`ID`, `medicine_name`, `medicine_formula`, `medicine_weight`, `medicine_quantity`, `expire_date`, `medicine_one_price`, `total_price`) VALUES
(1, 'panadol', 'paracetamol', '20mg', '30', '2022-05-01', 'null', 'null'),
(2, 'parsd', 'fscv', '400mg', 'null', '2022-01-01', 'null', 'null'),
(3, 'vdc', 'yht', '500mg', 'null', '2022-03-03', 'null', 'null'),
(5, 'dgg', 'qqqq', '300mg', 'null', '2022-07-17', 'null', 'null'),
(6, 'hjhk', 'eeee', '300mg', '5', '2022-07-01', 'null', 'null'),
(7, 'sofacs', 'amplo', '40mg', '30', '2022-06-05', '90', '2700'),
(19, 'Hammad', 'kkkkl', '330mg', '5', '2022-06-05', '20', '100'),
(20, 'dslf', 'lsdkf', 'kf', '4', '2022-06-01', '890', '3560'),
(21, 'sf', 'sdklf', 'sfklj', '50', '2022-06-05', 'null', 'null'),
(24, 'arsalan', 'formula', '30mg', '25', '2024-06-08', '250', '6250'),
(25, 'ksdjf', 'lsdfj', 'sdlfk', '7', '2022-07-17', '5', '35'),
(27, 'suf', 'jf', '30mg', '20', '2022-06-11', '100', '2000');

-- --------------------------------------------------------

--
-- Table structure for table `seller_table`
--

CREATE TABLE `seller_table` (
  `ID` int(11) NOT NULL,
  `seller_name` varchar(40) NOT NULL,
  `seller_company` varchar(40) NOT NULL,
  `seller_bill_amount` int(11) NOT NULL,
  `seller_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `seller_table`
--

INSERT INTO `seller_table` (`ID`, `seller_name`, `seller_company`, `seller_bill_amount`, `seller_date`) VALUES
(19, 'rafay', 'gfx', 1500, '2022-03-11'),
(21, 'shahzaib', 'ABC', 5000, '2022-06-22'),
(22, 'Arsalan', 'farig', 4500, '2022-06-30'),
(23, 'rafay', 'gfx', 1000, '2022-03-19'),
(24, 'bilal', 'gets', 4500, '2022-06-30');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `audit_table`
--
ALTER TABLE `audit_table`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `medicine_table`
--
ALTER TABLE `medicine_table`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `seller_table`
--
ALTER TABLE `seller_table`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `audit_table`
--
ALTER TABLE `audit_table`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `medicine_table`
--
ALTER TABLE `medicine_table`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `seller_table`
--
ALTER TABLE `seller_table`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
