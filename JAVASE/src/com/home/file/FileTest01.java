package com.home.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 	java.io.File;
 		1.File 类和流无关，不能通过该类完成文件的读和写
 		2.ile 是文件和目录路径名的抽象表现形式
 	
 	File代表的是硬盘上的Directory和file
 
 */
public class FileTest01 {
	
	
	public static void main(String[] args) {
		//获取绝对路径
		File file = new File("C:\\coding\\JAVASE\\src\\com\\home\\bufferedstream");
		System.out.println(file.getAbsolutePath());
		
		System.out.println(file.getParent());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		Date date = new Date(file.lastModified());
		System.out.println(sdf.format(date));
		System.out.println(file.length()+" B");
		File[] fs = file.listFiles();
		for(File f:fs) {
			if(f.getAbsolutePath().endsWith(".java"))
			System.out.println(f.getName());
		}
		
		}
	
	
	
}
