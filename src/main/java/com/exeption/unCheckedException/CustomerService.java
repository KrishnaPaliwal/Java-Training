package com.exeption.unCheckedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerService {

	public void analyze(List<String> data) {

		if (data.size() > 50) {
			throw new ListTooLargeException("List can't exceed 50 items!");
		}
	}

	public static void main(String[] args) {

		CustomerService obj = new CustomerService();

		List<String> data = new ArrayList<>(Collections.nCopies(100, "Krishna"));

		obj.analyze(data);

	}
}