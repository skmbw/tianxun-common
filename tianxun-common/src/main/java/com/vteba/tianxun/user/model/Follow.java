package com.vteba.tianxun.user.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Follow {
    /**
     * order by 排序语句
     * 对应数据库表字段 follow
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 follow
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 follow
     */
    @JSONField(serialize = false, deserialize = false)
    private int pageSize = 10;

    @JSONField(serialize = false, deserialize = false)
    private int page = 1;
    
    /**
     * 是否去重
     * 对应数据库表字段 follow
     */
    @JSONField(serialize = false, deserialize = false)
    private boolean distinct;

    /**
     * 对应数据库表字段 follow.id
     */
    private String id;

    /**
     * 关注用户id
     */
    private String userId;

    /**
     * 关注日期
     */
    private Date followDate;

    /**
     * 被关注对象id
     */
    private String followId;

    /**
     * 关注类型，1标签，2人，3文章，4问题，5回答
     */
    private Integer type;
    
    /**
     * 关注的对象的标示
     */
    private String targetId;

    /**
     * 关注的用户名或者文章标题
     */
    private String name;
    
    /**
     * 备注，备用的字段
     */
    private String remark;
    
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
     * 获得字段 follow.id 的值
     *
     * @return the value of follow.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 follow.id 的值
     *
     * @param id the value for follow.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得关注人的id
     *
     * @return the value of follow.user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置关注人的id
     *
     * @param userId the value for follow.user_id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获得关注时间
     *
     * @return the value of follow.follow_date
     */
    public Date getFollowDate() {
        return followDate;
    }

    /**
     * 设置关注时间
     *
     * @param followDate the value for follow.follow_date
     */
    public void setFollowDate(Date followDate) {
        this.followDate = followDate;
    }

    /**
     * 获得被关注人的id
     *
     * @return the value of follow.follow_id
     */
    public String getFollowId() {
        return followId;
    }

    /**
     * 设置被关注人的id
     *
     * @param followId the value for follow.follow_id
     */
    public void setFollowId(String followId) {
        this.followId = followId;
    }

    /**
     * 获得关注类型，1标签，2人，3文章，4问题，5回答
     *
     * @return the value of follow.type
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置关注类型，1标签，2人，3文章，4问题，5回答
     *
     * @param type the value for follow.type
     */
    public void setType(Integer type) {
        this.type = type;
    }

	public String getTargetId() {
		return targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}