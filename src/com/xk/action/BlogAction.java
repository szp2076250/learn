package com.xk.action;

import java.util.List;

import org.apache.struts2.json.JSONResult;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xk.model.Blog;
import com.xk.service.BlogService;
import com.xk.tool.BlogConst;
import com.xk.tool.CommonUnit;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class BlogAction extends ActionSupport{
	private String strBlogTitle;
	private String strBlogDesc;
	private String strBlogContent;
	
	private String result;
	private int page;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getStrBlogTitle() {
		return strBlogTitle;
	}
	public void setStrBlogTitle(String strBlogTitle) {
		this.strBlogTitle = strBlogTitle;
	}
	public String getStrBlogDesc() {
		return strBlogDesc;
	}
	public void setStrBlogDesc(String strBlogDesc) {
		this.strBlogDesc = strBlogDesc;
	}
	public String getStrBlogContent() {
		return strBlogContent;
	}
	public void setStrBlogContent(String strBlogContent) {
		this.strBlogContent = strBlogContent;
	}
	
	public void refresh() {
		BlogService blogService = (BlogService)CommonUnit.getCtx().getBean(BlogConst.BEAN_BLOG);
		List<Blog> blogList = blogService.GetSomeBlogs(10, 1);
		long iBlogCount=blogService.GetTotalBlogCount();
		ActionContext.getContext().put(BlogConst.BLOG_FIRST_PAGE,blogList);
		ActionContext.getContext().put(BlogConst.BLOG_TOTAL_COUNT,iBlogCount);
	}
	
	public String page() {
		BlogService blogService = (BlogService)CommonUnit.getCtx().getBean(BlogConst.BEAN_BLOG);
		List<Blog> blogList = blogService.GetSomeBlogs(10,this.page);
		long iBlogCount=blogService.GetTotalBlogCount();
		ActionContext.getContext().put(BlogConst.BLOG_FIRST_PAGE,blogList);
		ActionContext.getContext().put(BlogConst.BLOG_TOTAL_COUNT,iBlogCount);
		
		JSONObject jsonObject = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		jsonArray.addAll(blogList);
		jsonObject.put("data", jsonArray);
		String strJsonObj = jsonObject.toString();
		this.result = jsonObject.toString();
		return SUCCESS;
	}
	
	public String delete() {
		BlogService blogService = (BlogService)CommonUnit.getCtx().getBean(BlogConst.BEAN_BLOG);
		JSONObject jsonObject = new JSONObject();
		if(1==blogService.DeleteBlog(this.id)) 
		{
			jsonObject.put("resultcode", -9);
			this.result = jsonObject.toString();
			return ERROR;
		}
		
		jsonObject.put("resultcode", 0);
		this.result = jsonObject.toString();
		return SUCCESS;
	}
	
	public String info() {
		BlogService blogService = (BlogService)CommonUnit.getCtx().getBean(BlogConst.BEAN_BLOG);
		JSONObject jsonObject = new JSONObject();
		Blog blog = blogService.GetInfoById(this.id);
		if(null==blog) 
		{
			jsonObject.put("resultcode", -9);
			this.result = jsonObject.toString();
			return ERROR;
		}
		
		jsonObject.put("resultcode", 0);
		jsonObject.put("data", blog);
		this.result = jsonObject.toString();
		return SUCCESS;
	}
	
	public String modify() {
		BlogService blogService = (BlogService)CommonUnit.getCtx().getBean(BlogConst.BEAN_BLOG);
		JSONObject jsonObject = new JSONObject();
		
		Blog modifyBlog = new Blog(strBlogTitle,strBlogContent,strBlogDesc);
		modifyBlog.setBlogId(this.id);
		if(1!=blogService.UpdateBlog(modifyBlog))
		{
			jsonObject.put("resultcode", -10);
			this.result = jsonObject.toString();
			return ERROR;
		}
		
		jsonObject.put("resultcode", 0);
		this.result = jsonObject.toString();
		return SUCCESS;
	}
	
	public String add() {
		JSONObject jsonObject = new JSONObject();
		if(strBlogTitle==null) {
			jsonObject.put("resultcode", "-4");
			jsonObject.put("desc", "标题为空");
		}
		
		BlogService bs =  (BlogService) CommonUnit.getCtx().getBean(BlogConst.BEAN_BLOG);
		Blog blog = new Blog(strBlogTitle,strBlogContent,strBlogDesc);
		jsonObject.put("resultcode", "0");
		jsonObject.put("desc", "插入成功!");
		this.result = jsonObject.toString();
		refresh();
		return 1==bs.InsertBlog(blog)?SUCCESS:ERROR;
	}
	
}
