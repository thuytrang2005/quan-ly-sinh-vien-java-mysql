-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 13, 2026 at 04:32 PM
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
-- Database: `qlsv`
--

-- --------------------------------------------------------

--
-- Table structure for table `sinhvien`
--

CREATE TABLE `sinhvien` (
  `masv` varchar(10) NOT NULL,
  `hoten` varchar(100) DEFAULT NULL,
  `ngaysinh` date DEFAULT NULL,
  `nganh` varchar(10) DEFAULT NULL,
  `diemtb` double DEFAULT NULL,
  `lop` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sinhvien`
--

INSERT INTO `sinhvien` (`masv`, `hoten`, `ngaysinh`, `nganh`, `diemtb`, `lop`) VALUES
('4551050216', 'Phạm Ngọc Quý', '2004-09-29', 'CNTT', 6.7, 'CNTT 45B'),
('4551050265', 'Trần Gia Hân', '2004-04-23', 'CNTT', 8.8, 'CNTT 45A'),
('4551050273', 'Nguyễn Bảo Ngân', '2004-05-03', 'CNTT', 4.9, 'CNTT 45B'),
('4551050283', 'Trần Thanh Hải', '2004-12-01', 'CNTT', 5.6, 'CNTT 45A'),
('4551050286', 'Phạm Văn Nghĩa', '2004-10-06', 'CNTT', 8.4, 'CNTT 45D'),
('4551050334', 'Hồ Mai Hoa', '2004-07-22', 'CNTT', 6.9, 'CNTT 45C'),
('4551090238', 'Nguyễn Văn Nguyên', '2004-02-10', 'KTPM', 6.5, 'KTPM 45'),
('4551090322', 'Nguyễn Thị Dung', '2004-03-30', 'KTPM', 7.4, 'KTPM 45');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD PRIMARY KEY (`masv`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
