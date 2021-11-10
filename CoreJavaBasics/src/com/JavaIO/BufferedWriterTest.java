package com.JavaIO;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
	public static void main(String[] args) throws IOException {
		FileWriter write = new FileWriter("F:\\test.txt");
		BufferedWriter buffer = new BufferedWriter(write);
		buffer.write("Hiii welcome");
		buffer.close();
		System.out.println("sucess");
	}

}
