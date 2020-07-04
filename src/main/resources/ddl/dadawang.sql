/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : dadawang

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 04/07/2020 18:52:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bag
-- ----------------------------
DROP TABLE IF EXISTS `bag`;
CREATE TABLE `bag` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '名字',
  `price` decimal(20,4) NOT NULL DEFAULT '0.0000' COMMENT '价格',
  `del_flag` tinyint(4) NOT NULL DEFAULT '2' COMMENT '删除标识 1:删除 2:未删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of bag
-- ----------------------------
BEGIN;
INSERT INTO `bag` VALUES (1, 'ck', 400.0000, 2);
INSERT INTO `bag` VALUES (2, 'gucci', 20000.0000, 2);
INSERT INTO `bag` VALUES (3, 'lv', 15000.0000, 2);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
