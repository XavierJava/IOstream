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

public class GenericParadigmTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");

		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		HashMap<String, Integer> maps = new HashMap<String,Integer>();
		maps.put("first", 1);
		maps.put("second", 2);
		maps.put("third", 3);
		maps.put("forth", 4);
		Set<String> set = maps.keySet();
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			String k = i.next();
			System.out.println(k+"------>"+maps.get(k));
		}
		
		
		
		
	}

}
