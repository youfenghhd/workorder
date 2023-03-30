/*
Navicat MariaDB Data Transfer

Source Server         : hhd
Source Server Version : 100605
Source Host           : 47.120.5.13:3306
Source Database       : workorder

Target Server Type    : MariaDB
Target Server Version : 100605
File Encoding         : 65001

Date: 2023-03-30 14:19:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for work_order
-- ----------------------------
DROP TABLE IF EXISTS `work_order`;
CREATE TABLE `work_order` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `customer` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `maintainer` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
