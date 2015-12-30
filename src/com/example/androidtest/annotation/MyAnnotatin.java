package com.example.androidtest.annotation;

/**
 * @author Administrator
 * 自定义注解
 */
public  @interface MyAnnotatin{

	//定义注解的属性
	int age();
	//定义注解的默认值
	String value() default "男";
	//注解类型限定 基本类型 、class类型、String类型、注解类型;   总而言之除了注解类型剩下的就是Android框架本来就有的 WHY;
	Class clazz() default Object.class;
	
	//还可定义注解数组
	int[] ints();
}
