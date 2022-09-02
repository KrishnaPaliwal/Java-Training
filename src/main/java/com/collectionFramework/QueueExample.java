package com.collectionFramework;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueExample {
	public static void main(String add []) {
		Queue<String> queue1 = new PriorityQueue<String>();
		Queue<String> lQueue = new LinkedList<String>();
		Queue<String> abQueue = new ArrayBlockingQueue<String>(10);
		Queue<String> queue2 = new ArrayDeque<String>();

		BlockingQueue<String> queue3 = new LinkedBlockingQueue<String>();
		BlockingDeque<String> deQueue4 = new LinkedBlockingDeque<String>();
		BlockingQueue<String> deQueue5 = new LinkedBlockingDeque<String>();
		
		lQueue.add("ddd");
		lQueue.add("eee");
		System.out.println(lQueue.peek());
		System.out.println(lQueue);
		System.out.println(lQueue.poll());
		System.out.println(lQueue);

	}
}
