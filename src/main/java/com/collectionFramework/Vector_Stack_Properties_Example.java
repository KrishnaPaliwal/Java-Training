package com.collectionFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

public class Vector_Stack_Properties_Example {
    public static void main(String[] args) {
    
    	Vector<String> v = new Vector<String>();
    	v.add("sdsfs");
    	
    	Stack<Integer> stack = new Stack<Integer>();
    	stack.add(4);
    	stack.add(6);
    	
    	Properties properties = new Properties();
    	try {
			properties.load(new FileInputStream(new File("D:\\Workspaces\\JavaTraining\\Java-Training\\src\\main\\resources\\Example.properties")));
    	} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
}
