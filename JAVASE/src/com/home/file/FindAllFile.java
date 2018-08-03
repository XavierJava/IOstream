package com.home.file;

import java.io.File;

public class FindAllFile {

	public static void main(String[] args) {
		File file = new File("c:/coding");
		findChildFile(file);
	}

		public static void findChildFile(File f) {
			if(f.isFile()) {
				return ;
			}
			File[] fs = f.listFiles();
			for(File subF:fs) {
				System.out.println(subF.getAbsolutePath());
				findChildFile(subF);
			}
		}
}
