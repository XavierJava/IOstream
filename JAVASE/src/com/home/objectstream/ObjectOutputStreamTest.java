package com.home.objectstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
	java.io.ObjectOutputStream;序列化Java对象到硬盘(serial)
	java.io.ObjectInputStream；在硬盘中的文件反序列化到JVM内存(DeSerial
 */




public class ObjectOutputStreamTest {

	public static void main(String[] args) throws Exception {
		User user = new User("xavier");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temp02"));
		oos.writeObject(user);
		oos.flush();
		oos.close();
	}

}
