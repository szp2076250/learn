package com.xk.junit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.jdbc.log.Log;
import com.xk.mapper.BlogMapper;
import com.xk.model.Blog;
import com.xk.model.BlogUser;
import com.xk.service.BlogService;
import com.xk.service.BlogUserService;
import com.xk.tool.BlogConst;
import com.xk.tool.CommonUnit;

public class MybatisTest {
//	private SqlSessionTemplate sqlSession;
	@Test
	public void test() throws IOException {
		Logger logger = Logger.getLogger(MybatisTest.class);
		
		try { 
			BlogService blogService = 
					(BlogService) CommonUnit.getCtx().getBean("blogmapper");
//			BlogService blogService = (BlogService) ctx.getBean("blogmapper");
////			blogService.InsertBlog(new Blog("ÐÂÎÅ2","ÄÚÈÝ2","ÃèÊö2"));
			for (Blog blog : blogService.GetSomeBlogs(3, 1)) {
				logger.debug(blog);
			}
			//user
			BlogUserService userService = (BlogUserService)CommonUnit.getCtx().getBean(BlogConst.BEAN_USER);
			userService.AddUser(new BlogUser("admin","123"));
			logger.info("Total Blog Count:"+blogService.GetTotalBlogCount());
			logger.debug("this is a debug message");
		}catch (Exception e) {
			// TODO: handle exceptiont
			e.printStackTrace();
		}
		
		
		
	}
}
