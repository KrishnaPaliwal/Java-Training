package com.exeption.tryWithResources;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class TryWithResourcesExample {
	public static void main(String args[]) {
		try (OutputStream fileOutputStream = new FileOutputStream(
				"D:\\Workspaces\\JavaTraining\\Java-Training\\src\\main\\java\\com\\exeption\\tryWithResources\\abc.txt");
				InputStream inputStream = new FileInputStream(
						"D:\\\\Workspaces\\\\JavaTraining\\\\Java-Training\\\\src\\\\main\\\\java\\\\com\\\\exeption\\\\tryWithResources\\\\abc.txt")) {

			String msg1 = "First message Writing to file : Welcome to Java Training \n";
			byte[] byteArray1 = msg1.getBytes();
			fileOutputStream.write(byteArray1);
			String msg2 = "Second message Writing to file : This is try with resources example";
			byteArray1 = msg2.getBytes();
			fileOutputStream.write(byteArray1);

			DataInputStream dis = new DataInputStream(inputStream);
			int data = inputStream.available();
			byte[] byteArray2 = new byte[data];
			dis.read(byteArray2);
			String str = new String(byteArray2);
			System.out.println(str);
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}
}