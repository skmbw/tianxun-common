package com.vteba.tianxun.consts;

/**
 * 用户模块相关的常量
 * @author yinlei
 * @date 2016-5-2
 */
public interface UserConst {

	/** 用户头像地址前缀 */
	public static final String AVATAR = "img/avatar/";
	
	/** 用户关注前缀，放到redis中防重 */
	public static final String FOLLOW = "qaa_follow_";
}
