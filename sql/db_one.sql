/*
Navicat MySQL Data Transfer

Source Server         : LOCALHOST(MYSQL)
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : db_one

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2020-07-08 14:44:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(24) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'Green', '18', 'WH');
INSERT INTO `user` VALUES ('2', 'Miss', '22', 'SH');
INSERT INTO `user` VALUES ('3', 'Kiss', '19', 'BJ');
