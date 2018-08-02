package com.home.decorator;
//use BufferedReader extend for FileReader
public class BufferedReader extends Reader{

	Reader reader;
		
	public BufferedReader(Reader reader) {
		super();
		this.reader=reader;
	}	
	
	public void close() {
		System.out.println("this is a extend");
		reader.close();
		System.out.println("this is second extend");
	}
	
	
}
