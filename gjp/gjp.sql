/*
 Navicat Premium Data Transfer

 Source Server         : javaData
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : gjp

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 26/09/2019 10:16:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for gjp_zhangwu
-- ----------------------------
DROP TABLE IF EXISTS `gjp_zhangwu`;
CREATE TABLE `gjp_zhangwu`  (
  `zwid` int(11) NOT NULL AUTO_INCREMENT,
  `flname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `money` double NULL DEFAULT NULL,
  `zhangHu` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `createtime` date NULL DEFAULT NULL,
  `description` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`zwid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gjp_zhangwu
-- ----------------------------
INSERT INTO `gjp_zhangwu` VALUES (2, '工资收入', 12345, '现金', '2016-03-15', '开工资了');
INSERT INTO `gjp_zhangwu` VALUES (3, '服装支出', 1998, '现金', '2016-04-02', '买衣服');
INSERT INTO `gjp_zhangwu` VALUES (6, '股票收入', 5000, '工商银行', '2016-10-28', '股票又大涨');
INSERT INTO `gjp_zhangwu` VALUES (7, '工资收入', 5000, '交通银行', '2016-10-28', '又开工资了');
INSERT INTO `gjp_zhangwu` VALUES (8, '礼金支出', 5000, '现金', '2016-10-28', '朋友结婚');
INSERT INTO `gjp_zhangwu` VALUES (9, '其他支出', 1560, '现金', '2016-10-29', '丢钱了');
INSERT INTO `gjp_zhangwu` VALUES (10, '交通支出', 2300, '交通银行', '2016-10-29', '油价还在涨啊');
INSERT INTO `gjp_zhangwu` VALUES (11, '吃饭支出', 1000, '工商银行', '2016-10-29', '又吃饭');
INSERT INTO `gjp_zhangwu` VALUES (12, '工资收入', 1000, '现金', '2016-10-30', '开资');
INSERT INTO `gjp_zhangwu` VALUES (13, '交通支出', 2000, '现金', '2016-10-30', '机票好贵');
INSERT INTO `gjp_zhangwu` VALUES (14, '工资收入', 5000, '现金', '2016-10-30', '又开资');
INSERT INTO `gjp_zhangwu` VALUES (16, '小保健', 10, '支付宝', '2018-11-30', '哈哈哈');
INSERT INTO `gjp_zhangwu` VALUES (25, '洗脚支出', 500, '微信支付', '2018-11-30', '贼舒服！');
INSERT INTO `gjp_zhangwu` VALUES (27, '泡妞支出', 11, '微信', '2018-11-30', '哈哈哈');
INSERT INTO `gjp_zhangwu` VALUES (28, '洗脚', 200, '支付宝', '2019-09-09', '爽歪歪');
INSERT INTO `gjp_zhangwu` VALUES (29, '吃饭支出', 100, '微信支付', '2019-09-09', '贼贵');

SET FOREIGN_KEY_CHECKS = 1;
