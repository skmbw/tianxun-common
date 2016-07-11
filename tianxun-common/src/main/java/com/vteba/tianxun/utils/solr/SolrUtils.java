package com.vteba.tianxun.utils.solr;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

import com.google.common.collect.Lists;

/**
 * 手工将solr搜索的结果转换成SolrBean。spring的SolrTemplate的封装太厚重。
 * 
 * @author yinlei
 * @date 2016年3月30日 下午4:19:23
 */
public class SolrUtils {
	public static final String ID = "id";
	public static final String TITLE = "title";
	public static final String SUMMARY = "summary";
	public static final String CATEGORY = "category";
	public static final String CONTENT = "mmseg_content";
	public static final String VERSION = "_version_";
	public static final String TYPE = "type";
	public static final String DATE = "date_dt";
	public static final String AUTHOR = "author";
	
	public static List<SolrBean> getBean(QueryResponse response) {
		SolrDocumentList list = response.getResults();
		List<SolrBean> result = Lists.newArrayList();
		for (SolrDocument document : list) {
			Map<String, Object> map = document.getFieldValueMap();
			SolrBean bean = new SolrBean();
			bean.setId(map.get(ID).toString());
			bean.setTitle((String) map.get(TITLE));
			bean.setSummary((String) map.get(SUMMARY));
			bean.setCategory((String) map.get(CATEGORY));
			bean.setContent((String) map.get(CONTENT));
			bean.setAuthor((String) map.get(AUTHOR));
			bean.setDate((Date) map.get(DATE));
			bean.setVersion((Long) map.get(VERSION));
			
			Object type = map.get(TYPE);
			if (type != null) {
				bean.setType((int) type);
			}
			result.add(bean);
		}
		return result;
	}
}
