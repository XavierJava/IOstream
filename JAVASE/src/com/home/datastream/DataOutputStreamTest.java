package com.home.datastream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) throws IOException {
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("temp01"));
		byte b=10;
		
		
		dos.writeByte(b);
		dos.writeInt(100);
		
		dos.flush();
		dos.close();
		
		
	}

}
