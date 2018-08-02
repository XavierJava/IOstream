package com.home.shopingcar;



public class Customer {
	
	
	public String name;
	public ShopCar shopCar;
	
	
	public Customer(String name) {
		super();
		this.name = name;
		shopCar=new ShopCar();
	}


	public  void addToShopCar(Product p) {
	addToShopCar(p,1);
	}
	public  void addToShopCar(Product p,int i) {
	shopCar.add(p, i);
	shopCar.print();
	}
	
	public  void removeFromShopCar(Product p) {
		removeFromShopCar(p,1);
	}
	public  void removeFromShopCar(Product p,int i) {
		shopCar.delete(p, i);
	}
	
}
