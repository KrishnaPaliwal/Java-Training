package com.multithreading;

public class RunnableThread implements Runnable {

	@Override
	public void run() {

		System.out.println("RunnableThread is started");
		for(int i=0; i<100;i++) {
			System.out.println("RunnableThread is started"+i);
			try {
				Thread.sleep(1000000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
