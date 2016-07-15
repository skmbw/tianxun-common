package com.vteba.tianxun.orders.model;

import java.util.Date;

/**
 * 订单表实体
 * 
 * @author iyinlei@126.com
 * @date 2016年5月19日 下午4:35:40
 */
public class Orders {
    /**
     * order by 排序语句
     * 对应数据库表字段 orders
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 orders
     */
    private Integer start;

    private int page = 1;
    
    /**
     * 分页大小
     * 对应数据库表字段 orders
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 orders
     */
    private boolean distinct;

    /**
     * 主键
     */
    private String id;

    /**
     * 购买标的id
     */
    private String targetId;

    /**
     * 购买标的类型：1文章、2问题
     */
    private Integer type;

    /**
     * 订单创建时间
     */
    private Date createDate;

    /**
     * 支付时间
     */
    private Date payDate;

    /**
     * 订单金额
     */
    private Double amount;

    /**
     * 订单状态，1待支付，2支付中，3支付成功
     */
    private Integer state;

    /**
     * 买家用户id
     */
    private String buyer;

    /**
     * 卖家用户id
     */
    private String seller;

    /**
     * 支付渠道
     */
    private String payChannel;

    /**
     * 平台支付账户
     */
    private String account;

    /**
     * 订单描述
     */
    private String remark;
    
    /**
     * 第三方订单号，如支付宝或者微信
     */
    private String tradeNo;
    
    /**
     * 订单名称
     */
    private String subject;

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
     * 获得字段 orders.id 的值
     *
     * @return the value of orders.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 orders.id 的值
     *
     * @param id the value for orders.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得购买标的id
     *
     * @return the value of orders.target_id
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * 设置购买标的id
     *
     * @param targetId the value for orders.target_id
     */
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * 获得购买标的类型：1文章、2问题
     *
     * @return the value of orders.type
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置购买标的类型：1文章、2问题
     *
     * @param type the value for orders.type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获得字段 orders.create_date 的值
     *
     * @return the value of orders.create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置字段 orders.create_date 的值
     *
     * @param createDate the value for orders.create_date
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获得支付时间
     *
     * @return the value of orders.pay_date
     */
    public Date getPayDate() {
        return payDate;
    }

    /**
     * 设置支付时间
     *
     * @param payDate the value for orders.pay_date
     */
    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    /**
     * 获得订单金额
     *
     * @return the value of orders.amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * 设置订单金额
     *
     * @param amount the value for orders.amount
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * 获得订单状态，1待支付，2支付中，3支付成功
     *
     * @return the value of orders.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置订单状态，1待支付，2支付中，3支付成功
     *
     * @param state the value for orders.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得买家用户id
     *
     * @return the value of orders.buyer
     */
    public String getBuyer() {
        return buyer;
    }

    /**
     * 设置买家用户id
     *
     * @param buyer the value for orders.buyer
     */
    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    /**
     * 获得卖家用户id
     *
     * @return the value of orders.seller
     */
    public String getSeller() {
        return seller;
    }

    /**
     * 设置卖家用户id
     *
     * @param seller the value for orders.seller
     */
    public void setSeller(String seller) {
        this.seller = seller;
    }

    /**
     * 获得支付渠道
     *
     * @return the value of orders.pay_channel
     */
    public String getPayChannel() {
        return payChannel;
    }

    /**
     * 设置支付渠道
     *
     * @param payChannel the value for orders.pay_channel
     */
    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    /**
     * 获得支付账户
     *
     * @return the value of orders.account
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置支付账户
     *
     * @param account the value for orders.account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获得订单描述
     *
     * @return the value of orders.remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置订单描述
     *
     * @param remark the value for orders.remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * 获取第三方订单号
	 * @return
	 */
	public String getTradeNo() {
		return tradeNo;
	}

	/**
	 * 设置第三方订单号
	 * @param tradeNo
	 */
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	/**
	 * 获取订单名称
	 * @return
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * 设置订单名称
	 * @param subject
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
}