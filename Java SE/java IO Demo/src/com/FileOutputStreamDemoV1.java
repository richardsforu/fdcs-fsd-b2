package com;

import java.awt.BufferCapabilities.FlipContents;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamDemoV1 {

	public static void main(String[] args) {

		FileOutputStream fos = null;

		try {

			String filePath = "src/abc.txt";

			File fileLoc = new File(filePath);

			if (fileLoc.exists())
				fos = new FileOutputStream(fileLoc, true);
			else
				throw new FileNotFoundException("Invalid filer path");

			String msg = "Good Evening";

			byte[] data = msg.getBytes();

			fos.write(data);

			System.out.println("-- Writing is done");

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
			e.printStackTrace();
		}

		System.out.println("--- Last Line");

	}

}
