package com.Thread;

public class Multi implements Runnable{
public void run() {
      System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		Multi m = new Multi();
		m.run();

	}

}
