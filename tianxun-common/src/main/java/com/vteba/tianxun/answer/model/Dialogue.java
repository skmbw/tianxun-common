package com.vteba.tianxun.answer.model;

import java.util.Date;

/**
 * 问答对话实体
 * @author yinlei
 * @date 2016-5-14
 */
public class Dialogue {
    /**
     * order by 排序语句
     * 对应数据库表字段 dialogue
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 dialogue
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 dialogue
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 dialogue
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 dialogue.id
     */
    private String id;

    /**
     * 对应数据库表字段 dialogue.user_id
     */
    private String userId;

    /**
     * 对应数据库表字段 dialogue.nick_name
     */
    private String nickName;

    /**
     * 对应数据库表字段 dialogue.dialog_date
     */
    private Date dialogDate;

    /**
     * 对应的问题id
     */
    private String questionId;

    /**
     * 对应数据库表字段 dialogue.state
     */
    private Integer state;

    /**
     * 对应数据库表字段 dialogue.open
     */
    private Boolean open;

    /**
     * 对话内容
     */
    private String content;
    
    /**
     * 回答id
     */
    private String answerId;

    /**
     * 设置 order by 排序语句
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * 获得 order by 排序语句
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * 设置 start，分页开始记录
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * 获得 start，分页开始记录
     */
    public Integer getStart() {
        return start;
    }

    /**
     * 设置 pageSize，分页大小
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获得 pageSize，分页大小
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置 distinct，是否去重
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 获得 distinct，是否去重
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获得字段 dialogue.id 的值
     *
     * @return the value of dialogue.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 dialogue.id 的值
     *
     * @param id the value for dialogue.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 dialogue.user_id 的值
     *
     * @return the value of dialogue.user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置字段 dialogue.user_id 的值
     *
     * @param userId the value for dialogue.user_id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获得字段 dialogue.nick_name 的值
     *
     * @return the value of dialogue.nick_name
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置字段 dialogue.nick_name 的值
     *
     * @param nickName the value for dialogue.nick_name
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获得字段 dialogue.dialog_date 的值
     *
     * @return the value of dialogue.dialog_date
     */
    public Date getDialogDate() {
        return dialogDate;
    }

    /**
     * 设置字段 dialogue.dialog_date 的值
     *
     * @param dialogDate the value for dialogue.dialog_date
     */
    public void setDialogDate(Date dialogDate) {
        this.dialogDate = dialogDate;
    }

    /**
     * 获得字段 dialogue.question_id 的值
     *
     * @return the value of dialogue.question_id
     */
    public String getQuestionId() {
        return questionId;
    }

    /**
     * 设置字段 dialogue.question_id 的值
     *
     * @param questionId the value for dialogue.question_id
     */
    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    /**
     * 获得字段 dialogue.state 的值
     *
     * @return the value of dialogue.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置字段 dialogue.state 的值
     *
     * @param state the value for dialogue.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得字段 dialogue.open 的值
     *
     * @return the value of dialogue.open
     */
    public Boolean getOpen() {
        return open;
    }

    /**
     * 设置字段 dialogue.open 的值
     *
     * @param open the value for dialogue.open
     */
    public void setOpen(Boolean open) {
        this.open = open;
    }

    /**
     * 获得字段 dialogue.content 的值
     *
     * @return the value of dialogue.content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置字段 dialogue.content 的值
     *
     * @param content the value for dialogue.content
     */
    public void setContent(String content) {
        this.content = content;
    }

	public String getAnswerId() {
		return answerId;
	}

	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}
}