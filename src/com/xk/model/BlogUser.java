package com.xk.model;

import com.xk.tool.BlogConst;
import com.xk.tool.CommonUnit;

public class BlogUser {

    private Integer blogUserId;

    private String userEmailAddr;

    private String userNickname;

    private String userHeadImg;
    
	private String userSignature;

    private String userAccount;

    private String userPassword;

    private String userRegisterTime;

    private String userIsOnline;

    private String userIsAdmin;

    private String userIp;
    
    public void Init() {
    	userEmailAddr = "";
    	userNickname ="";
    	userHeadImg = BlogConst.BLOG_USER_DEFAULT_HEAD_IMAGE_URL;
    	userSignature = BlogConst.BLOG_USER_DEFAULT_HEAD_SIGNURE;
    	userRegisterTime = CommonUnit.getCurrentTime();
    	userIsOnline = "";
    	userIsAdmin = BlogConst.BLOG_USER_NOT_ADMIN;
    	userIp = "";
    }
    
    public BlogUser() {}
    
    public BlogUser(String userAccount, String userPassword) {
    	Init();
		this.userAccount = userAccount;
		this.userPassword = userPassword;
	}

    public Integer getBlogUserId() {
        return blogUserId;
    }

    public void setBlogUserId(Integer blogUserId) {
        this.blogUserId = blogUserId;
    }

    public String getUserEmailAddr() {
        return userEmailAddr;
    }

    public void setUserEmailAddr(String userEmailAddr) {
        this.userEmailAddr = userEmailAddr == null ? null : userEmailAddr.trim();
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public String getUserHeadImg() {
        return userHeadImg;
    }

    public void setUserHeadImg(String userHeadImg) {
        this.userHeadImg = userHeadImg == null ? null : userHeadImg.trim();
    }

    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature == null ? null : userSignature.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserRegisterTime() {
        return userRegisterTime;
    }

    public void setUserRegisterTime(String userRegisterTime) {
        this.userRegisterTime = userRegisterTime == null ? null : userRegisterTime.trim();
    }

    public String getUserIsOnline() {
        return userIsOnline;
    }

    public void setUserIsOnline(String userIsOnline) {
        this.userIsOnline = userIsOnline == null ? null : userIsOnline.trim();
    }

    public String getUserIsAdmin() {
        return userIsAdmin;
    }

    public void setUserIsAdmin(String userIsAdmin) {
        this.userIsAdmin = userIsAdmin == null ? null : userIsAdmin.trim();
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }
}