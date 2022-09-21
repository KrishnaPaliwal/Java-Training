package com.collectionTest;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import com.autoboxing_unboxing.Autoboxing_Unboxing;

public class Autoboxing_Unboxing_Test {

	Autoboxing_Unboxing au = new Autoboxing_Unboxing();

	@Test
	public void testAutoBoxing() {
		//int a = au.autoBoxing(new Integer(4), new Short((short) 6));
		int a = au.autoBoxing(6, (short)4);
		assertEquals(10, a);
	}
}
