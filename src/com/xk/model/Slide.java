package com.xk.model;

import com.xk.tool.CommonUnit;

public class Slide {
    private Integer slideId;

    private String slideImgUrl;

    private String slideDesc;

    private String slideReserve;

    private String slideUpdateTime;

    public void Init() {
    	slideReserve = "";
    	slideUpdateTime = CommonUnit.getCurrentTime();
    }
    public Slide() {}
    public Slide(String slideImgUrl, String slideDesc) {
    	Init();
		this.slideImgUrl = slideImgUrl;
		this.slideDesc = slideDesc;
	}

    public Integer getSlideId() {
        return slideId;
    }

    public void setSlideId(Integer slideId) {
        this.slideId = slideId;
    }
    
	public String getSlideImgUrl() {
        return slideImgUrl;
    }

    public void setSlideImgUrl(String slideImgUrl) {
        this.slideImgUrl = slideImgUrl == null ? null : slideImgUrl.trim();
    }

    public String getSlideDesc() {
        return slideDesc;
    }

    public void setSlideDesc(String slideDesc) {
        this.slideDesc = slideDesc == null ? null : slideDesc.trim();
    }

    public String getSlideReserve() {
        return slideReserve;
    }

    public void setSlideReserve(String slideReserve) {
        this.slideReserve = slideReserve == null ? null : slideReserve.trim();
    }

    public String getSlideUpdateTime() {
        return slideUpdateTime;
    }

    public void setSlideUpdateTime(String slideUpdateTime) {
        this.slideUpdateTime = slideUpdateTime == null ? null : slideUpdateTime.trim();
    }
}