/*
SQLyog Ultimate - MySQL GUI v8.2 
MySQL - 5.7.17-log : Database - blog
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`blog` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `blog`;

/*Table structure for table `articles` */

DROP TABLE IF EXISTS `articles`;

CREATE TABLE `articles` (
  `id` varchar(64) NOT NULL,
  `title` varchar(64) DEFAULT NULL,
  `summary` varchar(255) DEFAULT NULL,
  `content` text,
  `predate` datetime DEFAULT NULL,
  `vprepare` varchar(64) DEFAULT NULL,
  `modifydate` datetime DEFAULT NULL,
  `modifier` varchar(64) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `labels` varchar(255) DEFAULT NULL,
  `draftype` varchar(32) DEFAULT NULL,
  `url` varchar(64) DEFAULT NULL,
  `categories` varchar(255) DEFAULT NULL,
  `userid` varchar(64) DEFAULT NULL,
  `browsedid` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `articles` */

insert  into `articles`(`id`,`title`,`summary`,`content`,`predate`,`vprepare`,`modifydate`,`modifier`,`remark`,`labels`,`draftype`,`url`,`categories`,`userid`,`browsedid`) values ('0','1231','123','<p>123</p>',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('0b8a1317c3f419f8865861e9c3c88e2f','测试一下有图片的','图片测试','<p>有图片，后面<img src=\"http://localhost:8020/api/image\\articles\\2516675bdd7e409d9a0c33d849ff025c\"></p><p>哈哈哈，不知道行不行</p>',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('115456487174','第一篇测试标题','第一个测试摘要','第一篇文章内容测试\r\n因为树莓派还没到手，所以想要本机模拟先学习学习。\r\n折腾了两天，本地环境搭了三遍。目前用的最舒服的还是在Debian的基础上，用python3自己构建环境。','2019-08-17 00:00:00',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'a3ae20b4821bf5af243401dc31b8e46d','8918340918349'),('1154564ee287174','第er篇测试标题','第er个测试摘要','第er篇文章内容测试','2019-08-17 00:00:00',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('11545wq64ee287174','第san篇测试标题','第san个测试摘要','第sanhaidhaiu挥洒大会啊啊篇文章内容测试','2019-08-17 00:00:00',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('22fe6c9eea8fcf30a80461d5728df221','1','1','<p>1</p>',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('2baa4fc09c374d45c3ea8e1285cf8e87','qq','qqq','<p>qqq</p>',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('2ea8b3f89f446e8f7edb87184cd4b40a','1','1','<p>1</p>',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('51bf1c9464f30dabc04cd049bdf9b378','1','1','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('636f2696a04bf6fe84bb890efdc99db3','1231','123','<p>123</p>',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('683c19365eb30ae24b2377b8e967da90','1','1','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('73db6fd5f46faf69a21c03023eeec0e9','mybatis-plus插入返回主键','mybatis-plus插入返回主键','<p>mybatisplus在插入后，会将主键set进实体中，所以只要在service层调用getId()返回id就行了</p>',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('8e0e98cd2751b493c3f5bef864d66537','1','1','<p>1</p>',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('ad380ee149b118c392f439c3f82d519b','1','1','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('b5da744ebee65239c2855b8b49f80ee2','qq','qqq','<p>qqq</p>',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('c3ee6e3382a4aa76acaa8f0340445af3','1','1','<p>1</p>',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('ea151034d177358bbaa0c7af11b56b8e','1231','123','<p>123</p>',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('fcde65c3f80adb25a330d53817516779','1','1','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `browsed` */

DROP TABLE IF EXISTS `browsed`;

CREATE TABLE `browsed` (
  `id` varchar(64) NOT NULL,
  `predate` datetime DEFAULT NULL,
  `vprepare` varchar(64) DEFAULT NULL,
  `modifydate` datetime DEFAULT NULL,
  `modifier` varchar(64) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `userid` varchar(64) DEFAULT NULL,
  `articlesid` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `browsed` */

insert  into `browsed`(`id`,`predate`,`vprepare`,`modifydate`,`modifier`,`remark`,`userid`,`articlesid`) values ('8918340918349','2019-08-17 00:00:00','123','2019-08-17 00:00:00','adfs','sdfahjdiofh','a3ae20b4821bf5af243401dc31b8e46d','115456487174');

/*Table structure for table `categories` */

DROP TABLE IF EXISTS `categories`;

CREATE TABLE `categories` (
  `id` varchar(64) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `predate` datetime DEFAULT NULL,
  `vprepare` varchar(64) DEFAULT NULL,
  `modifydate` datetime DEFAULT NULL,
  `modifier` varchar(64) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `categories` */

/*Table structure for table `comments` */

DROP TABLE IF EXISTS `comments`;

CREATE TABLE `comments` (
  `id` varchar(64) NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  `cmtype` varchar(32) DEFAULT NULL,
  `predate` datetime DEFAULT NULL,
  `vprepare` varchar(64) DEFAULT NULL,
  `modifydate` datetime DEFAULT NULL,
  `modifier` varchar(64) DEFAULT NULL,
  `userid` varchar(64) DEFAULT NULL,
  `articlesid` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comments` */

insert  into `comments`(`id`,`content`,`cmtype`,`predate`,`vprepare`,`modifydate`,`modifier`,`userid`,`articlesid`) values ('999999999999','评论一下这个文章','1',NULL,NULL,NULL,NULL,'a3ae20b4821bf5af243401dc31b8e46d',NULL);

/*Table structure for table `labels` */

DROP TABLE IF EXISTS `labels`;

CREATE TABLE `labels` (
  `id` varchar(64) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `predate` datetime DEFAULT NULL,
  `vprepare` varchar(64) DEFAULT NULL,
  `modifydate` datetime DEFAULT NULL,
  `modifier` varchar(64) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `labels` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` varchar(64) DEFAULT NULL,
  `nickname` varchar(64) DEFAULT NULL,
  `username` varchar(32) DEFAULT NULL,
  `password` varchar(64) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `otel` varchar(32) DEFAULT NULL,
  `mobile` varchar(32) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `predate` datetime DEFAULT NULL,
  `vprepare` varchar(64) DEFAULT NULL,
  `modifydate` datetime DEFAULT NULL,
  `modifier` varchar(64) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`nickname`,`username`,`password`,`birthday`,`otel`,`mobile`,`email`,`address`,`remark`,`predate`,`vprepare`,`modifydate`,`modifier`) values ('a3ae20b4821bf5af243401dc31b8e46d','itaha','yj','itaha',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('559587dac3dcf4d61936b16c690ba23a','itaha123','yj','123',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('789764169879794979764967dsfdsfds','yinjun','殷俊','123',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
