package com;

import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		try {

			FileWriter fw = new FileWriter("/src/xyz.txt",true);
			
			String s1 = "Welcome to Java 123";
			
			//char[] data=s1.toCharArray();
			//for(int i=0;i<data.length;i++)
			//	fw.write(data[i]);

			fw.write(s1);

			System.out.println("--- Writing is done");

			fw.close();

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
