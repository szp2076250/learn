
use blog_tables;

DROP TABLE IF EXISTS comment;
DROP TABLE IF EXISTS blog_kind;
DROP TABLE IF EXISTS blog_user;
DROP TABLE IF EXISTS blog;
DROP TABLE IF EXISTS slide;

CREATE TABLE blog_user(
  blog_user_id int(100) unsigned NOT NULL AUTO_INCREMENT,
  user_email_addr varchar(100) NOT NULL default '' '�û������ַ',
  user_nickname varchar(32) NOT NULL default '' COMMENT '�û��ǳ�',
  user_head_img varchar(100) NOT NULL default '' COMMENT '�û�ͷ��URL',
  user_signature varchar(50)  NOT NULL default '' COMMENT '�û�ǩ��',
  user_account varchar(100)  NOT NULL default '' NOT NULL COMMENT '�û��˻���',
  user_password varchar(256)  NOT NULL default '' COMMENT '�û�����',
  user_register_time varchar(50)  NOT NULL default '0' COMMENT '�û�ע��ʱ��',
  user_is_online varchar(10) NOT NULL default 'NO' COMMENT '�û��Ƿ�����',
  user_is_admin varchar(20) NOT NULL default 'NO' COMMENT '�û��Ƿ��ǹ���Ա',
  user_ip varchar(20)  NOT NULL default '' COMMENT '�û���½IP��ַ',
  PRIMARY KEY(blog_user_id)
)ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4;

CREATE TABLE slide(
 slide_id int(100) unsigned NOT NULL AUTO_INCREMENT,
 slide_img_url varchar(256) NOT NULL default ''  COMMENT '���ͼƬurl',
 slide_desc varchar(256) NOT NULL default '' COMMENT '�ֲ�����',
 slide_reserve varchar(256) NOT NULL default '' COMMENT '�����ֶ�',
 slide_update_time varchar(50) NOT NULL default '' COMMENT '�������ʱ��',
 PRIMARY KEY(slide_id)
)ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4;

CREATE TABLE blog(
  blog_id int(100) unsigned NOT NULL AUTO_INCREMENT,
  blog_imgs varchar(1024)  NOT NULL default '' COMMENT '����ͼƬ��ַ',
  blog_title varchar(200) NOT NULL default '' COMMENT '���ı���',
  blog_content longtext NOT NULL  COMMENT '��������',
  blog_desc varchar(256) NOT NULL default '' COMMENT  '��������',
  blog_click_count int(10) NOT NULL default 0 COMMENT '�����������',
  blog_greate_count int(10) NOT NULL default 0 COMMENT '���ĵ�������',
  blog_time varchar(100) NOT NULL default '' COMMENT '���ķ���ʱ��',
  blog_kind_small varchar(10) NOT NULL default 'δ����' COMMENT '����������',
  blog_kind_big VARCHAR(10) NOT NULL COMMENT '��������',
  blog_kind_label VARCHAR(100) NOT NULL COMMENT '���ı�ǩ',
  PRIMARY KEY(blog_id)
)ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4;

CREATE TABLE comment(
  comment_id int(200) unsigned NOT NULL AUTO_INCREMENT COMMENT '����ID',
  blog_user_id int(100)  unsigned NOT NULL COMMENT '������ID',
  blog_id int(100) unsigned NOT NULL COMMENT '����ID',
  comment_content varchar(1024) NOT NULL default '' COMMENT '��������',
  comment_time varchar(100) NOT NULL default '' COMMENT '����ʱ��',
  comment_parent_id int(100) unsigned COMMENT '������id(��һ�㼶)',
  PRIMARY KEY(comment_id),
  foreign key(blog_id) references blog(blog_id),
  foreign key(blog_user_id) references blog_user(blog_user_id)
)ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4;

-- CREATE TABLE blog_kind(
--  kind_id int(100) unsigned NOT NULL AUTO_INCREMENT,
--  blog_id int(100) unsigned UNIQUE NOT NULL COMMENT '����ID',
--  kind_sub_name varchar(10)  NOT NULL default 0 COMMENT '��������',
--  kind_main_name varchar(10)  NOT NULL default 0 COMMENT '������'
--  PRIMARY KEY(kind_id)
-- )ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4;