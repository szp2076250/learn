package com.xk.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xk.model.BlogUser;
import com.xk.service.BlogUserService;
import com.xk.tool.BlogConst;
import com.xk.tool.CommonUnit;

public class ModifyAction extends ActionSupport{
	private String strPassword;
	private String strPasswordRepeat;
	private String strUsername;
	private String strEmail;
	private String strSignure;
	public String getStrSignure() {
		return strSignure;
	}
	public void setStrSignure(String strSignure) {
		this.strSignure = strSignure;
	}
	public String getStrPassword() {
		return strPassword;
	}
	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}
	public String getStrPasswordRepeat() {
		return strPasswordRepeat;
	}
	public void setStrPasswordRepeat(String strPasswordRepeat) {
		this.strPasswordRepeat = strPasswordRepeat;
	}
	public String getStrUsername() {
		return strUsername;
	}
	public void setStrUsername(String strUsername) {
		this.strUsername = strUsername;
	}
	public String getStrEmail() {
		return strEmail;
	}
	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}
	public String home() {
		BlogUserService bs = (BlogUserService) CommonUnit.getCtx().getBean(BlogConst.BEAN_USER);
		BlogUser bu = bs.getUserByAccount(ActionContext.getContext().getSession().get(
				BlogConst.BLOG_LOGIN_USER_SESSOIN_NAME
				).toString());
		ActionContext.getContext().put("signure", bu.getUserSignature());
		return "MAIN";
	}
	public String modify() {
		BlogUserService bs = (BlogUserService) CommonUnit.getCtx().getBean(BlogConst.BEAN_USER);
		if(!strPasswordRepeat.equals(strPassword)) return ERROR;
		BlogUser updateUser = new BlogUser(ActionContext.getContext().getSession().get(
				BlogConst.BLOG_LOGIN_USER_SESSOIN_NAME
				).toString(),strPassword);
		updateUser.setUserEmailAddr(strEmail);
		updateUser.setUserSignature(strSignure);
		ActionContext.getContext().put("CurrentUser",updateUser);
		return bs.UpdateUser(updateUser)?SUCCESS:ERROR;
	}
}
