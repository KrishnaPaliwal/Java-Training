package com.File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadfileClass {

	public static void main(String [] args) throws IOException {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("D:\\\\Workspaces\\\\JavaTraining\\\\Java-Training\\\\pom.xml")));
			String line;
			while((line = br.readLine()) != null)
			{
				System.out.println("Line"+ line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

