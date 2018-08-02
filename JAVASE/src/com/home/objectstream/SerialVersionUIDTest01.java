package com.home.objectstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialVersionUIDTest01 {

	public static void main(String[] args) throws Exception {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.DBF"));
		Object o = ois.readObject();
		System.out.println(o.toString());
		ois.close();
		
	}

}
