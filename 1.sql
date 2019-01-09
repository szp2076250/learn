
use blog_tables;

DROP TABLE IF EXISTS comment;
DROP TABLE IF EXISTS blog_kind;
DROP TABLE IF EXISTS blog_user;
DROP TABLE IF EXISTS blog;
DROP TABLE IF EXISTS slide;

CREATE TABLE blog_user(
  blog_user_id int(100) unsigned NOT NULL AUTO_INCREMENT,
  user_email_addr varchar(100) NOT NULL default '' '用户邮箱地址',
  user_nickname varchar(32) NOT NULL default '' COMMENT '用户昵称',
  user_head_img varchar(100) NOT NULL default '' COMMENT '用户头像URL',
  user_signature varchar(50)  NOT NULL default '' COMMENT '用户签名',
  user_account varchar(100)  NOT NULL default '' NOT NULL COMMENT '用户账户名',
  user_password varchar(256)  NOT NULL default '' COMMENT '用户密码',
  user_register_time varchar(50)  NOT NULL default '0' COMMENT '用户注册时间',
  user_is_online varchar(10) NOT NULL default 'NO' COMMENT '用户是否在线',
  user_is_admin varchar(20) NOT NULL default 'NO' COMMENT '用户是否是管理员',
  user_ip varchar(20)  NOT NULL default '' COMMENT '用户登陆IP地址',
  PRIMARY KEY(blog_user_id)
)ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4;

CREATE TABLE slide(
 slide_id int(100) unsigned NOT NULL AUTO_INCREMENT,
 slide_img_url varchar(256) NOT NULL default ''  COMMENT '横幅图片url',
 slide_desc varchar(256) NOT NULL default '' COMMENT '轮播描述',
 slide_reserve varchar(256) NOT NULL default '' COMMENT '保留字段',
 slide_update_time varchar(50) NOT NULL default '' COMMENT '横幅更新时间',
 PRIMARY KEY(slide_id)
)ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4;

CREATE TABLE blog(
  blog_id int(100) unsigned NOT NULL AUTO_INCREMENT,
  blog_imgs varchar(1024)  NOT NULL default '' COMMENT '博文图片地址',
  blog_title varchar(200) NOT NULL default '' COMMENT '博文标题',
  blog_content longtext NOT NULL  COMMENT '博文内容',
  blog_desc varchar(256) NOT NULL default '' COMMENT  '博文描述',
  blog_click_count int(10) NOT NULL default 0 COMMENT '博文浏览数量',
  blog_greate_count int(10) NOT NULL default 0 COMMENT '博文点赞数量',
  blog_time varchar(100) NOT NULL default '' COMMENT '博文发布时间',
  blog_kind varchar(32) NOT NULL default '' COMMENT '博文类别:用户发布/系统发布',
  blog_is_lock varchar(10) NOT NULL default 'none' COMMENT '博文是否过审',
  blog_kind_small varchar(10) NOT NULL default '杂谈' COMMENT '博文子类型',
  blog_kind_big VARCHAR(10) NOT NULL COMMENT '博文类型',
  blog_kind_label VARCHAR(100) NOT NULL COMMENT '博文标签',
  PRIMARY KEY(blog_id)
)ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4;

CREATE TABLE comment(
  comment_id int(200) unsigned NOT NULL AUTO_INCREMENT COMMENT '评论ID',
  blog_user_id int(100)  unsigned NOT NULL COMMENT '评论者ID',
  blog_id int(100) unsigned NOT NULL COMMENT '博文ID',
  comment_content varchar(1024) NOT NULL default '' COMMENT '评论内容',
  comment_time varchar(100) NOT NULL default '' COMMENT '评论时间',
  comment_parent_id int(100) unsigned COMMENT '父评论id(这一层级)',
  PRIMARY KEY(comment_id),
  UNIQUE(blog_user_id)
)ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4;

-- CREATE TABLE blog_kind(
--  kind_id int(100) unsigned NOT NULL AUTO_INCREMENT,
--  blog_id int(100) unsigned UNIQUE NOT NULL COMMENT '博文ID',
--  kind_sub_name varchar(10)  NOT NULL default 0 COMMENT '子类型名',
--  kind_main_name varchar(10)  NOT NULL default 0 COMMENT '类型名'
--  PRIMARY KEY(kind_id)
-- )ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4;
