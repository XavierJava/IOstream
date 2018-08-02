package com.home.shopingcar;

import java.util.Scanner;

public class ShopCarTest {
private static Scanner sc;

public static void main(String[] args) throws ClassNotFoundException {
	Product[] products=new Product[10];
	for(int i=0; i<10;i++) {
		products[i]=new Product(i+1, "西瓜"+(i+1)+"号",10+i+1);
	}
	Customer customer = new Customer("xavier");
	System.out.println("欢迎光临本超市");
	sc = new Scanner(System.in);
	String next=null;
	int number=0;
	int j=0;
	while(true) {
	System.out.println("请输入您的请求 1、	添加商品  2、删除商品");
	next = sc.next();
	if(next.equals("1")) {
		System.out.print("请输入您要添加的商品编号：");
		next=sc.next();
		for(int i=0;i<products.length;i++) {
			if(next.equals(products[i].getId()+"")) {
				j=i;
			}
		}
		System.out.print("请输入您要添加的商品的数量：");
		number=sc.nextInt();
		customer.addToShopCar(products[j], number);
		
	}
	
	}
		
}

}
