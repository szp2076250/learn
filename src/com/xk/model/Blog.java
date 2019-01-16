package com.xk.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.xk.tool.BlogConst;
import com.xk.tool.CommonUnit;

public class Blog {
    private Integer blogId;

    private String blogImgs;

    private String blogTitle;

    private String blogDesc;

    private Integer blogClickCount;
    
    public Blog() {
    	init();
    }
    
    private void init() {
		this.blogClickCount = 0;
		this.blogGreateCount = 0;
		this.blogTime = CommonUnit.getCurrentTime();
		this.blogKindSmall = BlogConst.BLOG_KIND_DEFAULT;
		this.blogKindBig = BlogConst.BLOG_KIND_DEFAULT;
		this.blogKindLabel = BlogConst.BLOG_KIND_DEFAULT;
		this.blogImgs = BlogConst.CONTENT_NULL;
    }

    public Blog(String blogTitle, String blogContent, String blogDesc) {
		this.blogTitle = blogTitle;
		this.blogDesc = blogDesc;
		this.blogContent = blogContent;
		init();
	}

	private Integer blogGreateCount;

    private String blogTime;

    private String blogKindSmall;

    private String blogKindBig;

    private String blogKindLabel;

    private String blogContent;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogImgs() {
        return blogImgs;
    }

    public void setBlogImgs(String blogImgs) {
        this.blogImgs = blogImgs == null ? null : blogImgs.trim();
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public String getBlogDesc() {
        return blogDesc;
    }

    public void setBlogDesc(String blogDesc) {
        this.blogDesc = blogDesc == null ? null : blogDesc.trim();
    }

    public Integer getBlogClickCount() {
        return blogClickCount;
    }

    public void setBlogClickCount(Integer blogClickCount) {
        this.blogClickCount = blogClickCount;
    }

    public Integer getBlogGreateCount() {
        return blogGreateCount;
    }

    public void setBlogGreateCount(Integer blogGreateCount) {
        this.blogGreateCount = blogGreateCount;
    }

    public String getBlogTime() {
        return blogTime;
    }

    public void setBlogTime(String blogTime) {
        this.blogTime = blogTime == null ? null : blogTime.trim();
    }

    public String getBlogKindSmall() {
        return blogKindSmall;
    }

    public void setBlogKindSmall(String blogKindSmall) {
        this.blogKindSmall = blogKindSmall == null ? null : blogKindSmall.trim();
    }

    public String getBlogKindBig() {
        return blogKindBig;
    }

    public void setBlogKindBig(String blogKindBig) {
        this.blogKindBig = blogKindBig == null ? null : blogKindBig.trim();
    }

    public String getBlogKindLabel() {
        return blogKindLabel;
    }

    public void setBlogKindLabel(String blogKindLabel) {
        this.blogKindLabel = blogKindLabel == null ? null : blogKindLabel.trim();
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }

    @Override
    public String toString() {
    	return "Title:"+this.blogTitle+" Desc:"+this.blogDesc+" UpdateTime:"+this.blogTime;
    }
}