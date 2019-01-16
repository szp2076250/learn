package com.xk.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xk.service.BlogService;

public class CommonUnit {
	public static String getCurrentTime() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
	
	//get ctx
	private static ClassPathXmlApplicationContext mCtx = null;
	public static ClassPathXmlApplicationContext
		getCtx()
	{
		if(null==mCtx) {
			try{
				SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(
						Resources.getResourceAsStream("sqlMapConfig.xml"));
				mCtx = new ClassPathXmlApplicationContext("springConfig.xml"); 
			}
			catch(Exception e) {
				e.printStackTrace(); return null;
			}
		}
		return mCtx;
	}
	
}
