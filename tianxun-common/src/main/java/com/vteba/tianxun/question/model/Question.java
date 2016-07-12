package com.vteba.tianxun.question.model;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.vteba.annotation.Kryo;
import com.vteba.annotation.Proto;
import com.vteba.tianxun.answer.model.Answer;

/**
 * 问题实体类
 * 
 * @author iyinlei@126.com
 * @date 2016年7月10日 上午10:52:17
 */
@Kryo
@Proto
public class Question {
	/** 问题附件列表 */
	private List<QuestionFile> fileList;
	private List<Question> questionFileList;
	
	/** 问题正确答案 */
	private Answer answer;
	
	private String authCode; // 验证码
	private String content; // 提问内容
	private String account; // 账号
	private String password; // 密码
	
	/** 问题附件的文件路径，不带文件扩展名 */
	private String filePath;
	/** 文件扩展名，含点号，如.jpg */
	private String type;
	
	private String[] ids; 
	
    /**
     * order by 排序语句
     * 对应数据库表字段 question
     */
	@JSONField(serialize = false, deserialize = true)
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 question
     */
    private Integer start;
    
    @JSONField(serialize = false, deserialize = false)
    private int page = 1;

    /**
     * 分页大小
     * 对应数据库表字段 question
     */
    @JSONField(serialize = false, deserialize = false)
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 question
     */
    @JSONField(serialize = false, deserialize = false)
    private boolean distinct;

    /**
     * 对应数据库表字段 question.id
     */
    private String id;

    /**
     * 对应数据库表字段 question.title
     */
    private String title;

    /**
     * 对应数据库表字段 question.summary
     */
    private String summary;

    /**
     * 对应数据库表字段 question.price
     */
    private Double price;
    
    /**
     * 服务费，整数
     */
    private Integer fee;

    /**
     * 对应数据库表字段 question.asker
     */
    private String asker;

    /**
     * 对应数据库表字段 question.asker_name
     */
    private String askerName;

    /**
     * 对应数据库表字段 question.ask_date
     */
    private Date askDate;

    /**
     * 对应数据库表字段 question.answer_date
     */
    private Date answerDate;

    /**
     * 对应数据库表字段 question.close_date
     */
    private Date closeDate;

    /**
     * 问题是否被解决
     */
    private Boolean solved;

    /**
     * 问题是否开放
     */
    private Boolean open;

    /**
     * 1向平台提问，2向网友
     */
    private Integer platform;

    /**
     * 对应数据库表字段 question.category
     */
    private Integer category;

    /**
     * 对应数据库表字段 question.category_name
     */
    private String categoryName;

    /**
     * 对应数据库表字段 question.satisfied_answer_id
     */
    private String satisfiedAnswerId;

    /**
     * 对应数据库表字段 question.satisfied_user_id
     */
    private String satisfiedUserId;

    /**
     * 对应数据库表字段 question.satisfied_user_name
     */
    private String satisfiedUserName;

    /**
     * 订单状态，0新建1创建订单未支付2已支付
     */
    private Integer state;

    /**
     * 问题是否被删除
     */
    private Boolean deleted;
    
    /**购买数*/
    private Long number;

    /**回答数*/
    private Long answerNumber;
    
    /**关注数*/
    private Long focusNumber;
    
    /**点赞数*/
    private Long loveNumber;
    
    /**鄙视数*/
    private Long despiseNumber;
    
    /** 服务方式，1普通、2紧急（多收10元） */
    private Integer serviceType;
    
    /** 逻辑删除时间 */
    private Date deleteDate;
    
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
        if (start != null) {
        	return start;
        } else {
        	if (page < 1) {
        		page = 1;
        	}
        	return (page - 1) * pageSize;
        }
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
     * 获得字段 question.id 的值
     *
     * @return the value of question.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 question.id 的值
     *
     * @param id the value for question.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 question.title 的值
     *
     * @return the value of question.title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置字段 question.title 的值
     *
     * @param title the value for question.title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获得字段 question.summary 的值
     *
     * @return the value of question.summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置字段 question.summary 的值
     *
     * @param summary the value for question.summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获得字段 question.price 的值
     *
     * @return the value of question.price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置字段 question.price 的值
     *
     * @param price the value for question.price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获得字段 question.asker 的值
     *
     * @return the value of question.asker
     */
    public String getAsker() {
        return asker;
    }

    /**
     * 设置字段 question.asker 的值
     *
     * @param asker the value for question.asker
     */
    public void setAsker(String asker) {
        this.asker = asker;
    }

    /**
     * 获得字段 question.asker_name 的值
     *
     * @return the value of question.asker_name
     */
    public String getAskerName() {
        return askerName;
    }

    /**
     * 设置字段 question.asker_name 的值
     *
     * @param askerName the value for question.asker_name
     */
    public void setAskerName(String askerName) {
        this.askerName = askerName;
    }

