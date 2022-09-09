package com.serialization;

//Java code for serialization and deserialization of a Java object
import java.io.*;

class Emp implements Serializable {

	private static final long serialVersionUID = 3709683101871340080L;
	transient int transientIntA;
	transient String transientStringB;
	static int staticIntC;
	static String staticStringD;
	String name;
	int age;

	// Default constructor
	public Emp(String name, int age, int a, String b, int c, String d) {
		this.name = name;
		this.age = age;
		this.transientIntA = a;
		this.transientStringB = b;
		this.staticIntC = c;
		this.staticStringD = d;
	}

}

public class SeriallizationExample {
	public static void printdata(Emp object1) {

		System.out.println("name = " + object1.name);
		System.out.println("age = " + object1.age);
		System.out.println("transientIntA = " + object1.transientIntA);
		System.out.println("transientStringB = " + object1.transientStringB);
		System.out.println("staticIntC = " + object1.staticIntC);
		System.out.println("staticStringD = " + object1.staticStringD);
	}

	public static void main(String[] args) {
		Emp object = new Emp("Krishna", 30, 2, "Some Transient Value", 5, "Some Static Value");
		//String filename = "krishna.txt";
		File filename = new File("krishna2.txt");
		// Serialization
		/*
		 * try {
		 * 
		 * // Saving of object in a file FileOutputStream file = new
		 * FileOutputStream(filename); ObjectOutputStream out = new
		 * ObjectOutputStream(file);
		 * 
		 * // Method for serialization of object out.writeObject(object);
		 * 
		 * out.close(); file.close();
		 * 
		 * System.out.
		 * println("================================\nObject has been serialized\n" +
		 * "Data before Deserialization."); printdata(object);
		 * 
		 * // value of static variable changed object.staticIntC = 10;
		 * object.staticStringD = "NEW Static Value"; }
		 * 
		 * catch (IOException ex) { System.out.println("IOException is caught : "+ex); }
		 */

		object = null;

		// Deserialization
		try {

			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			object = (Emp) in.readObject();

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
