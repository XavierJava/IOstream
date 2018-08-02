/*
		 关于jdk5.0新特性，泛型（编译期概念）
		 1.为什么引入泛型
		 
		 2.泛型语法如何实现？
		  
		  
		  
		  
		  
		 3.泛型的优点和缺点
		 如果集合中不使用泛型。则集合中的类型不统一，在遍历中只能拿出object类型，需要大量强制类型转换
		 优点：统一类型，减少强制类型转换
		 缺点：类型太统一
		 
		 
		 
		 */

package com.home.javase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class GenericParadigmTest1 {

	public static void main(String[] args) {	
		MyClass<String> mc = new MyClass<String>();
		mc.m1("100");
	}

}

class MyClass <T>{
	
	public void m1(T t) {
		System.out.println(t);
	}
	
	
	
	
}