package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {

		File file = new File("src/xyz.txt");
		FileReader fr = null;

		try {
			if (file.exists())
				fr = new FileReader(file);
			else
				throw new FileNotFoundException("File path not found");
			
			//------------
			
			for(int i=0;i<file.length();i++) {
				System.out.print((char)fr.read());
			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
