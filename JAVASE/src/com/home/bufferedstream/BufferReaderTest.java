package com.home.bufferedstream;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class BufferReaderTest {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println("您输入了："+str);
		br.close();
	}

}
