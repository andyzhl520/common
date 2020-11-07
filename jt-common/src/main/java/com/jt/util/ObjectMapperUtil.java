package com.jt.util;

import com.fasterxml.jackson.databind.ObjectMapper;

//编辑工具类实现对象与json转化
public class ObjectMapperUtil {
	private static final ObjectMapper MAPPER= 
								new ObjectMapper();
	//对象转化成json串
	public static String toJSON(Object target) {
		String json = null;
		try {
			 json = MAPPER.writeValueAsString(target);
		} catch (Exception e) {
			e.printStackTrace();
			//将检查异常转化为运行时异常
			throw new RuntimeException();
		}
		return json;
	}
	
	//将json串转化成对象
	public static <T> T toObject(
				String json,Class<T> tagetClass) {
		T taget = null;
		try {
			taget = MAPPER.readValue(json, tagetClass);
		} catch (Exception e) {
			throw new RuntimeException();
		}
		return taget;
	}
	
}