    /**
     * 获得字段 question.ask_date 的值
     *
     * @return the value of question.ask_date
     */
    public Date getAskDate() {
        return askDate;
    }

    /**
     * 设置字段 question.ask_date 的值
     *
     * @param askDate the value for question.ask_date
     */
    public void setAskDate(Date askDate) {
        this.askDate = askDate;
    }

    /**
     * 获得字段 question.answer_date 的值
     *
     * @return the value of question.answer_date
     */
    public Date getAnswerDate() {
        return answerDate;
    }

    /**
     * 设置字段 question.answer_date 的值
     *
     * @param answerDate the value for question.answer_date
     */
    public void setAnswerDate(Date answerDate) {
        this.answerDate = answerDate;
    }

    /**
     * 获得字段 question.close_date 的值
     *
     * @return the value of question.close_date
     */
    public Date getCloseDate() {
        return closeDate;
    }

    /**
     * 设置字段 question.close_date 的值
     *
     * @param closeDate the value for question.close_date
     */
    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    /**
     * 问题是否解决
     *
     * @return the value of question.solved
     */
    public Boolean isSolved() {
        return solved;
    }

    /**
     * 设置问题是否解决
     *
     * @param solved the value for question.solved
     */
    public void setSolved(Boolean solved) {
        this.solved = solved;
    }

    /**
     * 问题是否开放
     *
     * @return the value of question.open
     */
    public Boolean isOpen() {
        return open;
    }

    /**
     * 设置问题是否开放
     *
     * @param open the value for question.open
     */
    public void setOpen(Boolean open) {
        this.open = open;
    }

    /**
     * 1向平台提问，2向网友
     *
     * @return the value of question.platform
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * 1向平台提问，2向网友
     *
     * @param platform the value for question.platform
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    /**
     * 获得字段 question.category 的值
     *
     * @return the value of question.category
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * 设置字段 question.category 的值
     *
     * @param category the value for question.category
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * 获得字段 question.category_name 的值
     *
     * @return the value of question.category_name
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 设置字段 question.category_name 的值
     *
     * @param categoryName the value for question.category_name
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * 获得满意问题答案id
     *
     * @return the value of question.satisfied_answer_id
     */
    public String getSatisfiedAnswerId() {
        return satisfiedAnswerId;
    }

    /**
     * 设置满意问题答案id
     *
     * @param satisfiedAnswerId the value for question.satisfied_answer_id
     */
    public void setSatisfiedAnswerId(String satisfiedAnswerId) {
        this.satisfiedAnswerId = satisfiedAnswerId;
    }

    /**
     * 获得正确回答的用户id
     *
     * @return the value of question.satisfied_user_id
     */
    public String getSatisfiedUserId() {
        return satisfiedUserId;
    }

    /**
     * 设置字段 question.satisfied_user_id 的值
     *
     * @param satisfiedUserId the value for question.satisfied_user_id
     */
    public void setSatisfiedUserId(String satisfiedUserId) {
        this.satisfiedUserId = satisfiedUserId;
    }

    /**
     * 获得字段 question.satisfied_user_name 的值
     *
     * @return the value of question.satisfied_user_name
     */
    public String getSatisfiedUserName() {
        return satisfiedUserName;
    }

    /**
     * 设置字段 question.satisfied_user_name 的值
     *
     * @param satisfiedUserName the value for question.satisfied_user_name
     */
    public void setSatisfiedUserName(String satisfiedUserName) {
        this.satisfiedUserName = satisfiedUserName;
    }

    /**
     * 获得订单状态，0新建1创建订单未支付2已支付
     *
     * @return the value of question.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置订单状态，0新建1创建订单未支付2已支付
     *
     * @param state the value for question.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<QuestionFile> getFileList() {
		return fileList;
	}

	public void setFileList(List<QuestionFile> fileList) {
		this.fileList = fileList;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public List<Question> getQuestionFileList() {
		return questionFileList;
	}

	public void setQuestionFileList(List<Question> questionFileList) {
		this.questionFileList = questionFileList;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String[] getIds() {
		return ids;
	}

	public void setIds(String[] ids) {
		this.ids = ids;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
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

	public Long getAnswerNumber() {
		return answerNumber;
	}

	public void setAnswerNumber(Long answerNumber) {
		this.answerNumber = answerNumber;
	}

	public Integer getFee() {
		return fee;
	}

	public void setFee(Integer fee) {
		this.fee = fee;
	}

	/**
	 * 服务方式，1普通、2紧急（多收10元）
	 * @return
	 */
	public Integer getServiceType() {
		return serviceType;
	}

	/**
	 * 服务方式，1普通、2紧急（多收10元）
	 * @param serviceType
	 */
	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}

	public Boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}
}