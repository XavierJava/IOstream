package com.home.shopingcar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ShopCar {
	
	HashMap<Product, Integer> productMaps;

	public ShopCar() {
		super();
		this.productMaps = new HashMap<Product,Integer>();
	}
	public void add(Product p) {
		add(p,1);
	}
	public  void add(Product p, int i) {
		
		if(productMaps.containsKey(p)) {
			Integer number = productMaps.get(p);
			number+=i;
			productMaps.put(p, number);
		}
		
		else {
			productMaps.put(p, i);
		}
			
	}
	
	
	public void delete(Product p) {
		delete(p,1);
	}
	public  void delete(Product p, int i) {
		
		if(productMaps.containsKey(p)) {
			Integer number = productMaps.get(p);
			if(number.intValue()>i) {
				number=number-i;
				productMaps.put(p, number);
			}
			else if(number.intValue()==i) {
				productMaps.remove(p);
			}else {
				System.out.println("您输入要删除的 "+p.getName()+" 数量有误，请重新输入");
			}
		}
		else {
			System.out.println("您没有购买该商品");
		}
		
			
	}
	
	public void print() {
		Set<Product> set = productMaps.keySet();
		Iterator<Product> it = set.iterator();
		while(it.hasNext()) {
			Product next = it.next();
			System.out.print(next.toString());
			System.out.println(",number="+productMaps.get(next)+"]");
		}
	}
	
	
	
	
}
