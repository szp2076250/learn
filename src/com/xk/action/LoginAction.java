package com.xk.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xk.model.Blog;
import com.xk.model.BlogUser;
import com.xk.service.BlogService;
import com.xk.service.BlogUserService;
import com.xk.tool.BlogConst;
import com.xk.tool.CommonUnit;

import java.util.List;

import org.junit.internal.runners.statements.Fail;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String strPassword;
	private String strUsername;
	private String strEmail;
	
	private boolean bIsAdmin = false;
		
	public String getStrEmail() {
		return strEmail;
	}

	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}

	public String getStrPassword() {
		return strPassword;
	}

	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}

	public String getStrUsername() {
		return strUsername;
	}

	public void setStrUsername(String strUsername) {
		this.strUsername = strUsername;
	}

	public LoginAction() {}
	public LoginAction(String strPassword, String strUsername) {
		this.strPassword = strPassword;
		this.strUsername = strUsername;
	}
	public String regist() {
		BlogUser user = new BlogUser(strUsername,strPassword);
		user.setUserEmailAddr(strEmail);
		if(!((BlogUserService) CommonUnit.getCtx().getBean(BlogConst.BEAN_USER)).AddUser(user))
			return ERROR;
//		ActionContext.getContext().getSession().put(BlogConst.BLOG_LOGIN_USER_SESSOIN_NAME, strUsername);
		return SUCCESS;
	}
	public String login() {
		BlogUserService bs = (BlogUserService) CommonUnit.getCtx().getBean(BlogConst.BEAN_USER);
		if(!bs.Login(strUsername, strPassword)) 
			return ERROR;
		boolean bIsAdmin = bs.IsAdmin(strUsername);
		BlogUser bu = bs.getUserByAccount(strUsername);
		ActionContext.getContext().getSession().put(BlogConst.BLOG_LOGIN_USER_SESSOIN_NAME, strUsername);
		ActionContext.getContext().getSession().put(BlogConst.BLOG_LOGIN_USER_IS_ADMIN_NAME, bIsAdmin);
		ActionContext.getContext().put("isadmin", bIsAdmin);
		ActionContext.getContext().put("signure", bu.getUserSignature());
		return SUCCESS;
	}
	public String logout() {
		ActionContext.getContext().getSession().clear();
		return SUCCESS;
	}
	//go to back.jsp
	public String goback() {
		BlogUserService bs = (BlogUserService) CommonUnit.getCtx().getBean(BlogConst.BEAN_USER);
		String strAccount=null;
		if(null==(strAccount=ActionContext.getContext().getSession().get(BlogConst.BLOG_LOGIN_USER_SESSOIN_NAME).toString()))
			return SUCCESS;
		
		//get blog
		BlogService blogService = (BlogService)CommonUnit.getCtx().getBean(BlogConst.BEAN_BLOG);
		List<Blog> blogList = blogService.GetSomeBlogs(10, 1);
		long iBlogCount=blogService.GetTotalBlogCount();
		ActionContext.getContext().put(BlogConst.BLOG_FIRST_PAGE,blogList);
		ActionContext.getContext().put(BlogConst.BLOG_TOTAL_COUNT,iBlogCount);
		ActionContext.getContext().put("CurrentUser", 
				bs.getUserByAccount(strAccount));
		return "GOBACK";
	}
	@Override
	public String execute() throws Exception {
		if(!((BlogUserService) CommonUnit.getCtx().getBean(BlogConst.BEAN_USER)).Login(strUsername, strPassword)) 
			return ERROR;
		ActionContext.getContext().getSession().put(BlogConst.BLOG_LOGIN_USER_SESSOIN_NAME, strUsername);
		return SUCCESS;
	}
	
	
}
