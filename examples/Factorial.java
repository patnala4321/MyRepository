package examples;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int i, fact = 1;
		
		System.out.println("Enter a number");
		
		
		Scanner read = new Scanner(System.in);
		int n = read.nextShort();
		
		System.out.println(n);
		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of "+n+ " is " + fact);
		read.close();
	}

}
