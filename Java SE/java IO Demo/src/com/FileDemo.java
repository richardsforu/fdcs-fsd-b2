package com;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		
		try {
			File file=new File("./src/abc.txt");
			System.out.println(file.length());
			System.out.println(file.getParent());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getCanonicalPath());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			
			System.out.println("--------");
			file.setReadOnly();
			System.out.println(file.canWrite());
			
		} catch (Exception e) {
			System.out.println("Failed due to "+e);
		}

	}

}
