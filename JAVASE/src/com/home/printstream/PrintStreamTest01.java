package com.home.printstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintStreamTest01 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setOut(new PrintStream(new FileOutputStream("log",true)));;
		System.out.println("this is a log file");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		
		System.out.println("m1()开始时间："+sdf.format(new Date()));
		m1();
		System.out.println("m1()结束时间："+sdf.format(new Date()));
	}

	public static void m1() {
		System.out.println("test a log file");
	}
	
	
	
	
}
