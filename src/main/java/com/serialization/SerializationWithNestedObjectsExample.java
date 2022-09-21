package com.serialization;

//Java code for serialization and deserialization
//of a Java object
import java.io.*;

class Department implements Serializable {
	String departmentName;
	
	public Department(String departmentName) {
		this.departmentName = departmentName;
	}
}
class Employee implements Serializable {
	private static final long serialversionUID = 12559348938L;
	transient int transientIntA;
	transient String transientStringB;
	static int staticIntC;
	static String staticStringD;
	String name;
	int age;
	Department department;

	// Default constructor
	public Employee(String name, int age, int a, String b, int c, String d, Department department  ) {
		this.name = name;
		this.age = age;
		this.transientIntA = a;
		this.transientStringB = b;
		this.staticIntC = c;
		this.staticStringD = d;
		this.department = department;
	}

}

public class SerializationWithNestedObjectsExample {
	public static void printdata(Employee object1) {

		System.out.println("name = " + object1.name);
		System.out.println("age = " + object1.age);
		System.out.println("transientIntA = " + object1.transientIntA);
		System.out.println("transientStringB = " + object1.transientStringB);
		System.out.println("staticIntC = " + object1.staticIntC);
		System.out.println("staticStringD = " + object1.staticStringD);
		System.out.println("department = " + object1.department.departmentName);

	}

	public static void main(String[] args) {
		Employee object = new Employee("Krishna", 30, 2, "Some Transient Value", 5, "Some Static Value", new Department("IT"));
		//String filename = "SerializedObject.txt";
		File filename = new File("SerializedObject.txt");
		// Serialization
		try {

			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(object);

			out.close();
			file.close();

			System.out.println("================================\nObject has been serialized\n" + "Data before Deserialization.");
			printdata(object);

			// value of static variable changed
			object.staticIntC = 10;
			object.staticStringD = "NEW Static Value";
		}

		catch (IOException ex) {
			System.out.println("IOException is caught : "+ex);
		}

		object = null;

		// Deserialization
		try {

			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			object = (Employee) in.readObject();

			in.close();
			file.close();
			System.out.println("=============================\nObject has been deserialized\n" + "Data after Deserialization.");
			printdata(object);

			// System.out.println("z = " + object1.z);
		}

		catch (IOException ex) {
			System.out.println("IOException is caught :"+ex);
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is caught");
		}
	}
}
