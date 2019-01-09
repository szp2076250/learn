DROP TABLE IF EXISTS xk_comment;
DROP TABLE IF EXISTS xk_news_kind;
DROP TABLE IF EXISTS xk_user;
DROP TABLE IF EXISTS xk_news;
DROP TABLE IF EXISTS xk_slide;

CREATE TABLE xk_user(
  user_id int(100) unsigned NOT NULL AUTO_INCREMENT,
  user_email_addr varchar(100) NOT NULL COMMENT '用户邮箱地址',
  user_nickname varchar(32) NOT NULL default '' COMMENT '用户昵称',
  user_sex varchar(5) NOT NULL default '' COMMENT '用户性别',
  user_head_img varchar(100) NOT NULL default '' COMMENT '用户头像URL',
  user_signature varchar(50)  NOT NULL default '' COMMENT '用户签名',
  user_account varchar(100)  NOT NULL default '' NOT NULL COMMENT '用户账户名称',
  user_phone varchar(15)  NOT NULL default '' COMMENT '用户手机号',
  user_password varchar(15)  NOT NULL default '' COMMENT '用户密码',
  user_vip_level varchar(5) NOT NULL default '0' COMMENT '用户VIP级别',
  user_register_time varchar(50)  NOT NULL default '0' COMMENT '用户注册时间',
  user_is_lock varchar(10)  NOT NULL default 'NO' COMMENT '用户是否封停',
  user_ip varchar(20)  NOT NULL default '' COMMENT '用户登陆IP地址',
  PRIMARY KEY(user_id)
)ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

CREATE TABLE xk_slide(
 slide_id int(100) unsigned NOT NULL AUTO_INCREMENT,
 slide_img_url varchar(256) NOT NULL default ''  COMMENT '轮播图url',
 slide_video_url varchar(256) NOT NULL default '' COMMENT '轮播视频url',
 slide_desc varchar(256) NOT NULL default '' COMMENT '轮播描述',
 slide_reserve varchar(256) NOT NULL default '' COMMENT '保留字段',
 PRIMARY KEY(slide_id)
)ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

CREATE TABLE xk_news(
  news_id int(100) unsigned NOT NULL AUTO_INCREMENT,
  news_imgs varchar(1024)  NOT NULL default '' COMMENT '新闻图片地址列表',
  news_video varchar(200)  NOT NULL default '' COMMENT '新闻视频URL',
  news_content longtext NOT NULL default '' COMMENT '新闻内容',
  news_desc varchar(256) NOT NULL default '' COMMENT  '新闻描述',
  news_click_count int(10) NOT NULL default 0 COMMENT '新闻浏览数量(热度)',
  news_time varchar(100) NOT NULL default '' COMMENT '新闻发布时间',
  news_kind varchar(10) NOT NULL default '' COMMENT '新闻类别:用户发布/系统发布',
  PRIMARY KEY(news_id)
)ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

CREATE TABLE xk_news_kind(
 kind_id int(100) unsigned NOT NULL AUTO_INCREMENT,
 news_id int(100) unsigned NOT NULL COMMENT '新闻ID',
 kind_name int(10) unsigned NOT NULL default 0 COMMENT '类型名',
 PRIMARY KEY(kind_id),
 FOREIGN KEY(news_id) REFERENCES xk_news(news_id)
)ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

CREATE TABLE xk_comment(
  comment_id int(200) unsigned NOT NULL AUTO_INCREMENT,
  user_id int(100) unsigned NOT NULL COMMENT '用户ID',
  news_id int(100) unsigned NOT NULL COMMENT '新闻ID',
  comment_content varchar(256) NOT NULL default '' COMMENT '评论内容',
  comment_time varchar(100) NOT NULL default '' COMMENT '评论时间',
  PRIMARY KEY(comment_id),
  FOREIGN KEY(user_id) REFERENCES xk_user(user_id),
  FOREIGN KEY(news_id) REFERENCES xk_news(news_id)
)ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;





















