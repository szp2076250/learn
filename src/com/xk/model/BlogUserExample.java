package com.xk.model;

import java.util.ArrayList;
import java.util.List;

public class BlogUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogUserExample() {
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

        public Criteria andBlogUserIdIsNull() {
            addCriterion("blog_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdIsNotNull() {
            addCriterion("blog_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdEqualTo(Integer value) {
            addCriterion("blog_user_id =", value, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdNotEqualTo(Integer value) {
            addCriterion("blog_user_id <>", value, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdGreaterThan(Integer value) {
            addCriterion("blog_user_id >", value, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_user_id >=", value, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdLessThan(Integer value) {
            addCriterion("blog_user_id <", value, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_user_id <=", value, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdIn(List<Integer> values) {
            addCriterion("blog_user_id in", values, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdNotIn(List<Integer> values) {
            addCriterion("blog_user_id not in", values, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_user_id between", value1, value2, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_user_id not between", value1, value2, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddrIsNull() {
            addCriterion("user_email_addr is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddrIsNotNull() {
            addCriterion("user_email_addr is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddrEqualTo(String value) {
            addCriterion("user_email_addr =", value, "userEmailAddr");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddrNotEqualTo(String value) {
            addCriterion("user_email_addr <>", value, "userEmailAddr");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddrGreaterThan(String value) {
            addCriterion("user_email_addr >", value, "userEmailAddr");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddrGreaterThanOrEqualTo(String value) {
            addCriterion("user_email_addr >=", value, "userEmailAddr");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddrLessThan(String value) {
            addCriterion("user_email_addr <", value, "userEmailAddr");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddrLessThanOrEqualTo(String value) {
            addCriterion("user_email_addr <=", value, "userEmailAddr");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddrLike(String value) {
            addCriterion("user_email_addr like", value, "userEmailAddr");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddrNotLike(String value) {
            addCriterion("user_email_addr not like", value, "userEmailAddr");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddrIn(List<String> values) {
            addCriterion("user_email_addr in", values, "userEmailAddr");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddrNotIn(List<String> values) {
            addCriterion("user_email_addr not in", values, "userEmailAddr");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddrBetween(String value1, String value2) {
            addCriterion("user_email_addr between", value1, value2, "userEmailAddr");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddrNotBetween(String value1, String value2) {
            addCriterion("user_email_addr not between", value1, value2, "userEmailAddr");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNull() {
            addCriterion("user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNotNull() {
            addCriterion("user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameEqualTo(String value) {
            addCriterion("user_nickname =", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotEqualTo(String value) {
            addCriterion("user_nickname <>", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThan(String value) {
            addCriterion("user_nickname >", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nickname >=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThan(String value) {
            addCriterion("user_nickname <", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("user_nickname <=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLike(String value) {
            addCriterion("user_nickname like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotLike(String value) {
            addCriterion("user_nickname not like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIn(List<String> values) {
            addCriterion("user_nickname in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotIn(List<String> values) {
            addCriterion("user_nickname not in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameBetween(String value1, String value2) {
            addCriterion("user_nickname between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotBetween(String value1, String value2) {
            addCriterion("user_nickname not between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgIsNull() {
            addCriterion("user_head_img is null");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgIsNotNull() {
            addCriterion("user_head_img is not null");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgEqualTo(String value) {
            addCriterion("user_head_img =", value, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgNotEqualTo(String value) {
            addCriterion("user_head_img <>", value, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgGreaterThan(String value) {
            addCriterion("user_head_img >", value, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgGreaterThanOrEqualTo(String value) {
            addCriterion("user_head_img >=", value, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgLessThan(String value) {
            addCriterion("user_head_img <", value, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgLessThanOrEqualTo(String value) {
            addCriterion("user_head_img <=", value, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgLike(String value) {
            addCriterion("user_head_img like", value, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgNotLike(String value) {
            addCriterion("user_head_img not like", value, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgIn(List<String> values) {
            addCriterion("user_head_img in", values, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgNotIn(List<String> values) {
            addCriterion("user_head_img not in", values, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgBetween(String value1, String value2) {
            addCriterion("user_head_img between", value1, value2, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgNotBetween(String value1, String value2) {
            addCriterion("user_head_img not between", value1, value2, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserSignatureIsNull() {
            addCriterion("user_signature is null");
            return (Criteria) this;
        }

        public Criteria andUserSignatureIsNotNull() {
            addCriterion("user_signature is not null");
            return (Criteria) this;
        }

        public Criteria andUserSignatureEqualTo(String value) {
            addCriterion("user_signature =", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotEqualTo(String value) {
            addCriterion("user_signature <>", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureGreaterThan(String value) {
            addCriterion("user_signature >", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("user_signature >=", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureLessThan(String value) {
            addCriterion("user_signature <", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureLessThanOrEqualTo(String value) {
            addCriterion("user_signature <=", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureLike(String value) {
            addCriterion("user_signature like", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotLike(String value) {
            addCriterion("user_signature not like", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureIn(List<String> values) {
            addCriterion("user_signature in", values, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotIn(List<String> values) {
            addCriterion("user_signature not in", values, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureBetween(String value1, String value2) {
            addCriterion("user_signature between", value1, value2, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotBetween(String value1, String value2) {
            addCriterion("user_signature not between", value1, value2, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeIsNull() {
            addCriterion("user_register_time is null");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeIsNotNull() {
            addCriterion("user_register_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeEqualTo(String value) {
            addCriterion("user_register_time =", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeNotEqualTo(String value) {
            addCriterion("user_register_time <>", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeGreaterThan(String value) {
            addCriterion("user_register_time >", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeGreaterThanOrEqualTo(String value) {
            addCriterion("user_register_time >=", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeLessThan(String value) {
            addCriterion("user_register_time <", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeLessThanOrEqualTo(String value) {
            addCriterion("user_register_time <=", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeLike(String value) {
            addCriterion("user_register_time like", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeNotLike(String value) {
            addCriterion("user_register_time not like", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeIn(List<String> values) {
            addCriterion("user_register_time in", values, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeNotIn(List<String> values) {
            addCriterion("user_register_time not in", values, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeBetween(String value1, String value2) {
            addCriterion("user_register_time between", value1, value2, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeNotBetween(String value1, String value2) {
            addCriterion("user_register_time not between", value1, value2, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserIsOnlineIsNull() {
            addCriterion("user_is_online is null");
            return (Criteria) this;
        }

        public Criteria andUserIsOnlineIsNotNull() {
            addCriterion("user_is_online is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsOnlineEqualTo(String value) {
            addCriterion("user_is_online =", value, "userIsOnline");
            return (Criteria) this;
        }

        public Criteria andUserIsOnlineNotEqualTo(String value) {
            addCriterion("user_is_online <>", value, "userIsOnline");
            return (Criteria) this;
        }

        public Criteria andUserIsOnlineGreaterThan(String value) {
            addCriterion("user_is_online >", value, "userIsOnline");
            return (Criteria) this;
        }

        public Criteria andUserIsOnlineGreaterThanOrEqualTo(String value) {
            addCriterion("user_is_online >=", value, "userIsOnline");
            return (Criteria) this;
        }

        public Criteria andUserIsOnlineLessThan(String value) {
            addCriterion("user_is_online <", value, "userIsOnline");
            return (Criteria) this;
        }

        public Criteria andUserIsOnlineLessThanOrEqualTo(String value) {
            addCriterion("user_is_online <=", value, "userIsOnline");
            return (Criteria) this;
        }

        public Criteria andUserIsOnlineLike(String value) {
            addCriterion("user_is_online like", value, "userIsOnline");
            return (Criteria) this;
        }

        public Criteria andUserIsOnlineNotLike(String value) {
            addCriterion("user_is_online not like", value, "userIsOnline");
            return (Criteria) this;
        }

        public Criteria andUserIsOnlineIn(List<String> values) {
            addCriterion("user_is_online in", values, "userIsOnline");
            return (Criteria) this;
        }

        public Criteria andUserIsOnlineNotIn(List<String> values) {
            addCriterion("user_is_online not in", values, "userIsOnline");
            return (Criteria) this;
        }

        public Criteria andUserIsOnlineBetween(String value1, String value2) {
            addCriterion("user_is_online between", value1, value2, "userIsOnline");
            return (Criteria) this;
        }

        public Criteria andUserIsOnlineNotBetween(String value1, String value2) {
            addCriterion("user_is_online not between", value1, value2, "userIsOnline");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminIsNull() {
            addCriterion("user_is_admin is null");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminIsNotNull() {
            addCriterion("user_is_admin is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminEqualTo(String value) {
            addCriterion("user_is_admin =", value, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminNotEqualTo(String value) {
            addCriterion("user_is_admin <>", value, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminGreaterThan(String value) {
            addCriterion("user_is_admin >", value, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminGreaterThanOrEqualTo(String value) {
            addCriterion("user_is_admin >=", value, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminLessThan(String value) {
            addCriterion("user_is_admin <", value, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminLessThanOrEqualTo(String value) {
            addCriterion("user_is_admin <=", value, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminLike(String value) {
            addCriterion("user_is_admin like", value, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminNotLike(String value) {
            addCriterion("user_is_admin not like", value, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminIn(List<String> values) {
            addCriterion("user_is_admin in", values, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminNotIn(List<String> values) {
            addCriterion("user_is_admin not in", values, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminBetween(String value1, String value2) {
            addCriterion("user_is_admin between", value1, value2, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminNotBetween(String value1, String value2) {
            addCriterion("user_is_admin not between", value1, value2, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIpIsNull() {
            addCriterion("user_ip is null");
            return (Criteria) this;
        }

        public Criteria andUserIpIsNotNull() {
            addCriterion("user_ip is not null");
            return (Criteria) this;
        }

        public Criteria andUserIpEqualTo(String value) {
            addCriterion("user_ip =", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotEqualTo(String value) {
            addCriterion("user_ip <>", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpGreaterThan(String value) {
            addCriterion("user_ip >", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpGreaterThanOrEqualTo(String value) {
            addCriterion("user_ip >=", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLessThan(String value) {
            addCriterion("user_ip <", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLessThanOrEqualTo(String value) {
            addCriterion("user_ip <=", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLike(String value) {
            addCriterion("user_ip like", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotLike(String value) {
            addCriterion("user_ip not like", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpIn(List<String> values) {
            addCriterion("user_ip in", values, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotIn(List<String> values) {
            addCriterion("user_ip not in", values, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpBetween(String value1, String value2) {
            addCriterion("user_ip between", value1, value2, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotBetween(String value1, String value2) {
            addCriterion("user_ip not between", value1, value2, "userIp");
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