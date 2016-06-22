package com.vteba.tianxun.answer.model;

import java.util.Date;
import java.util.List;

import com.vteba.annotation.Kryo;
import com.vteba.annotation.Proto;

/**
 * 答案或回答实体类
 * @author yinlei
 * @date 2016-5-14
 */
@Kryo
@Proto
public class Answer {
	
	private String nickName; // 回答问题人的昵称
	
	private String avatar; // 回答问题的用户的头像
	
	private String account; // 账户
	
	private String password; // 密码
	
	private List<AnswerFile> fileList; // 文件列表
	
	private String content; // 回答内容
	
	private String authCode; // 验证码
	
	private String targetId;// 封装页面参数，问题id
	
    /**
     * order by 排序语句
     * 对应数据库表字段 answer
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 answer
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 answer
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 answer
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 answer.id
     */
    private String id;

    /**
     * 对应数据库表字段 answer.summary
     */
    private String summary;

    /**
     * 对应数据库表字段 answer.income
     */
    private Double income;

    /**
     * 对应数据库表字段 answer.platform
     */
    private Boolean platform;

    /**
     * 对应数据库表字段 answer.answer_user_id
     */
    private String answerUserId;

    /**
     * 对应数据库表字段 answer.answer_date
     */
    private Date answerDate;

    /**
     * 对应数据库表字段 answer.question_id
     */
    private String questionId;

    /**
     * 对应数据库表字段 answer.accept
     */
    private Integer accept;

    /**
     * 对应数据库表字段 answer.orders
     */
    private Integer orders;

    /**
     * 对应数据库表字段 answer.state
     */
    private Integer state;

    /**
     * 对应数据库表字段 answer.open
     */
    private Boolean open;

    /**
     * 对应数据库表字段 answer.full
     */
    private Boolean full;
    
    /**
     * 提问题的人，问题的所有人
     */
    private String ownerId;

    /**关注数*/
    private Long focusNumber;
    
    /**点赞数*/
    private Long loveNumber;
    
    /**鄙视数*/
    private Long despiseNumber;
    
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
     * 获得字段 answer.id 的值
     *
     * @return the value of answer.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 answer.id 的值
     *
     * @param id the value for answer.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 answer.summary 的值
     *
     * @return the value of answer.summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置字段 answer.summary 的值
     *
     * @param summary the value for answer.summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获得字段 answer.income 的值
     *
     * @return the value of answer.income
     */
    public Double getIncome() {
        return income;
    }

    /**
     * 设置字段 answer.income 的值
     *
     * @param income the value for answer.income
     */
    public void setIncome(Double income) {
        this.income = income;
    }

    /**
     * 获得字段 answer.platform 的值
     *
     * @return the value of answer.platform
     */
    public Boolean getPlatform() {
        return platform;
    }

    /**
     * 设置字段 answer.platform 的值
     *
     * @param platform the value for answer.platform
     */
    public void setPlatform(Boolean platform) {
        this.platform = platform;
    }

    /**
     * 获得字段 answer.answer_user_id 的值
     *
     * @return the value of answer.answer_user_id
     */
    public String getAnswerUserId() {
        return answerUserId;
    }

    /**
     * 设置字段 answer.answer_user_id 的值
     *
     * @param answerUserId the value for answer.answer_user_id
     */
    public void setAnswerUserId(String answerUserId) {
        this.answerUserId = answerUserId;
    }

    /**
     * 获得字段 answer.answer_date 的值
     *
     * @return the value of answer.answer_date
     */
    public Date getAnswerDate() {
        return answerDate;
    }

    /**
     * 设置字段 answer.answer_date 的值
     *
     * @param answerDate the value for answer.answer_date
     */
    public void setAnswerDate(Date answerDate) {
        this.answerDate = answerDate;
    }

    /**
     * 获得字段 answer.question_id 的值
     *
     * @return the value of answer.question_id
     */
    public String getQuestionId() {
        return questionId;
    }

    /**
     * 设置字段 answer.question_id 的值
     *
     * @param questionId the value for answer.question_id
     */
    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    /**
     * 获得字段 answer.accept 的值
     *
     * @return the value of answer.accept
     */
    public Integer getAccept() {
        return accept;
    }

    /**
     * 设置字段 answer.accept 的值
     *
     * @param accept the value for answer.accept
     */
    public void setAccept(Integer accept) {
        this.accept = accept;
    }

    /**
     * 获得字段 answer.orders 的值
     *
     * @return the value of answer.orders
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * 设置字段 answer.orders 的值
     *
     * @param orders the value for answer.orders
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * 获得字段 answer.state 的值
     *
     * @return the value of answer.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置字段 answer.state 的值
     *
     * @param state the value for answer.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得字段 answer.open 的值
     *
     * @return the value of answer.open
     */
    public Boolean getOpen() {
        return open;
    }

    /**
     * 设置字段 answer.open 的值
     *
     * @param open the value for answer.open
     */
    public void setOpen(Boolean open) {
        this.open = open;
    }

    /**
     * 获得字段 answer.full 的值
     *
     * @return the value of answer.full
     */
    public Boolean getFull() {
        return full;
    }

    /**
     * 设置字段 answer.full 的值
     *
     * @param full the value for answer.full
     */
    public void setFull(Boolean full) {
        this.full = full;
    }

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public List<AnswerFile> getFileList() {
		return fileList;
	}

	public void setFileList(List<AnswerFile> fileList) {
		this.fileList = fileList;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getTargetId() {
		return targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public Long getFocusNumber() {
		return focusNumber;
	}

	public void setFocusNumber(Long focusNumber) {
		this.focusNumber = focusNumber;
	}

	public Long getLoveNumber() {
		return loveNumber;
	}

	public void setLoveNumber(Long loveNumber) {
		this.loveNumber = loveNumber;
	}

	public Long getDespiseNumber() {
		return despiseNumber;
	}

	public void setDespiseNumber(Long despiseNumber) {
		this.despiseNumber = despiseNumber;
	}
}