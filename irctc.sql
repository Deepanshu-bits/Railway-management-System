-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Aug 27, 2020 at 01:57 PM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `irctc`
--

-- --------------------------------------------------------

--
-- Table structure for table `addclient`
--

CREATE TABLE `addclient` (
  `clientID` int(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `dob` varchar(20) NOT NULL,
  `address` varchar(30) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `age` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `addclient`
--

INSERT INTO `addclient` (`clientID`, `name`, `dob`, `address`, `gender`, `age`) VALUES
(1, 'raju ', '1997-06-12', 'bihar', 'male', 22),
(2, 'deepanshu', '1996-08-23', 'Bhopal', 'male', 23),
(3, 'aakash', '1996-11-14', 'Hariyana', 'male', 23),
(4, 'aman', '1997-12-12', 'Pratapgarg', 'male', 23),
(6, 'raju ', '1997-06-12', 'bihar', 'male', 22),
(123, 'gobi', '1995-12-12', 'biharan', 'male', 24),
(12445, 'dvdgsdv', '12/12/1995', 'vzcvzc', 'male', 23),
(12446, 'anime', '27/12/1997', 'ad ad ad ad a ddd', 'male', 22),
(12447, 'gdsd', '12/12/1995', 'ddsgsg', 'male', 24);

-- --------------------------------------------------------

--
-- Table structure for table `availabletrains`
--

CREATE TABLE `availabletrains` (
  `tno` int(10) NOT NULL,
  `tname` varchar(20) NOT NULL,
  `fs` varchar(20) NOT NULL,
  `ts` varchar(20) NOT NULL,
  `dept` varchar(20) NOT NULL,
  `cost` float NOT NULL,
  `doj` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `availabletrains`
--

INSERT INTO `availabletrains` (`tno`, `tname`, `fs`, `ts`, `dept`, `cost`, `doj`) VALUES
(12111, 'kapilexp', 'Mumbai', 'Kolkata', '12:12:12', 100, '25/12/2019'),
(12122, 'jhelum', 'Delhi', 'Bhopal', '12:12:10', 1000, '27/12/19'),
(12345, 'mangla', 'Delhi', 'Chennai', '23:08:11.000000', 2020, '2010-12-12'),
(12349, 'Bihari expressini', 'Mumbai', 'Kolkata', '22:11:11.000000', 2345, '1995-12-12'),
(47943, 'Navy exp', 'Delhi', 'Bhopal', '12:11:11', 1234, '25/11/19'),
(55555, 'mangla', 'Kozhikode', 'Bhopal', '23:33:12', 200, '1995-12-12');

-- --------------------------------------------------------

--
-- Table structure for table `bookticket`
--

CREATE TABLE `bookticket` (
  `pnr` int(15) NOT NULL,
  `tname` varchar(20) NOT NULL,
  `fs` varchar(20) NOT NULL,
  `ts` varchar(20) NOT NULL,
  `dept` varchar(20) NOT NULL,
  `cost` float NOT NULL,
  `doj` varchar(20) NOT NULL,
  `p1` varchar(20) DEFAULT NULL,
  `p2` varchar(20) DEFAULT NULL,
  `p3` varchar(20) DEFAULT NULL,
  `g1` varchar(10) DEFAULT NULL,
  `g2` varchar(10) DEFAULT NULL,
  `g3` varchar(10) DEFAULT NULL,
  `age1` varchar(11) DEFAULT NULL,
  `age2` varchar(11) DEFAULT NULL,
  `age3` varchar(11) DEFAULT NULL,
  `tcost` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bookticket`
--

INSERT INTO `bookticket` (`pnr`, `tname`, `fs`, `ts`, `dept`, `cost`, `doj`, `p1`, `p2`, `p3`, `g1`, `g2`, `g3`, `age1`, `age2`, `age3`, `tcost`) VALUES
(9428678, 'Bihari expressini', 'Mumbai', 'Kolkata', '22:11:11.000000', 2345, '1995-12-12', 'fdsf', 'aakash', 'raju chacha', 'male', 'male', 'male', '12', '23', '23', '4690'),
(9428679, 'Bihari expressini', 'Mumbai', 'Kolkata', '22:11:11.000000', 2345, '1995-12-12', 'deepansu09', 'raju chacha', 'gobi', 'male', 'male', 'male', '12', '23', '24', '7035'),
(9428680, 'Bihari expressini', 'Mumbai', 'Kolkata', '22:11:11.000000', 2345, '1995-12-12', 'deepanshu', 'aakash', 'raju ', 'male', 'male', 'male', '23', '23', '23', '7035'),
(9428681, 'Bihari expressini', 'Mumbai', 'Kolkata', '22:11:11.000000', 2345, '1995-12-12', 'deepanshu', '0', '0', 'male', '0', '0', '23', '0', '0', '2345.0'),
(9428682, 'Bihari expressini', 'Mumbai', 'Kolkata', '22:11:11.000000', 2345, '1995-12-12', 'deepanshu', 'fdsf', 'deepansu09', 'male', 'male', 'male', '23', '12', '12', '7035.0'),
(9428683, 'Bihari expressini', 'Mumbai', 'Kolkata', '22:11:11.000000', 2345, '1995-12-12', 'ashish', 'deepanshu', 'deepansu09', 'female', 'male', 'male', '22', '23', '12', '7035.0'),
(9428684, 'Bihari expressini', 'Mumbai', 'Kolkata', '22:11:11.000000', 2345, '1995-12-12', 'deepansu09', 'gobi', 'aman', 'male', 'male', 'male', '12', '24', '30', '7035.0'),
(9428685, 'kapilexp', 'Mumbai', 'Kolkata', '12:12:12', 100, '25/12/2019', 'deepanshu', 'aakash', '0', 'male', 'male', '0', '23', '23', '0', '200.0'),
(9428686, 'jhelum', 'Delhi', 'Bhopal', '12:12:10', 1000, '27/12/19', 'aakash', 'aman', 'gobi', 'male', 'male', 'male', '23', '23', '24', '3000.0'),
(9428687, 'Navy exp', 'Delhi', 'Bhopal', '12:11:11', 1234, '25/11/19', 'aakash', 'aakash', '0', 'male', 'male', '0', '23', '23', '0', '2468.0'),
(9428688, 'Navy exp', 'Delhi', 'Bhopal', '12:11:11', 1234, '25/11/19', 'aman', 'aman', '0', 'male', 'male', '0', '23', '23', '0', '2468.0'),
(9428689, 'Navy exp', 'Delhi', 'Bhopal', '12:11:11', 1234, '25/11/19', 'aman', 'aman', 'gobi', 'male', 'male', 'male', '23', '23', '24', '3702.0'),
(9428690, 'Navy exp', 'Delhi', 'Bhopal', '12:11:11', 1234, '25/11/19', 'aman', 'aman', '0', 'male', 'male', '0', '23', '23', '0', '2468.0'),
(9428691, 'Navy exp', 'Delhi', 'Bhopal', '12:11:11', 1234, '25/11/19', 'raju ', 'raju ', '0', 'male', 'male', '0', '22', '22', '0', '2468.0'),
(9428692, 'jhelum', 'Delhi', 'Bhopal', '12:12:10', 1000, '27/12/19', 'aakash', 'raju ', 'raju ', 'male', 'male', 'male', '23', '22', '22', '3000.0'),
(9428693, 'Navy exp', 'Delhi', 'Bhopal', '12:11:11', 1234, '25/11/19', 'aakash', 'dvdgsdv', '0', 'male', 'male', '0', '23', '23', '0', '2468.0'),
(9428694, 'Navy exp', 'Delhi', 'Bhopal', '12:11:11', 1234, '25/11/19', 'deepanshu', 'raju ', 'gobi', 'male', 'male', 'male', '23', '22', '24', '3702.0'),
(9428695, 'Navy exp', 'Delhi', 'Bhopal', '12:11:11', 1234, '25/11/19', 'aman', 'raju ', 'dvdgsdv', 'male', 'male', 'male', '23', '22', '23', '3702.0'),
(9428696, 'jhelum', 'Delhi', 'Bhopal', '12:12:10', 1000, '27/12/19', 'aakash', 'aman', 'gobi', 'male', 'male', 'male', '23', '23', '24', '3000.0');

-- --------------------------------------------------------

--
-- Table structure for table `Payment`
--

CREATE TABLE `Payment` (
  `tid` varchar(20) NOT NULL,
  `userid` varchar(20) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `Bankname` varchar(20) NOT NULL,
  `cardno` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `cno` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `dob` varchar(20) NOT NULL,
  `address` varchar(35) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `id` varchar(20) NOT NULL,
  `pass` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`cno`, `name`, `dob`, `address`, `gender`, `id`, `pass`) VALUES
(12, 'deepanshuR', '1995-12-12', 'eqfwfqfgadggczxcxcz', 'male', '  2308', '2331'),
(2, 'shubh', '1996-12-29', 'Khandwa', 'male', '1229', '1234'),
(23, 'naman', '2000/12/12', 'jaipur', 'female', '1231', '1234'),
(12, 'Deepanshu Rathore', '23/10/1995', 'MP', 'male', '1232', '1232'),
(565, 'Deepak', '1995/12/12', 'Delhi', 'female', '12345', '12345'),
(9, 'kap', '6/8/92', 'ad ad ad', 'male', '180283', '180283'),
(13, 'RajuR', '2000-12-12', 'fsdaddgfdagdfgdf', 'male', '2331', '2331');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addclient`
--
ALTER TABLE `addclient`
  ADD PRIMARY KEY (`clientID`);

--
-- Indexes for table `availabletrains`
--
ALTER TABLE `availabletrains`
  ADD PRIMARY KEY (`tno`);

--
-- Indexes for table `bookticket`
--
ALTER TABLE `bookticket`
  ADD PRIMARY KEY (`pnr`);

--
-- Indexes for table `signup`
--
ALTER TABLE `signup`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
