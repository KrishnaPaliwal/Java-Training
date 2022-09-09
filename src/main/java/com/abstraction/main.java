package com.abstraction;

import java.util.*;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

class main {
  public static void main(final String[] args) {
    System.out.println(fullVMArguments());
  }

  static String fullVMArguments() {
    String name = javaVmName();
    return (contains(name, "Server") ? "-server "
      : contains(name, "Client") ? "-client " : "")
      + joinWithSpace(vmArguments());
  }

  static List<String> vmArguments() {
    List<String> list =  ManagementFactory.getRuntimeMXBean().getInputArguments();
    return list;
  }

  static boolean contains(String s, String b) {
    return s != null && s.indexOf(b) >= 0;
  }

  static String javaVmName() {
	  RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
	  List<String> jvmArgs = runtimeMXBean.getInputArguments();
	  

	  // get a RuntimeMXBean reference
	  RuntimeMXBean runtimeMxBean = ManagementFactory.getRuntimeMXBean();

	  // get the jvm's input arguments as a list of strings
	  List<String> listOfArguments = runtimeMxBean.getInputArguments();
	  System.out.println(listOfArguments);
	  for (String arg : jvmArgs) {
	      System.out.println(arg);
	  }
    String s = System.getProperty("-Dsvnkit.http.methods");
    String s2= System.getProperty("sun.java.command");

    System.out.println(s);
    System.out.println(s2);
    return s;
  }

  static String joinWithSpace(Collection<String> c) {
    return join(" ", c);
  }

  public static String join(String glue, Iterable<String> strings) {
    if (strings == null) return "";
    StringBuilder buf = new StringBuilder();
    Iterator<String> i = strings.iterator();
    if (i.hasNext()) {
      buf.append(i.next());
      while (i.hasNext())
        buf.append(glue).append(i.next());
    }
    return buf.toString();
  }
}