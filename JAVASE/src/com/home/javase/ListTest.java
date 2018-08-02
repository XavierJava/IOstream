package com.home.javase;

import java.util.ArrayList;
import java.util.Iterator;

/*
	"List" set storage element feature
	1.ordered
	2.repeat
 */
public class ListTest {

	public static void main(String[] args) {
		// create a "List" set
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		//Traversing
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
