package com.langpack;

public class PaddingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 11;
		String with3digits = String.format("%013d", a);
		
		int b=5555;
		String with3digits1 = String.format("%013d", b);
		
		System.out.println(with3digits);
		System.out.println(with3digits1);

	}

}
