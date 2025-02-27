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
-- Table structure for table `usertb`
-- 

CREATE TABLE `usertb` (
  `u_id` varchar(30) NOT NULL,
  `u_name` varchar(30) NOT NULL,
  `u_password` varchar(30) NOT NULL,
  `u_email` varchar(30) NOT NULL,
  `u_contact` varchar(30) NOT NULL,
  `u_address` varchar(30) NOT NULL,
  `u_gender` varchar(30) NOT NULL,
  `u_qualifications` varchar(30) NOT NULL,
  `u_nationality` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `usertb`
-- 

INSERT INTO `usertb` (`u_id`, `u_name`, `u_password`, `u_email`, `u_contact`, `u_address`, `u_gender`, `u_qualifications`, `u_nationality`) VALUES 
('ABMCA23', 'Neha Rajput', 'neha', 'neha@gmail.com', '8723563109', 'Aligarh', 'Female', 'Post Graduate', 'Indian'),
('ABMCA232', 'Shivani Rana', 'shivani', 'shivani@gmail.com', '8723563112', 'Uttrakhand', 'Female', 'Post Graduate', 'Indian'),
('ABMCA231', 'Shreya Gupta', 'shreya', 'shreya@gmail.com', '8723563101', 'Jaipur', 'Female', 'Post Graduate', 'Indian'),
('ABMCA233', 'Nisha Sharma', 'nisha@233', 'nisha@gmail.com', '5643897654', 'Agra', 'Female', 'P.G.', 'Indian');
