package com.jt.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.jt.enu.KEY_ENUM;

//自定义一个查询的注解
@Target(ElementType.METHOD)//注解的作用范围 方法
@Retention(RetentionPolicy.RUNTIME)//程序运行时有效
public @interface Cache_Find {
	String key()       default "";//接收用户自己的key的值
	//定义key的类型是枚举类型,key等于key加上第一个参数							
	KEY_ENUM keyType() default KEY_ENUM.AUTO;
	int seconds()      default 0;//永不失效
}
