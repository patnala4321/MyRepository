package com.langpack;

public class DoubleDemo {
	public static void main(String args[]) {
		Double d1 = new Double(3.14150);
		Double d2 = new Double("314150E-5");
		System.out.println(d1 + "=" + d2 + "->" + d1.equals(d2));
		
		Double d3=new Double(1/0.);
		Double d4=new Double(0/0.);
		
		System.out.println(d3
				+":"+d3.isInfinite()+","+d3.isNaN());
		System.out.println(d4+":"+d4.isInfinite()+","+d4.isNaN());
	}

}
