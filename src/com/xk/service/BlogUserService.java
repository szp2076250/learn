package com.xk.service;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.opensymphony.xwork2.ActionContext;
import com.xk.mapper.BlogMapper;
import com.xk.mapper.BlogUserMapper;
import com.xk.mapper.CommentMapper;
import com.xk.model.BlogExample;
import com.xk.model.BlogUser;
import com.xk.model.BlogUserExample;
import com.xk.model.CommentExample;
import com.xk.tool.BlogConst;
import com.xk.tool.ReturnObject;
import com.xk.model.BlogExample.Criteria;

public class BlogUserService {
	private SqlSessionTemplate sqlSession;
	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	//modify
	public boolean UpdateUser(BlogUser blogUser) {
		BlogUserExample example = new BlogUserExample();
		example.createCriteria().andUserAccountEqualTo(blogUser.getUserAccount());
		return 1 == sqlSession.getMapper(BlogUserMapper.class)
				.updateByExampleSelective(blogUser, example);
	}
	//add
	public boolean AddUser(BlogUser blogUser) {
		BlogUserExample example = new BlogUserExample();
		example.createCriteria().andUserAccountEqualTo(blogUser.getUserAccount());
		if(blogUser.getUserAccount()==null) 
			return new ReturnObject("empty account", -3).toBoolean(); 
		if(1 == sqlSession.getMapper(BlogUserMapper.class).selectByExample(example).size())
				return new ReturnObject("repeat account", -3).toBoolean();
		return 1 == sqlSession.getMapper(BlogUserMapper.class).insert(blogUser);
	}
	//is admin
	public boolean IsAdmin(String strAccount) {
		BlogUserExample example = new BlogUserExample();
		example.createCriteria().andUserAccountEqualTo(strAccount)
								.andUserIsAdminEqualTo(BlogConst.BLOG_USER_ADMIN);
		return 1 == sqlSession.getMapper(BlogUserMapper.class).selectByExample(example).size();
	}
	//get user info by account
	public BlogUser getUserByAccount(String strAccount) {
		BlogUserExample example = new BlogUserExample();
		example.createCriteria().andUserAccountEqualTo(strAccount);
		List<BlogUser> bu = new ArrayList<>();
		if(1!=(bu=sqlSession.getMapper(BlogUserMapper.class).selectByExample(example)).size())
			return null;
		return bu.get(0);
	}
	//delete user
	public boolean DeleteUser(int iUserId) {
		//
		CommentExample commentExample = new CommentExample();
		com.xk.model.CommentExample.Criteria condition = commentExample.createCriteria();
		condition.andBlogUserIdEqualTo(iUserId);
		sqlSession.getMapper(CommentMapper.class).deleteByExample(commentExample);
		return 1==sqlSession.getMapper(BlogUserMapper.class).deleteByPrimaryKey(iUserId);
	}
	//login
	public boolean Login(String strUsername,String strPassword) {
		BlogUserExample userExample = new BlogUserExample();
		BlogUserExample.Criteria condition = userExample.createCriteria();
		condition.andUserAccountEqualTo(strUsername)
				 .andUserPasswordEqualTo(strPassword);
		return 1==sqlSession.getMapper(BlogUserMapper.class).countByExample(userExample);
	}
}
