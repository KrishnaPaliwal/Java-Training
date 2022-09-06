package com.multitreading;

public class MyThread2 extends Thread {
	@Override
	public void run() {

		System.out.println("MyThread2 is started");
		for(int i=0; i<100;i++) {
			System.out.println("MyThread2 is started"+i);
			try {
				Thread.sleep(1000000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
