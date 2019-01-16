package com.xk.service;

import org.mybatis.spring.SqlSessionTemplate;

import com.xk.mapper.BlogUserMapper;
import com.xk.mapper.CommentMapper;
import com.xk.model.Comment;

public class CommentService {
	private SqlSessionTemplate sqlSession;
	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	public boolean AddComment(Comment comment) {
		return 1==sqlSession.getMapper(CommentMapper.class).insert(comment);
	}
}
