package com.vteba.tianxun.article.model;

public class Content {
    /**
     * order by 排序语句
     * 对应数据库表字段 content
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 content
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 content
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 content
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 content.id
     */
    private String id;

    /**
     * 对应数据库表字段 content.article_id
     */
    private String articleId;

    /**
     * 对应数据库表字段 content.order
     */
    private Integer order;

    /**
     * 对应数据库表字段 content.text
     */
    private String text;

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
     * 获得字段 content.id 的值
     *
     * @return the value of content.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 content.id 的值
     *
     * @param id the value for content.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 content.article_id 的值
     *
     * @return the value of content.article_id
     */
    public String getArticleId() {
        return articleId;
    }

    /**
     * 设置字段 content.article_id 的值
     *
     * @param articleId the value for content.article_id
     */
    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    /**
     * 获得字段 content.order 的值
     *
     * @return the value of content.order
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * 设置字段 content.order 的值
     *
     * @param order the value for content.order
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * 获得字段 content.text 的值
     *
     * @return the value of content.text
     */
    public String getText() {
        return text;
    }

    /**
     * 设置字段 content.text 的值
     *
     * @param text the value for content.text
     */
    public void setText(String text) {
        this.text = text;
    }
}