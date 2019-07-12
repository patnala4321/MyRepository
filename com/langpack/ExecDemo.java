package com.langpack;

public class ExecDemo {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		
		System.out.println(r.availableProcessors());
		System.out.println(r.freeMemory());
		System.out.println(r.maxMemory());
		System.out.println(r.totalMemory());
		System.out.println(r.getRuntime());
		
		//ExecDemo ex=new ExecDemo();
		
		Process p = null;
		try {
			p = r.exec("notepad");
		} catch (Exception e) {
			System.out.println("Error executing notepad");
		}

	}

}
