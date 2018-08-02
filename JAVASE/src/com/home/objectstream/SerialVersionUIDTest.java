package com.home.objectstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDTest {

	public static void main(String[] args) throws Exception {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.DBF"));
		Home home = new Home("123","456");
		oos.writeObject(home);
		oos.flush();
		oos.close();
		
	}

}
