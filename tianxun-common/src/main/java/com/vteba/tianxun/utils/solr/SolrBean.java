package com.vteba.tianxun.utils.solr;

import java.util.Date;

/**
 * solr查询结果bean，手动去构造。spring的solr封装的太过厚重。
 * 
 * @author yinlei
 * @date 2016年3月30日 下午4:11:53
 */
public class SolrBean {

	private String id; // id
	private String title; // 标题
	private String content; // 内容
	private String summary; // 摘要
	private String category; // 问题的分类
	private Long version;
	private int type; // 搜索到的资源类型
	private String author; // 作者
	private Date date; // 日期

	// 分页字段
	private int page = 1; // 页码
	private int pageSize = 20; // 每页大小
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	/**
	 * 获取每一页第一条记录在solr中的索引
	 * @return 每一页开始索引
	 */
	public int getStart() {
		return (page - 1) * pageSize;
	}
	
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
