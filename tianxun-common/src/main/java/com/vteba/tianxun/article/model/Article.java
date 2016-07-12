package com.vteba.tianxun.article.model;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.vteba.annotation.Kryo;
import com.vteba.annotation.Proto;
import com.vteba.tianxun.question.model.QuestionFile;

/**
 * 热门文章实体类
 * @author yinlei
 * @date 2016-4-16
 */
@Kryo
@Proto
public class Article {
	/** 图片相对路径 */
	public static final String PATH = "img/article/";
	
	private List<QuestionFile> fileList;
	
	/** 用于封装文章内容 */
	private String content;
	
	/** 上传的图片的id */
	private String ids;
	
    /**
     * order by 排序语句
     * 对应数据库表字段 article
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 article
     */
    private Integer start;

    @JSONField(serialize = false, deserialize = false)
    private int page = 1;
    
    /**
     * 分页大小
     * 对应数据库表字段 article
     */
    @JSONField(serialize = false, deserialize = false)
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 article
     */
    @JSONField(serialize = false, deserialize = false)
    private boolean distinct;

    /**
     * 对应数据库表字段 article.id
     */
    private String id;

    /**
     * 对应数据库表字段 article.title
     */
    private String title;

    /**
     * 对应数据库表字段 article.summary
     */
    private String summary;

    /**
     * 对应数据库表字段 article.category_code
     */
    private Integer categoryCode;

    /**
     * 对应数据库表字段 article.answer_id
     */
    private String answerId;

    /**
     * 对应数据库表字段 article.question_id
     */
    private String questionId;

    /**
     * 对应数据库表字段 article.author_id
     */
    private String authorId;

    /**
     * 对应数据库表字段 article.create_date
     */
    private Date createDate;

    /**
     * 对应数据库表字段 article.update_date
     */
    private Date updateDate;

    /**
     * 文章状态，0正常、1禁用
     */
    private Integer state;

    /**
     * 是否平台文章，默认否
     */
    private boolean platform;

    /**
     * 文章是否开放，默认是
     */
    private boolean open;

    /**
     * 文章是否被删除，默认否
     */
    private boolean deleted;

    /**
     * 是否第一段免费，默认是
     */
    private boolean firstFree;
    
    /**
     * 文章价格
     */
    private Double price;
    
    /**购买数*/
    private Long number;
    
    /**作者名*/
    private String authorName;
    
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
     * 获得字段 article.id 的值
     *
     * @return the value of article.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 article.id 的值
     *
     * @param id the value for article.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 article.title 的值
     *
     * @return the value of article.title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置字段 article.title 的值
     *
     * @param title the value for article.title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获得字段 article.summary 的值
     *
     * @return the value of article.summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置字段 article.summary 的值
     *
     * @param summary the value for article.summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获得字段 article.category_code 的值
     *
     * @return the value of article.category_code
     */
    public Integer getCategoryCode() {
        return categoryCode;
    }

    /**
     * 设置字段 article.category_code 的值
     *
     * @param categoryCode the value for article.category_code
     */
    public void setCategoryCode(Integer categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * 获得字段 article.answer_id 的值
     *
     * @return the value of article.answer_id
     */
    public String getAnswerId() {
        return answerId;
    }

    /**
     * 设置字段 article.answer_id 的值
     *
     * @param answerId the value for article.answer_id
     */
    public void setAnswerId(String answerId) {
        this.answerId = answerId;
    }

    /**
     * 获得字段 article.question_id 的值
     *
     * @return the value of article.question_id
     */
    public String getQuestionId() {
        return questionId;
    }

    /**
     * 设置字段 article.question_id 的值
     *
     * @param questionId the value for article.question_id
     */
    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    /**
     * 获得字段 article.author_id 的值
     *
     * @return the value of article.author_id
     */
    public String getAuthorId() {
        return authorId;
    }

    /**
     * 设置作者
     *
     * @param authorId the value for article.author_id
     */
    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    /**
     * 获得字段 article.create_date 的值
     *
     * @return the value of article.create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置字段 article.create_date 的值
     *
     * @param createDate the value for article.create_date
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获得字段 article.update_date 的值
     *
     * @return the value of article.update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置字段 article.update_date 的值
     *
     * @param updateDate the value for article.update_date
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获得文章状态，0正常、1禁用
     *
     * @return the value of article.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置文章状态，0正常、1禁用
     *
     * @param state the value for article.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 是否平台文章
     *
     * @return the value of article.platform
     */
    public boolean isPlatform() {
        return platform;
    }

    /**
     * 设置是否平台文章
     *
     * @param platform the value for article.platform
     */
    public void setPlatform(boolean platform) {
        this.platform = platform;
    }

    /**
     * 获得文章是否开放
     *
     * @return the value of article.open
     */
    public boolean isOpen() {
        return open;
    }

    /**
     * 设置文章是否开放
     *
     * @param open the value for article.open
     */
    public void setOpen(boolean open) {
        this.open = open;
    }

    /**
     * 获得 是否第一段免费
     *
     * @return the value of article.first_free
     */
    public boolean isFirstFree() {
        return firstFree;
    }

    /**
     * 设置是否第一段免费
     *
     * @param firstFree the value for article.first_free
     */
    public void setFirstFree(boolean firstFree) {
        this.firstFree = firstFree;
    }

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<QuestionFile> getFileList() {
		return fileList;
	}

	public void setFileList(List<QuestionFile> fileList) {
		this.fileList = fileList;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
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

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
}