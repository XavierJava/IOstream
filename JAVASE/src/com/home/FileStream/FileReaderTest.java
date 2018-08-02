package com.home.FileStream;

import java.io.FileReader;
import java.io.IOException;

/*
 	java.io.Reader;
 		java.io.InputStreamReader;
 			java.io.FileReader;
 */
public class FileReaderTest {

	public static void main(String[] args) {
		FileReader fr=null;
		
		try {
			fr=new FileReader("C:/coding//JAVASE/src/com/home/FileStream/FileReaderTest.java");
			char[] chars=new char[512];
			int temp=0;
			while ((temp=fr.read(chars))!=-1) {
				System.out.print(new String(chars,0,temp));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fr!=null) {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
		
	}

}
