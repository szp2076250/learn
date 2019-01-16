package com.xk.service;

import java.io.File;
import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;

import com.xk.mapper.CommentMapper;
import com.xk.mapper.SlideMapper;
import com.xk.model.Slide;
import com.xk.tool.ReturnObject;

public class SlideService {
	private SqlSessionTemplate sqlSession;
	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	public boolean AddSlide(Slide slide) {
		return 1==sqlSession.getMapper(SlideMapper.class).insert(slide);
	}
	public boolean DeleteSlide(ArrayList<Integer> slideIds) {
		for (Integer item : slideIds) {
			if(1!=sqlSession.getMapper(SlideMapper.class).deleteByPrimaryKey(item)) 
				return new ReturnObject("Delete Slide slideIds = "+item+"failed!", -2).toBoolean();
		}
		return true;
	}
}
