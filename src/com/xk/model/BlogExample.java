package com.xk.model;

import java.util.ArrayList;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(Integer value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(Integer value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(Integer value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(Integer value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<Integer> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<Integer> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogImgsIsNull() {
            addCriterion("blog_imgs is null");
            return (Criteria) this;
        }

        public Criteria andBlogImgsIsNotNull() {
            addCriterion("blog_imgs is not null");
            return (Criteria) this;
        }

        public Criteria andBlogImgsEqualTo(String value) {
            addCriterion("blog_imgs =", value, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsNotEqualTo(String value) {
            addCriterion("blog_imgs <>", value, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsGreaterThan(String value) {
            addCriterion("blog_imgs >", value, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsGreaterThanOrEqualTo(String value) {
            addCriterion("blog_imgs >=", value, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsLessThan(String value) {
            addCriterion("blog_imgs <", value, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsLessThanOrEqualTo(String value) {
            addCriterion("blog_imgs <=", value, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsLike(String value) {
            addCriterion("blog_imgs like", value, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsNotLike(String value) {
            addCriterion("blog_imgs not like", value, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsIn(List<String> values) {
            addCriterion("blog_imgs in", values, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsNotIn(List<String> values) {
            addCriterion("blog_imgs not in", values, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsBetween(String value1, String value2) {
            addCriterion("blog_imgs between", value1, value2, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsNotBetween(String value1, String value2) {
            addCriterion("blog_imgs not between", value1, value2, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNull() {
            addCriterion("blog_title is null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNotNull() {
            addCriterion("blog_title is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleEqualTo(String value) {
            addCriterion("blog_title =", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotEqualTo(String value) {
            addCriterion("blog_title <>", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThan(String value) {
            addCriterion("blog_title >", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThanOrEqualTo(String value) {
            addCriterion("blog_title >=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThan(String value) {
            addCriterion("blog_title <", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThanOrEqualTo(String value) {
            addCriterion("blog_title <=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLike(String value) {
            addCriterion("blog_title like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotLike(String value) {
            addCriterion("blog_title not like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIn(List<String> values) {
            addCriterion("blog_title in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotIn(List<String> values) {
            addCriterion("blog_title not in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleBetween(String value1, String value2) {
            addCriterion("blog_title between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotBetween(String value1, String value2) {
            addCriterion("blog_title not between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogDescIsNull() {
            addCriterion("blog_desc is null");
            return (Criteria) this;
        }

        public Criteria andBlogDescIsNotNull() {
            addCriterion("blog_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBlogDescEqualTo(String value) {
            addCriterion("blog_desc =", value, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescNotEqualTo(String value) {
            addCriterion("blog_desc <>", value, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescGreaterThan(String value) {
            addCriterion("blog_desc >", value, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescGreaterThanOrEqualTo(String value) {
            addCriterion("blog_desc >=", value, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescLessThan(String value) {
            addCriterion("blog_desc <", value, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescLessThanOrEqualTo(String value) {
            addCriterion("blog_desc <=", value, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescLike(String value) {
            addCriterion("blog_desc like", value, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescNotLike(String value) {
            addCriterion("blog_desc not like", value, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescIn(List<String> values) {
            addCriterion("blog_desc in", values, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescNotIn(List<String> values) {
            addCriterion("blog_desc not in", values, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescBetween(String value1, String value2) {
            addCriterion("blog_desc between", value1, value2, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescNotBetween(String value1, String value2) {
            addCriterion("blog_desc not between", value1, value2, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogClickCountIsNull() {
            addCriterion("blog_click_count is null");
            return (Criteria) this;
        }

        public Criteria andBlogClickCountIsNotNull() {
            addCriterion("blog_click_count is not null");
            return (Criteria) this;
        }

        public Criteria andBlogClickCountEqualTo(Integer value) {
            addCriterion("blog_click_count =", value, "blogClickCount");
            return (Criteria) this;
        }

        public Criteria andBlogClickCountNotEqualTo(Integer value) {
            addCriterion("blog_click_count <>", value, "blogClickCount");
            return (Criteria) this;
        }

        public Criteria andBlogClickCountGreaterThan(Integer value) {
            addCriterion("blog_click_count >", value, "blogClickCount");
            return (Criteria) this;
        }

        public Criteria andBlogClickCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_click_count >=", value, "blogClickCount");
            return (Criteria) this;
        }

        public Criteria andBlogClickCountLessThan(Integer value) {
            addCriterion("blog_click_count <", value, "blogClickCount");
            return (Criteria) this;
        }

        public Criteria andBlogClickCountLessThanOrEqualTo(Integer value) {
            addCriterion("blog_click_count <=", value, "blogClickCount");
            return (Criteria) this;
        }

        public Criteria andBlogClickCountIn(List<Integer> values) {
            addCriterion("blog_click_count in", values, "blogClickCount");
            return (Criteria) this;
        }

        public Criteria andBlogClickCountNotIn(List<Integer> values) {
            addCriterion("blog_click_count not in", values, "blogClickCount");
            return (Criteria) this;
        }

        public Criteria andBlogClickCountBetween(Integer value1, Integer value2) {
            addCriterion("blog_click_count between", value1, value2, "blogClickCount");
            return (Criteria) this;
        }

        public Criteria andBlogClickCountNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_click_count not between", value1, value2, "blogClickCount");
            return (Criteria) this;
        }

        public Criteria andBlogGreateCountIsNull() {
            addCriterion("blog_greate_count is null");
            return (Criteria) this;
        }

        public Criteria andBlogGreateCountIsNotNull() {
            addCriterion("blog_greate_count is not null");
            return (Criteria) this;
        }

        public Criteria andBlogGreateCountEqualTo(Integer value) {
            addCriterion("blog_greate_count =", value, "blogGreateCount");
            return (Criteria) this;
        }

        public Criteria andBlogGreateCountNotEqualTo(Integer value) {
            addCriterion("blog_greate_count <>", value, "blogGreateCount");
            return (Criteria) this;
        }

        public Criteria andBlogGreateCountGreaterThan(Integer value) {
            addCriterion("blog_greate_count >", value, "blogGreateCount");
            return (Criteria) this;
        }

        public Criteria andBlogGreateCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_greate_count >=", value, "blogGreateCount");
            return (Criteria) this;
        }

        public Criteria andBlogGreateCountLessThan(Integer value) {
            addCriterion("blog_greate_count <", value, "blogGreateCount");
            return (Criteria) this;
        }

        public Criteria andBlogGreateCountLessThanOrEqualTo(Integer value) {
            addCriterion("blog_greate_count <=", value, "blogGreateCount");
            return (Criteria) this;
        }

        public Criteria andBlogGreateCountIn(List<Integer> values) {
            addCriterion("blog_greate_count in", values, "blogGreateCount");
            return (Criteria) this;
        }

        public Criteria andBlogGreateCountNotIn(List<Integer> values) {
            addCriterion("blog_greate_count not in", values, "blogGreateCount");
            return (Criteria) this;
        }

        public Criteria andBlogGreateCountBetween(Integer value1, Integer value2) {
            addCriterion("blog_greate_count between", value1, value2, "blogGreateCount");
            return (Criteria) this;
        }

        public Criteria andBlogGreateCountNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_greate_count not between", value1, value2, "blogGreateCount");
            return (Criteria) this;
        }

        public Criteria andBlogTimeIsNull() {
            addCriterion("blog_time is null");
            return (Criteria) this;
        }

        public Criteria andBlogTimeIsNotNull() {
            addCriterion("blog_time is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTimeEqualTo(String value) {
            addCriterion("blog_time =", value, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeNotEqualTo(String value) {
            addCriterion("blog_time <>", value, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeGreaterThan(String value) {
            addCriterion("blog_time >", value, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeGreaterThanOrEqualTo(String value) {
            addCriterion("blog_time >=", value, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeLessThan(String value) {
            addCriterion("blog_time <", value, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeLessThanOrEqualTo(String value) {
            addCriterion("blog_time <=", value, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeLike(String value) {
            addCriterion("blog_time like", value, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeNotLike(String value) {
            addCriterion("blog_time not like", value, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeIn(List<String> values) {
            addCriterion("blog_time in", values, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeNotIn(List<String> values) {
            addCriterion("blog_time not in", values, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeBetween(String value1, String value2) {
            addCriterion("blog_time between", value1, value2, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeNotBetween(String value1, String value2) {
            addCriterion("blog_time not between", value1, value2, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogKindSmallIsNull() {
            addCriterion("blog_kind_small is null");
            return (Criteria) this;
        }

        public Criteria andBlogKindSmallIsNotNull() {
            addCriterion("blog_kind_small is not null");
            return (Criteria) this;
        }

        public Criteria andBlogKindSmallEqualTo(String value) {
            addCriterion("blog_kind_small =", value, "blogKindSmall");
            return (Criteria) this;
        }

        public Criteria andBlogKindSmallNotEqualTo(String value) {
            addCriterion("blog_kind_small <>", value, "blogKindSmall");
            return (Criteria) this;
        }

        public Criteria andBlogKindSmallGreaterThan(String value) {
            addCriterion("blog_kind_small >", value, "blogKindSmall");
            return (Criteria) this;
        }

        public Criteria andBlogKindSmallGreaterThanOrEqualTo(String value) {
            addCriterion("blog_kind_small >=", value, "blogKindSmall");
            return (Criteria) this;
        }

        public Criteria andBlogKindSmallLessThan(String value) {
            addCriterion("blog_kind_small <", value, "blogKindSmall");
            return (Criteria) this;
        }

        public Criteria andBlogKindSmallLessThanOrEqualTo(String value) {
            addCriterion("blog_kind_small <=", value, "blogKindSmall");
            return (Criteria) this;
        }

        public Criteria andBlogKindSmallLike(String value) {
            addCriterion("blog_kind_small like", value, "blogKindSmall");
            return (Criteria) this;
        }

        public Criteria andBlogKindSmallNotLike(String value) {
            addCriterion("blog_kind_small not like", value, "blogKindSmall");
            return (Criteria) this;
        }

        public Criteria andBlogKindSmallIn(List<String> values) {
            addCriterion("blog_kind_small in", values, "blogKindSmall");
            return (Criteria) this;
        }

        public Criteria andBlogKindSmallNotIn(List<String> values) {
            addCriterion("blog_kind_small not in", values, "blogKindSmall");
            return (Criteria) this;
        }

        public Criteria andBlogKindSmallBetween(String value1, String value2) {
            addCriterion("blog_kind_small between", value1, value2, "blogKindSmall");
            return (Criteria) this;
        }

        public Criteria andBlogKindSmallNotBetween(String value1, String value2) {
            addCriterion("blog_kind_small not between", value1, value2, "blogKindSmall");
            return (Criteria) this;
        }

        public Criteria andBlogKindBigIsNull() {
            addCriterion("blog_kind_big is null");
            return (Criteria) this;
        }

        public Criteria andBlogKindBigIsNotNull() {
            addCriterion("blog_kind_big is not null");
            return (Criteria) this;
        }

        public Criteria andBlogKindBigEqualTo(String value) {
            addCriterion("blog_kind_big =", value, "blogKindBig");
            return (Criteria) this;
        }

        public Criteria andBlogKindBigNotEqualTo(String value) {
            addCriterion("blog_kind_big <>", value, "blogKindBig");
            return (Criteria) this;
        }

        public Criteria andBlogKindBigGreaterThan(String value) {
            addCriterion("blog_kind_big >", value, "blogKindBig");
            return (Criteria) this;
        }

        public Criteria andBlogKindBigGreaterThanOrEqualTo(String value) {
            addCriterion("blog_kind_big >=", value, "blogKindBig");
            return (Criteria) this;
        }

        public Criteria andBlogKindBigLessThan(String value) {
            addCriterion("blog_kind_big <", value, "blogKindBig");
            return (Criteria) this;
        }

        public Criteria andBlogKindBigLessThanOrEqualTo(String value) {
            addCriterion("blog_kind_big <=", value, "blogKindBig");
            return (Criteria) this;
        }

        public Criteria andBlogKindBigLike(String value) {
            addCriterion("blog_kind_big like", value, "blogKindBig");
            return (Criteria) this;
        }

        public Criteria andBlogKindBigNotLike(String value) {
            addCriterion("blog_kind_big not like", value, "blogKindBig");
            return (Criteria) this;
        }

        public Criteria andBlogKindBigIn(List<String> values) {
            addCriterion("blog_kind_big in", values, "blogKindBig");
            return (Criteria) this;
        }

        public Criteria andBlogKindBigNotIn(List<String> values) {
            addCriterion("blog_kind_big not in", values, "blogKindBig");
            return (Criteria) this;
        }

        public Criteria andBlogKindBigBetween(String value1, String value2) {
            addCriterion("blog_kind_big between", value1, value2, "blogKindBig");
            return (Criteria) this;
        }

        public Criteria andBlogKindBigNotBetween(String value1, String value2) {
            addCriterion("blog_kind_big not between", value1, value2, "blogKindBig");
            return (Criteria) this;
        }

        public Criteria andBlogKindLabelIsNull() {
            addCriterion("blog_kind_label is null");
            return (Criteria) this;
        }

        public Criteria andBlogKindLabelIsNotNull() {
            addCriterion("blog_kind_label is not null");
            return (Criteria) this;
        }

        public Criteria andBlogKindLabelEqualTo(String value) {
            addCriterion("blog_kind_label =", value, "blogKindLabel");
            return (Criteria) this;
        }

        public Criteria andBlogKindLabelNotEqualTo(String value) {
            addCriterion("blog_kind_label <>", value, "blogKindLabel");
            return (Criteria) this;
        }

        public Criteria andBlogKindLabelGreaterThan(String value) {
            addCriterion("blog_kind_label >", value, "blogKindLabel");
            return (Criteria) this;
        }

        public Criteria andBlogKindLabelGreaterThanOrEqualTo(String value) {
            addCriterion("blog_kind_label >=", value, "blogKindLabel");
            return (Criteria) this;
        }

        public Criteria andBlogKindLabelLessThan(String value) {
            addCriterion("blog_kind_label <", value, "blogKindLabel");
            return (Criteria) this;
        }

        public Criteria andBlogKindLabelLessThanOrEqualTo(String value) {
            addCriterion("blog_kind_label <=", value, "blogKindLabel");
            return (Criteria) this;
        }

        public Criteria andBlogKindLabelLike(String value) {
            addCriterion("blog_kind_label like", value, "blogKindLabel");
            return (Criteria) this;
        }

        public Criteria andBlogKindLabelNotLike(String value) {
            addCriterion("blog_kind_label not like", value, "blogKindLabel");
            return (Criteria) this;
        }

        public Criteria andBlogKindLabelIn(List<String> values) {
            addCriterion("blog_kind_label in", values, "blogKindLabel");
            return (Criteria) this;
        }

        public Criteria andBlogKindLabelNotIn(List<String> values) {
            addCriterion("blog_kind_label not in", values, "blogKindLabel");
            return (Criteria) this;
        }

        public Criteria andBlogKindLabelBetween(String value1, String value2) {
            addCriterion("blog_kind_label between", value1, value2, "blogKindLabel");
            return (Criteria) this;
        }

        public Criteria andBlogKindLabelNotBetween(String value1, String value2) {
            addCriterion("blog_kind_label not between", value1, value2, "blogKindLabel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}