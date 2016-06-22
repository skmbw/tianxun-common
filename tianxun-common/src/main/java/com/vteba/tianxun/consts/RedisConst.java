package com.vteba.tianxun.consts;

/**
 * redis键常量前缀
 * @author yinlei
 * @date 2016-4-4
 */
public interface RedisConst {
	/** 首页缓存在redis中的数据 */
	public static final String IDX = "index_main_ls";
	/** 首页天寻热文 */
    public static final String HOT = "index_hot_ls";
     /** 首页名人堂 */
    public static final String CELEBRITY = "index_celebrity_ls";
     /** 首页热门标签 */
    public static final String TAGS = "index_tag_ls";
    /** 问题首页缓存 */
    public static final String QUES_IDX = "ques_index_cache_ls";
    
    /** 分类树形结构 */
    public static final String CATE_LIST = "a_category_tree_ls";
    /** 问题总数汇总键 */
    public static final String QCOUNT = "a_question_count_ct";
}
