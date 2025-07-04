-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 26, 2024 at 07:16 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gitise`
--

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `did` bigint(20) NOT NULL,
  `dhead` varchar(255) DEFAULT NULL,
  `dname` varchar(255) DEFAULT NULL,
  `budget` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `eid` int(11) NOT NULL,
  `ename` varchar(30) NOT NULL,
  `gender` char(1) NOT NULL,
  `salary` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`eid`, `ename`, `gender`, `salary`) VALUES
(1000, 'Praveen', 'M', 9000),
(1001, 'Kiran', 'M', 15000),
(1002, 'Jaya', 'F', 15000),
(1003, 'Chetan', 'M', 35000),
(1004, 'Madhvesh', 'M', 35000),
(1005, 'Rajesh', 'M', 35000),
(1006, 'Suresh', 'M', 75000);

-- --------------------------------------------------------

--
-- Table structure for table `facpubs`
--

CREATE TABLE `facpubs` (
  `pubid` bigint(20) NOT NULL,
  `authors` varchar(255) DEFAULT NULL,
  `j_name` varchar(255) DEFAULT NULL,
  `p_title` varchar(255) DEFAULT NULL,
  `publisher` varchar(255) DEFAULT NULL,
  `pubyear` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `facpubs`
--

INSERT INTO `facpubs` (`pubid`, `authors`, `j_name`, `p_title`, `publisher`, `pubyear`) VALUES
(1, 'Ajay and Prashant', 'Journal of Data Engineering', 'Clustering in High-dimentional data', 'Elsevier', '2023');

-- --------------------------------------------------------

--
-- Table structure for table `faculty`
--

CREATE TABLE `faculty` (
  `fid` bigint(20) NOT NULL DEFAULT 1000,
  `doj` datetime(6) DEFAULT NULL,
  `designation` varchar(255) DEFAULT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `salary` float NOT NULL,
  `id` bigint(20) NOT NULL,
  `dno` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `faculty`
--

INSERT INTO `faculty` (`fid`, `doj`, `designation`, `fname`, `salary`, `id`, `dno`) VALUES
(20000, '2023-12-30 00:00:00.000000', 'Professor', 'Ajay Acharya', 48000, 20000, 1),
(20001, '2023-12-30 00:00:00.000000', 'Asst. Prof.', 'Sunil', 35000, 20001, 2),
(20002, '2023-12-30 00:00:00.000000', 'Professor', 'Harish Kenchennavar', 70000, 20002, 3);

-- --------------------------------------------------------

--
-- Table structure for table `faculty1`
--

CREATE TABLE `faculty1` (
  `id` bigint(20) NOT NULL,
  `designation` varchar(255) DEFAULT NULL,
  `dno` int(11) NOT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `salary` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `faculty1`
--

INSERT INTO `faculty1` (`id`, `designation`, `dno`, `fname`, `salary`) VALUES
(1, 'Professor', 4, 'Ashok', 450000),
(53, 'Asst. Professor', 2, 'Shaheen', 35000),
(102, 'Asst. Professor', 2, 'Shashi', 35000),
(152, 'Asst. Professor', 5, 'Sunil', 35000),
(202, 'Professor', 6, 'Sobha K', 73000);

-- --------------------------------------------------------

--
-- Table structure for table `faculty1_seq`
--

CREATE TABLE `faculty1_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `faculty1_seq`
--

INSERT INTO `faculty1_seq` (`next_val`) VALUES
(301);

-- --------------------------------------------------------

--
-- Table structure for table `faculty_seq`
--

CREATE TABLE `faculty_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `faculty_seq`
--

INSERT INTO `faculty_seq` (`next_val`) VALUES
(101);

-- --------------------------------------------------------

--
-- Table structure for table `seq`
--

CREATE TABLE `seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `seq`
--

INSERT INTO `seq` (`next_val`) VALUES
(10000);

-- --------------------------------------------------------

--
-- Table structure for table `seq1`
--

CREATE TABLE `seq1` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `seq1`
--

INSERT INTO `seq1` (`next_val`) VALUES
(20000);

-- --------------------------------------------------------

--
-- Table structure for table `seq2`
--

CREATE TABLE `seq2` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `seq2`
--

INSERT INTO `seq2` (`next_val`) VALUES
(3000);

-- --------------------------------------------------------

--
-- Table structure for table `seq4`
--

CREATE TABLE `seq4` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `seq4`
--

INSERT INTO `seq4` (`next_val`) VALUES
(100);

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `id` bigint(20) NOT NULL,
  `adm_year` varchar(255) DEFAULT NULL,
  `branch` varchar(255) DEFAULT NULL,
  `division` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sem` int(11) DEFAULT NULL,
  `usn` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`id`, `adm_year`, `branch`, `division`, `name`, `sem`, `usn`) VALUES
(1, NULL, 'CSE', 'A', 'Sunil', 3, '2BU19CS001'),
(2, NULL, 'CSE', 'C', 'Rajesh', 4, '2BU19CS002'),
(3, '2024', 'CSE', 'A', 'Shrinath', 2, '2KL21CS001'),
(4, '2023', 'CSE', 'A', 'Pavitra', 3, '2KL21CS002'),
(5, '2024', 'EC', 'D', 'Shridhar Karajgi', 1, '2KL22EC005'),
(6, '2025', 'CSE', 'D', 'Meghana Sunil Rodd', 3, '2KL24CS007');

-- --------------------------------------------------------

--
-- Table structure for table `students_seq`
--

CREATE TABLE `students_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `students_seq`
--

INSERT INTO `students_seq` (`next_val`) VALUES
(101);

-- --------------------------------------------------------

--
-- Table structure for table `student_seq`
--

CREATE TABLE `student_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student_seq`
--

INSERT INTO `student_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `sub_code` varchar(255) NOT NULL,
  `credits` int(11) DEFAULT NULL,
  `scheme_year` varchar(255) DEFAULT NULL,
  `sub_name` varchar(255) DEFAULT NULL,
  `sub_type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `email` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `email`) VALUES
(100, 'Ajay', 'ajayd@gmail.com'),
(101, 'Praveen', 'pravee12@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`did`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`eid`);

--
-- Indexes for table `facpubs`
--
ALTER TABLE `facpubs`
  ADD PRIMARY KEY (`pubid`);

--
-- Indexes for table `faculty`
--
ALTER TABLE `faculty`
  ADD PRIMARY KEY (`fid`);

--
-- Indexes for table `faculty1`
--
ALTER TABLE `faculty1`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `subject`
--
ALTER TABLE `subject`
  ADD PRIMARY KEY (`sub_code`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `eid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1007;

--
-- AUTO_INCREMENT for table `facpubs`
--
ALTER TABLE `facpubs`
  MODIFY `pubid` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
