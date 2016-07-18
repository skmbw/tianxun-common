package com.vteba.tianxun.account.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 用户账户明细实体，记录用户账户的变更。
 * 
 * @author iyinlei@126.com
 * @date 2016年4月18日 下午7:59:03
 */
public class AccountDetail {
    /**
     * order by 排序语句
     * 对应数据库表字段 account_detail
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 account_detail
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 account_detail
     */
    @JSONField(serialize = false, deserialize = false)
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 account_detail
     */
    @JSONField(serialize = false, deserialize = false)
    private boolean distinct;

    /**
     * 主键
     */
    private String id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * account表 账户id
     */
    private String accountId;

    /**
     * 金额
     */
    private Double amount;

    /**
     * 业务分类，1充值2消费3收入
     */
    private Integer category;

    /**
     * 创建时间
     */
    private Date operationTime;
    
    /**
     * 订单号
     */
    private String ordersId;
    
    /**
     * 第三方订单号
     */
    private String tradeNo;
    
    /**
     * 更新时间
     */
    private Date updateDate;
    
    /**
     * 1正常，0作废，2待确认
     */
    private Integer state;

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
     * 获得字段 account_detail.id 的值
     *
     * @return the value of account_detail.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 account_detail.id 的值
     *
     * @param id the value for account_detail.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 account_detail.user_id 的值
     *
     * @return the value of account_detail.user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置字段 account_detail.user_id 的值
     *
     * @param userId the value for account_detail.user_id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获得字段 account_detail.account_id 的值
     *
     * @return the value of account_detail.account_id
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 设置字段 account_detail.account_id 的值
     *
     * @param accountId the value for account_detail.account_id
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 获得字段 account_detail.amount 的值
     *
     * @return the value of account_detail.amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * 设置字段 account_detail.amount 的值
     *
     * @param amount the value for account_detail.amount
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * 获得字段 account_detail.category 的值
     *
     * @return the value of account_detail.category
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * 设置字段 account_detail.category 的值
     *
     * @param category the value for account_detail.category
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * 获得字段 account_detail.operation_time 的值
     *
     * @return the value of account_detail.operation_time
     */
    public Date getOperationTime() {
        return operationTime;
    }

    /**
     * 设置操作时间
     *
     * @param operationTime the value for account_detail.operation_time
     */
    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

	public String getOrdersId() {
		return ordersId;
	}

	/**
	 * 设置订单号
	 * @param ordersId
	 */
	public void setOrdersId(String ordersId) {
		this.ordersId = ordersId;
	}

	/**
	 * 获得第三方订单号
	 * 
	 * @return
	 */
	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
}