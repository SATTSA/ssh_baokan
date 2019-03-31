/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : mysql

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-06-28 11:47:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `kehu`
-- ----------------------------
DROP TABLE IF EXISTS `kehu`;
CREATE TABLE `kehu` (
  `kid` int(20) NOT NULL AUTO_INCREMENT,
  `kname` varchar(20) DEFAULT NULL,
  `ksex` varchar(2) DEFAULT NULL,
  `kconnect` int(20) DEFAULT NULL,
  `kbook` date DEFAULT NULL,
  PRIMARY KEY (`kid`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kehu
-- ----------------------------
INSERT INTO `kehu` VALUES ('2', '李四', '女', '101', '2010-03-06');
INSERT INTO `kehu` VALUES ('3', '王五', '男', '102', '2012-02-05');
INSERT INTO `kehu` VALUES ('4', '赵六', '女', '103', '2011-06-04');
INSERT INTO `kehu` VALUES ('5', '陈七', '男', '104', '2009-06-03');
INSERT INTO `kehu` VALUES ('11', '张三', '男', null, null);
