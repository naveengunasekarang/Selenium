package com.JavaIO;

import java.io.FileOutputStream;

public class FileoutputStream {
//Write the data in an file , with of FileOutputStream
	public static void main(String[] args) {
		try {
			String data = "Welcome to java";
			FileOutputStream output = new FileOutputStream("");
			byte b[] = data.getBytes();
			output.write(b);
			output.close();
			System.out.println("sucess..");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
