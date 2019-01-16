package com.xk.model;

import com.xk.tool.BlogConst;
import com.xk.tool.CommonUnit;

public class Comment {
    private Integer commentId;

    private Integer blogUserId;

    private Integer blogId;

    private String commentContent;

    private String commentTime;

    private Integer commentParentId;
    
    public void Init() {
    	commentParentId = BlogConst.BLOG_COMMENT_PARENT_ID_NONE;
    	commentTime = CommonUnit.getCurrentTime();
    }

    public Comment() {}

    public Comment(Integer blogUserId, Integer blogId, String commentContent) {
    	Init();
		this.blogUserId = blogUserId;
		this.blogId = blogId;
		this.commentContent = commentContent;
	}

	public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getBlogUserId() {
        return blogUserId;
    }

    public void setBlogUserId(Integer blogUserId) {
        this.blogUserId = blogUserId;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime == null ? null : commentTime.trim();
    }

    public Integer getCommentParentId() {
        return commentParentId;
    }

    public void setCommentParentId(Integer commentParentId) {
        this.commentParentId = commentParentId;
    }
}