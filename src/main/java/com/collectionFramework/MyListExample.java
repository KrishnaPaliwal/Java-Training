package com.collectionFramework;

import java.util.Collections;
import java.util.List;

public class MyListExample {

	public List<Integer> sortList(List<Integer> list) {
		Collections.sort(list);
		return list;
	}
	
	public Integer getMax(List<Integer> list) {
		Integer max = Collections.max(list);
		return max;
	}

	
}
