package com.home.decorator;

public class FileReader extends Reader{
	public void close() {
		System.out.println("FileReader Close");
	}
}
