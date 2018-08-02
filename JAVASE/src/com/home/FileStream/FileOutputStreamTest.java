package com.home.FileStream;

import java.io.FileOutputStream;

public class FileOutputStreamTest {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("OutputTemp",true);
		String msg="123456789";
		
		byte[] bytes = msg.getBytes();
		fos.write(bytes);
		
		fos.flush();
		fos.close();
	}

}
