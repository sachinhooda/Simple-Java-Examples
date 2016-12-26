package com.java.sachin.threads;

public class SimpleThread extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Executing Child Thread");
			try {
				Thread.sleep(120L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			;
		}
	}

}
