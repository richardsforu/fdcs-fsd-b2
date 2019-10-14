package com;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
		
		try {
			String filePath="./myfiles";
			File file=new File(filePath);
			
			file.mkdir();
			
			file=new File(filePath+"/abc.txt");
			file.createNewFile();
			
			
			
			System.out.println(file.getAbsolutePath());
			
			System.out.println("--- Done");
			
			
		} catch (Exception e) {
			System.out.println("Failed due to "+e);
		}

	}

}
