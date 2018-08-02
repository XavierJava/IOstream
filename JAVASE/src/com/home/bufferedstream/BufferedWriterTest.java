package com.home.bufferedstream;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class BufferedWriterTest {

	public static void main(String[] args) throws IOException {
		BufferedWriter	bw=null;
		try {
		bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/coding/JAVASE/Temp",true)));
		bw.write("this is my first buffered");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			bw.flush();
			bw.close();
		}
		
	}

}
