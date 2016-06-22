package com.vteba.tianxun.question.model;

import static com.vteba.tianxun.common.bean.Node.TYPE_DEF;

import com.vteba.annotation.Kryo;
import com.vteba.tianxun.common.bean.State;

/**
 * 分类实体
 * 
 * @author iyinlei@126.com
 * @date 2015年4月19日 下午4:07:12
 */
@Kryo
public class Category {
	/**
	 * 页面用，节点类型
	 */
	private String type = TYPE_DEF;
	
	/**
	 * 页面用，树形节点的状态
	 */
	private State state;
	
    /**
     * order by 排序语句
     * 对应数据库表字段 category
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 category
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 category
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 category
     */
    private boolean distinct;

    /**
     * 主键
     */
    private String id;

    /**
     * 分类名
     */
    private String text;

    /**
     * 分类状态
     */
    private Integer status;

    /**
     * 对应数据库表字段 category.level
     */
    private Integer level;

    /**
     * 对应数据库表字段 category.parent
     */
    private String parent;
    
    /**
     * 分类图标
     */
    private String icon;

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
     * 获得字段 category.level 的值
     *
     * @return the value of category.level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置字段 category.level 的值
     *
     * @param level the value for category.level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获得字段 category.parent 的值
     *
     * @return the value of category.parent
     */
    public String getParent() {
        return parent;
    }

    /**
     * 设置字段 category.parent 的值
     *
     * @param parent the value for category.parent
     */
    public void setParent(String parent) {
        this.parent = parent;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    
}