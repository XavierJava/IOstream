package com.home.objectstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObJectInputStreamTest {

	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("temp02"));
		
		
		Object o = ois.readObject();
		System.out.println(o);
		System.out.println(((User)o).getName());
		ois.close();
	}

}
