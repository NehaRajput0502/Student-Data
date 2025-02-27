-- phpMyAdmin SQL Dump
-- version 2.9.2
-- http://www.phpmyadmin.net
-- 
-- Host: localhost
-- Generation Time: Oct 23, 2023 at 10:34 AM
-- Server version: 5.0.27
-- PHP Version: 5.2.1
-- 
-- Database: `nehaproject`
-- 

-- --------------------------------------------------------

-- 
-- Table structure for table `feedbacktb`
-- 

CREATE TABLE `feedbacktb` (
  `f_id` varchar(30) NOT NULL,
  `u_id` varchar(30) NOT NULL,
  `f_message` varchar(50) NOT NULL,
  `f_datetime` varchar(30) NOT NULL,
  `f_flagbit` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `feedbacktb`
-- 

INSERT INTO `feedbacktb` (`f_id`, `u_id`, `f_message`, `f_datetime`, `f_flagbit`) VALUES 
('23', 'ABMCA23', 'WONDERFUL', '23/10/23 & 3:45PM', '0'),
('24', 'ABMCA23', 'Hey my self neha', '23/10/23 & 4:00PM', '0');
