-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 22, 2025 at 01:01 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cafe_mange_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `contact`
--

CREATE TABLE `contact` (
  `Name` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Message` varchar(1500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `contact`
--

INSERT INTO `contact` (`Name`, `Email`, `Message`) VALUES
('jack', 'jack@gmail.com', 'I like your cafe solace please open the branch near malir.'),
('habiba', 'habiba@gmail.com', 'i like the cafe brewd coffe .I love it too much'),
('laiba12', 'laiba@gmail.com', 'i like your sandwich...'),
('humna', 'humna@gmail.com', 'delicious cake');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `Email` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Email`, `Password`) VALUES
('Nimra@gmail.com', '09876'),
('humna@gmail.com', '155678'),
('hamna15@gmail. com', '155678'),
('nimra@gmail.com', '09876'),
('', ''),
('jack@gmail.com', 'jack123'),
('ali@gmail.com', 'ali098'),
('laiba@gmail.com', 'laiba098'),
('humna1@gmail.com', 'humna098'),
('ummehabibakhan15@gmail.com', 'khan1556');

-- --------------------------------------------------------

--
-- Table structure for table `registeration`
--

CREATE TABLE `registeration` (
  `Name` varchar(50) NOT NULL,
  `Phone_no` int(100) NOT NULL,
  `Address` varchar(30) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `registeration`
--

INSERT INTO `registeration` (`Name`, `Phone_no`, `Address`, `Email`, `Password`) VALUES
('habiba', 456789, '', 'habiba@gmail.com', '54321'),
('iqra', 123456789, '', 'iqra@gmail.com', 'arqa'),
('jack', 678901, '', 'jack@gmail.com', 'jack123'),
('ali', 367891020, 'mailr cantt', 'ali@gmail.com', 'ali098'),
('laiba', 3568900, 'malir cantt', 'laiba@gmail.com', 'laiba098'),
('humna', 31789300, 'quaid bad', 'humna1@gmail.com', 'humna098'),
('habiba', 678900, 'malir', 'ummehabibakhan15@gmail.com', '15567');

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `ID` int(11) NOT NULL,
  `Item_name` varchar(60) NOT NULL,
  `Quantity` int(5) NOT NULL,
  `Price` int(5) NOT NULL,
  `Total` int(6) NOT NULL,
  `Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`ID`, `Item_name`, `Quantity`, `Price`, `Total`, `Date`) VALUES
(1, 'Brewed Coffee', 5, 4, 20, '2020-05-12'),
(2, 'Cold Coffee', 3, 12, 12, '2025-05-25'),
(3, 'mojito', 3, 12, 12, '2025-05-25'),
(4, 'herbal tea', 3, 12, 24, '2025-05-25'),
(5, 'Cold Coffee', 3, 12, 12, '2025-05-26'),
(6, 'mojito', 3, 12, 24, '2025-05-26'),
(7, 'milk tea', 4, 16, 16, '2025-05-26'),
(8, 'Brewed Coffee', 3, 12, 12, '2025-05-26'),
(9, 'mojito', 2, 8, 20, '2025-05-26'),
(10, 'Brewed Coffee', 2, 8, 8, '2025-05-26'),
(11, 'Strawbery smothie', 4, 16, 16, '2025-05-29'),
(12, 'Brewed Coffee', 4, 16, 16, '2025-06-09'),
(13, 'lava cake', 2, 8, 8, '2025-06-11'),
(14, 'chocolate smothie', 4, 16, 16, '2025-06-12'),
(15, 'Brewed Coffee', 3, 12, 12, '2025-06-13'),
(26, 'herbal tea', 2, 8, 8, '2025-06-21'),
(27, 'herbal tea', 2, 8, 8, '2025-06-21'),
(28, 'milk tea', 1, 4, 4, '2025-06-21'),
(29, 'milk tea', 1, 4, 4, '2025-06-21'),
(30, 'Cappicino', 2, 8, 8, '2025-06-22'),
(31, 'Cappicino', 2, 8, 8, '2025-06-22'),
(32, 'Cookies', 2, 8, 8, '2025-06-22'),
(33, 'Cookies', 2, 8, 8, '2025-06-22'),
(34, 'Cookies', 2, 8, 8, '2025-06-22'),
(35, 'Brewed Coffee', 3, 12, 12, '2025-06-22'),
(36, 'Brewed Coffee', 3, 12, 12, '2025-06-22'),
(37, 'Brownies', 2, 8, 8, '2025-06-22'),
(38, 'Brownies', 2, 8, 8, '2025-06-22'),
(39, 'Brownies', 2, 8, 8, '2025-06-22');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `ID_2` (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `sales`
--
ALTER TABLE `sales`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
