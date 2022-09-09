package com.multithreading;

public class MyThread1 extends Thread {
	volatile int  some;
	@Override
	public void run() {

		System.out.println("MyThread1 is started");
		for(int i=0; i<100;i++) {
			System.out.println("MyThread1 is started"+i);
			try {
				Thread.sleep(1000000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
