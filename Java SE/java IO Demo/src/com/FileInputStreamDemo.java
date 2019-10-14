package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		
		File file=new File("src/abc123.txt");
		FileInputStream fis=null;
		
		try {
			if(file.exists())
				fis=new FileInputStream(file);
			else
				throw new FileNotFoundException("File Path not found");
			
			
			for(int i=0;i<file.length();i++) {
				System.out.print((char)fis.read());
			}
			
			
		} catch (Exception e) {
			System.out.println("-- Failed due to "+e);
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
