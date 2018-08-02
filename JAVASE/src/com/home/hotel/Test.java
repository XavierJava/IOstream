package com.home.hotel;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("欢迎使用酒店管理系统，酒店房间列表如下");
		Hotel hotel = new Hotel();
		hotel.print();
		System.out.println("房间编号如下：");
		String no =sc.next();
		
		hotel.order(no);
		
		hotel.print();

	}

}
