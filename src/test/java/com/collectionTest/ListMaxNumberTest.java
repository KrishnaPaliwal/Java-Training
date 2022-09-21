package com.collectionTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.collectionFramework.MyListExample;

public class ListMaxNumberTest {

	MyListExample example = new MyListExample();
	List<Integer> list = new ArrayList<Integer>();

	
	@Before
	public void intializeList() {
		System.out.println("intializeList called");
		Collections.addAll(list, 5, 44, 4, 667, 43, 33);
		example.sortList(list);
		System.out.println("list: "+list);

	}

	@Test
	public void testMax() {
		System.out.println("testMax called");
		int max = example.getMax(list);
		assertEquals(667, max);

	}
	
	@Test 
	@Ignore
	public void testMax2() {
		System.out.println("testMax called");
		int max = example.getMax(list);
		assertEquals(667, max);
	}

	@After
	public void close() {
		System.out.println("Closed called");
	}
}
