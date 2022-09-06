package com.multitreading;

public class ThreadTest {

	public static void main(String [] ar) throws InterruptedException {
		MyThread1 t1 = new MyThread1();
		t1.setName("MyThread1");
		t1.start();

		MyThread2 t2 = new MyThread2();
		t2.setName("MyThread2");
		t2.start();
		//t2.wait();

		
		Thread t3 = new Thread(new RunnableThread());
		t3.setName("RunnableThread");
		t3.start();
		
	}
}
