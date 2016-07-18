package com.vteba.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.generator.GenMain;

import com.vteba.ext.codegen.CodeBuilder;
import com.vteba.ext.codegen.DB;
import com.vteba.ext.codegen.KeyType;
import com.vteba.ext.codegen.TempType;

public class Coder {

	public static void main(String[] args) {
		Map<String, String> tableListMap = new HashMap<String, String>();
//		tableListMap.put("account", "用户资金账户表");
//		tableListMap.put("account_detail", "用户资金积分明细");
//		tableListMap.put("platform_account", "平台资金账户");
//		tableListMap.put("platform_detail", "平台资金账户明细");
//		tableListMap.put("params", "系统参数表");
//		tableListMap.put("article", "文章表");
//		tableListMap.put("content", "文章内容表");
//		tableListMap.put("question", "问题表");
//		tableListMap.put("question_file", "文章附件表");
//		tableListMap.put("answer", "问题回答表");
//		tableListMap.put("answer_file", "回答附件表");
//		tableListMap.put("follow", "关注表");
		tableListMap.put("orders", "订单");
		
	    //项目绝对路径
		String rootPath = "C:\\Users\\Administrator\\git\\tianxun-common\\tianxun-common\\";
		CodeBuilder builder = new CodeBuilder(rootPath, TempType.MyBatisBasic);
		builder.setConfigFilePath("src/main/resources/config.properties")
		.setSrcPath("src/main/java/")
		.schema("tianxun_user")
		//.className("AppInfo")// 可以不设
		.setDb(DB.MySQL)// 可以不使用，只要jdbc url是正确的
		.keyType(KeyType.String)
		//.tableDesc("应用配置信息")
		//.tableName("app_info")
		.setTableList(tableListMap)
		.module("com.vteba.tianxun.order2")
		.setPojo(false)
		.setBean(true)
		.setMongo(false)
		.setGenAction(false)
        .setGenDao(false)
        .setGenMapper(false)
        .setGenModel(false)
        .setGenService(false)
        .setMybatisShards(false)
        .setMybatisAction(true)//.setMybatisService(false)
        .setJsonAction(true);
        //.setOnlyDao(true);//只产生dao
		
		Map<String, List<String>> map = builder.build();

		GenMain.main(map, tableListMap.size(), rootPath);
	}

}
