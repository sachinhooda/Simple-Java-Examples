package com.java.sachin.threads;

public class MainThread {

	public static void main(String args[]) {
		SimpleThread thread1 = new SimpleThread();
		thread1.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Executing Main Thread");
			try {
				Thread.sleep(100L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
