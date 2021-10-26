package com.JavaIO;

import java.io.FileReader;
import java.io.Reader;

public class ReaderTest {

	public static void main(String[] args) {
		try {
			Reader read = new FileReader("F:\\test.txt");
				int data=read.read();
				while(data!=-1) {
					System.out.print((char)data);
					data=read.read();
				}
				read.close();
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
