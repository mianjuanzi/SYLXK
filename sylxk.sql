-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 2017-12-27 07:40:28
-- 服务器版本： 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sylxk`
--

-- --------------------------------------------------------

--
-- 表的结构 `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id` varchar(20) CHARACTER SET utf8 NOT NULL,
  `pwd` varchar(20) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- 转存表中的数据 `admin`
--

INSERT INTO `admin` (`id`, `pwd`) VALUES
('123', '123'),
('123456', '123456');

-- --------------------------------------------------------

--
-- 表的结构 `course`
--

CREATE TABLE IF NOT EXISTS `course` (
  `cid` varchar(20) CHARACTER SET utf8 NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 NOT NULL,
  `tid` varchar(20) CHARACTER SET utf8 NOT NULL,
  `time` varchar(20) CHARACTER SET utf8 NOT NULL,
  `content` varchar(20) CHARACTER SET utf8 NOT NULL,
  `req` varchar(20) CHARACTER SET utf8 NOT NULL,
  `test` varchar(20) CHARACTER SET utf8 NOT NULL,
  `tag` varchar(20) CHARACTER SET utf8 NOT NULL DEFAULT '未通过',
  PRIMARY KEY (`cid`),
  KEY `tid` (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- 转存表中的数据 `course`
--

INSERT INTO `course` (`cid`, `name`, `tid`, `time`, `content`, `req`, `test`, `tag`) VALUES
('1371948', 'null', '123', 'qewqrweq', 'ewqreq', 'eqwewqr', 'eqwwqeq', '未通过'),
('1587033', 'null', '123', 'qewq', 'ewq', 'eqw', 'eqw', '未通过'),
('1589151', 'null', '123', 'ewq', 'das', 'ads', 'das', '未通过'),
('1611809', '12343', '123', '432ewq', 'eqwd', 'eqw', 'fs', '未通过'),
('1665376', 'edwrf', '123', 'fsdg', 'fgds', 'gfd', 'ffsdf', '未通过'),
('1790052', 'rew', '123', 'rfsd', 's', 'd', 'a', '未通过'),
('321', '数学', '21321', '31课时', '呵呵呵', '吖吖', '哼哼哼', '已通过'),
('321432', '321', '312', 'dadsa', 'asd', 'dsa', 'da', '未通过'),
('das', 'sad', '21321', 'dsad', 'sada', 'dasd', 'das', '已通过'),
('vfdsf', 'fvds', 'gsfd', 'gfsd', 'sfgd', 'fg', 'asdg', '已通过');

-- --------------------------------------------------------

--
-- 表的结构 `sel`
--

CREATE TABLE IF NOT EXISTS `sel` (
  `cid` varchar(20) CHARACTER SET utf8 NOT NULL,
  `sid` varchar(20) CHARACTER SET utf8 NOT NULL,
  KEY `cid` (`cid`),
  KEY `sid` (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- 转存表中的数据 `sel`
--

INSERT INTO `sel` (`cid`, `sid`) VALUES
('das', '123'),
('das', '21');

-- --------------------------------------------------------

--
-- 表的结构 `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `sid` varchar(20) COLLATE utf8_bin NOT NULL,
  `pwd` varchar(20) COLLATE utf8_bin NOT NULL,
  `name` varchar(20) COLLATE utf8_bin NOT NULL,
  `sex` varchar(20) COLLATE utf8_bin NOT NULL,
  `major` varchar(20) COLLATE utf8_bin NOT NULL,
  `stuclass` varchar(20) COLLATE utf8_bin NOT NULL,
  `mail` varchar(20) COLLATE utf8_bin NOT NULL,
  `qq` varchar(20) COLLATE utf8_bin NOT NULL,
  `tel` varchar(20) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- 转存表中的数据 `student`
--

INSERT INTO `student` (`sid`, `pwd`, `name`, `sex`, `major`, `stuclass`, `mail`, `qq`, `tel`) VALUES
('123', '123', '呵呵哒', '女', '数字媒体', '11501', '啥都', '到佛山', '非单身'),
('123123', '123', '单一琳', '女', '数字媒体', '11501', 'qq@qq.com', '94369917', '12345689'),
('12312321321', '12321', '单一琳', '女', '数字媒体', '11501', 'qq@qq.com', '94369917', '12345689'),
('21', '21', '21', '12', '21', '2', '12', '11', '2');

-- --------------------------------------------------------

--
-- 表的结构 `teacher`
--

CREATE TABLE IF NOT EXISTS `teacher` (
  `tid` varchar(20) CHARACTER SET utf8 NOT NULL,
  `pwd` varchar(20) COLLATE utf8_bin NOT NULL,
  `name` varchar(20) COLLATE utf8_bin NOT NULL,
  `age` varchar(20) COLLATE utf8_bin NOT NULL,
  `sex` varchar(20) COLLATE utf8_bin NOT NULL,
  `major` varchar(20) COLLATE utf8_bin NOT NULL,
  `level` varchar(20) COLLATE utf8_bin NOT NULL,
  `mail` varchar(20) COLLATE utf8_bin NOT NULL,
  `qq` varchar(20) COLLATE utf8_bin NOT NULL,
  `tel` varchar(20) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- 转存表中的数据 `teacher`
--

INSERT INTO `teacher` (`tid`, `pwd`, `name`, `age`, `sex`, `major`, `level`, `mail`, `qq`, `tel`) VALUES
('123', '123', 'qwe', 'dsa', 'fad', 'asd', 'fasd', 'eqw', 'eqw', 'eqw'),
('21321', '321321', '呵呵哒', '32', '男', '计算机', '叫兽', 'qq@qq.com', '94369917', '12345689');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
