package com.home.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAllFile {
	public static void main(String[] args) {
		File file = new File("c:/coding");
		findChildFile(file);
	}

		public static void findChildFile(File f) {
			FileInputStream fis=null;
			FileOutputStream fos=null;
			if(f.isFile()) {
				String filePath=f.getAbsolutePath();
				String newFilePath="D"+filePath.substring(1);
				File parentFile = new File(newFilePath).getParentFile();
				if(!parentFile.exists()) {
					parentFile.mkdirs();
				}
				try {
					 fis = new FileInputStream(filePath);
					 fos = new FileOutputStream(newFilePath);
					 
					 byte[] bytes=new byte[1024]; 
					 int temp=0;
					
						while((temp=fis.read(bytes))!=-1) {
							 fos.write(bytes, 0, temp);
						
						fos.flush();
					
						}
					 
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						fis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						
						fos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				return ;
			}
			File[] fs = f.listFiles();
			for(File subF:fs) {
				System.out.println(subF.getAbsolutePath());
				findChildFile(subF);
			}
		}
}
