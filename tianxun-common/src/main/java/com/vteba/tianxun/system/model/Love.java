package com.vteba.tianxun.system.model;

/**
 * 点赞鄙视关注实体
 * @author yinlei
 * @date 2016-6-8 21:57
 */
public class Love {

	public static final String PREFIX = "LOVEZ_BISHI_GUAN";
	
	/**操作对象类型 1文章2问题3答案4标签*/
	private int type;
	
	/**操作类型 0点赞1鄙视2关注*///3回答4购买可能不需要
	private int category;
	
	/**操作对象id*/
	private String id;
	
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Long getAnswerNumber() {
		return answerNumber;
	}

	public void setAnswerNumber(Long answerNumber) {
		this.answerNumber = answerNumber;
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

	/**
	 * 获取操作对象id
	 * @return 操作对象id
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

}
