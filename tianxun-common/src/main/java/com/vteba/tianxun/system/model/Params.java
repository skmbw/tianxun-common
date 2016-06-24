package com.vteba.tianxun.system.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 系统参数设置model实体
 * 
 * @author iyinlei@126.com
 * @date 2016年6月24日 下午7:26:57
 */
public class Params {
    /**
     * order by 排序语句
     * 对应数据库表字段 params
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 params
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 params
     */
    @JSONField(serialize = false, deserialize = false)
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 params
     */
    @JSONField(serialize = false, deserialize = false)
    private boolean distinct;

    /**
     * 对应数据库表字段 params.id
     */
    private String id;

    /**
     * 参数中文名
     */
    private String name;

    /**
     * 参数代码，可以是zk路径
     */
    private String code;

    /**
     * 参数值
     */
    private String value;

    /**
     * 参数状态 0失效，1有效
     */
    private Integer state;

    /**
     * 描述
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date updateDate;

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
     * 获得字段 params.id 的值
     *
     * @return the value of params.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 params.id 的值
     *
     * @param id the value for params.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 params.name 的值
     *
     * @return the value of params.name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置字段 params.name 的值
     *
     * @param name the value for params.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获得参数代码，可以是zk路径
     *
     * @return the value of params.code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置参数代码，可以是zk路径
     *
     * @param code the value for params.code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获得参数值
     *
     * @return the value of params.value
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置参数值
     *
     * @param value the value for params.value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获得参数状态，1正常，0失效
     *
     * @return the value of params.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置参数状态，1正常，0失效
     *
     * @param state the value for params.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得字段 params.remark 的值
     *
     * @return the value of params.remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置字段 params.remark 的值
     *
     * @param remark the value for params.remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获得字段 params.create_date 的值
     *
     * @return the value of params.create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置字段 params.create_date 的值
     *
     * @param createDate the value for params.create_date
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获得字段 params.update_date 的值
     *
     * @return the value of params.update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置字段 params.update_date 的值
     *
     * @param updateDate the value for params.update_date
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}