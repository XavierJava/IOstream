package com.home.datastream;

import java.io.DataInputStream;
import java.io.FileInputStream;


public class DataInputStreamTest {

	public static void main(String[] args) throws Exception {

		DataInputStream dis = new DataInputStream(new FileInputStream("temp01"));
		System.out.println(dis.readByte());
		System.out.println(dis.readInt());
		dis.close();
	}

}
