/*
Navicat MySQL Data Transfer

Source Server         : LOCALHOST(MYSQL)
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : db_two

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2020-07-08 14:44:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `apple`
-- ----------------------------
DROP TABLE IF EXISTS `apple`;
CREATE TABLE `apple` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(24) DEFAULT NULL,
  `prices` float DEFAULT NULL,
  `name` varchar(24) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of apple
-- ----------------------------
INSERT INTO `apple` VALUES ('1', '杂交', '23.5', '杂交苹果');
INSERT INTO `apple` VALUES ('2', '基因突变', '54.2', '太空苹果');

-- ----------------------------
-- Table structure for `person`
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(24) NOT NULL,
  `job` varchar(24) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', '张三', '老师');
INSERT INTO `person` VALUES ('2', '李四', '程序员');
INSERT INTO `person` VALUES ('3', '王五', '自由职业');
