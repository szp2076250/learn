package com.xk.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.xk.mapper.BlogMapper;
import com.xk.model.Blog;
import com.xk.model.BlogExample;
import com.xk.model.BlogExample.Criteria;
import com.xk.tool.BlogConst;
import com.xk.tool.CommonUnit;

public class BlogService {
	private SqlSessionTemplate sqlSession;
	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	public int InsertBlog(Blog blog) {
		return sqlSession.getMapper(BlogMapper.class).insert(blog);
	}
	public int UpdateBlog(Blog blog) {
		blog.setBlogTime(CommonUnit.getCurrentTime());
//		return sqlSession.getMapper(BlogMapper.class).updateByPrimaryKey(blog);
		return sqlSession.getMapper(BlogMapper.class).updateByPrimaryKeySelective(blog); 
	}
	public int DeleteBlog(int blogId) {
		return sqlSession.getMapper(BlogMapper.class).deleteByPrimaryKey(blogId);
	}
	public List<Blog> FindBlogByTitle(String strTitle) {
		BlogExample blogExample = new BlogExample();
		Criteria criteria = blogExample.createCriteria();
		criteria.andBlogTitleLike('%'+strTitle+'%');
		return sqlSession.getMapper(BlogMapper.class).selectByExample(blogExample);
	}
	public long GetTotalBlogCount() {
		return sqlSession.getMapper(BlogMapper.class).countByExample(new BlogExample());
	}
	public List<Blog> GetSomeBlogs(int iNeedNum,int iNeedPage){
		if(iNeedPage<1) iNeedPage=1; if(iNeedNum<0) iNeedNum=BlogConst.BLOG_DEFAULT_SHOW_NUMBER;
		int iStartPos = iNeedNum*(iNeedPage-1);
		BlogExample blogExample = new BlogExample();
		Criteria criteria = blogExample.createCriteria();
		blogExample.setOrderByClause("blog_time DESC");
		return sqlSession.getMapper(BlogMapper.class).selectByExampleEx(
				blogExample, iStartPos, iNeedNum);
	}
	public Blog GetInfoById(int id) {
		return sqlSession.getMapper(BlogMapper.class).selectByPrimaryKey(id);
	}
}
