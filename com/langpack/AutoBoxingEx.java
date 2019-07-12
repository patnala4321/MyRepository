package com.langpack;

public class AutoBoxingEx {

	public static void main(String[] args) {

		/*
		 * Integer iOb = 100; int i = iOb; System.out.println(i + "   " + iOb);
		 */
		
		
		Integer iOb=new Integer(100);
		int i=iOb.intValue();
		System.out.println(i+"   "+iOb);
	}

}
