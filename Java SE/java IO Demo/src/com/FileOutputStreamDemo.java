package com;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		try {
			FileOutputStream fos=new FileOutputStream("src/abc.txt",true);
			
			String msg="Good Evening";
			
			byte[] data=msg.getBytes();
			
			fos.write(data);
			
			System.out.println("-- Writing is done");
			
			

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
