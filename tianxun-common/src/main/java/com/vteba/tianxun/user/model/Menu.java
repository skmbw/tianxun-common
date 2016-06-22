package com.vteba.tianxun.user.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.vteba.annotation.Kryo;

@Kryo
public class Menu implements com.vteba.security.user.Menu {
	private static final long serialVersionUID = 1090218455693425882L;

	private List<Authority> authorityList = new ArrayList<Authority>();
	
	/**
     * order by 排序语句
     * 对应数据库表字段 menu
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 menu
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 menu
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 menu
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 menu.id
     */
    private String id;

    /**
     * 对应数据库表字段 menu.name
     */
    private String name;

    /**
     * 对应数据库表字段 menu.create_time
     */
    private Date createTime;

    /**
     * 对应数据库表字段 menu.enabled
     */
    private Integer enabled;

    /**
     * 对应数据库表字段 menu.orders
     */
    private Integer orders;

    /**
     * 对应数据库表字段 menu.state
     */
    private Integer state;

    /**
     * 对应数据库表字段 menu.icon
     */
    private String icon;

    /**
     * 对应数据库表字段 menu.initial
     */
    private Boolean initial;

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
     * 获得字段 menu.id 的值
     *
     * @return the value of menu.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 menu.id 的值
     *
     * @param id the value for menu.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 menu.name 的值
     *
     * @return the value of menu.name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置字段 menu.name 的值
     *
     * @param name the value for menu.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获得字段 menu.create_time 的值
     *
     * @return the value of menu.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置字段 menu.create_time 的值
     *
     * @param createTime the value for menu.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获得字段 menu.enabled 的值
     *
     * @return the value of menu.enabled
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * 设置字段 menu.enabled 的值
     *
     * @param enabled the value for menu.enabled
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * 获得字段 menu.orders 的值
     *
     * @return the value of menu.orders
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * 设置字段 menu.orders 的值
     *
     * @param orders the value for menu.orders
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * 获得字段 menu.state 的值
     *
     * @return the value of menu.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置字段 menu.state 的值
     *
     * @param state the value for menu.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得字段 menu.icon 的值
     *
     * @return the value of menu.icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置字段 menu.icon 的值
     *
     * @param icon the value for menu.icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获得字段 menu.initial 的值
     *
     * @return the value of menu.initial
     */
    public Boolean getInitial() {
        return initial;
    }

    /**
     * 设置字段 menu.initial 的值
     *
     * @param initial the value for menu.initial
     */
    public void setInitial(Boolean initial) {
        this.initial = initial;
    }

	@Override
	public String getTenantId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Authority> getAuthorityList() {
		return authorityList;
	}

	public void setAuthorityList(List<Authority> authorityList) {
		this.authorityList = authorityList;
	}
}