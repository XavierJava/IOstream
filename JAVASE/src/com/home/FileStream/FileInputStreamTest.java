package com.home.FileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
java.io.InputStream;
	java.io.FileInputStream;
 */

public class FileInputStreamTest {
	public static void main(String[] args)  {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\coding\\JAVASE\\src\\com\\home\\FileStream\\FileInputStreamTest.java");
			
			byte[] bytes=new byte[1024];
			int temp=0;
			while((temp=fis.read(bytes))!=-1) {
				System.out.print(new String(bytes,0,temp));
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fis!=null) {				
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
