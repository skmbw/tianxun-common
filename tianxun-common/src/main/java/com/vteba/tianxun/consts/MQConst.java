package com.vteba.tianxun.consts;

/**
 * rocketmq中消息topic和tag常量
 * 
 * @author yinlei
 * @since 2016年6月30日 上午10:55:06
 */
public interface MQConst {
	/** 用户user Topic */
	public static final String USER = "User";
	
	/** 积分score Topic */
	public static final String SCORE = "Score";
	
	/** 账户account Topic */
	public static final String ACCOUNT = "Account";
	
	/** 用户注册tag */
	public static final String TAG_REG = "Regist";
	
	/** 用户登录tag */
	public static final String TAG_LOG = "login";
	
	/** 发表文章tag */
	public static final String TAG_PUBART = "publish_article";
	
	/** 用户提问tag */
	public static final String TAG_ASK = "ask";
	
	/** 回答问题tag */
	public static final String TAG_ANSWER = "answer";
	
	/** 评论tag */
	public static final String TAG_COMMENT = "comment";
}
