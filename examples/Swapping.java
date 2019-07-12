package examples;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {

		int a, b, temp;

		Scanner read = new Scanner(System.in);

		System.out.println("Enter any integer value");
		a = read.nextInt();

		System.out.println("Enter any integer value");
		b = read.nextInt();

		// Swapping the A and B values using temporary variable
		temp = a;
		a = b;
		b = temp;
		System.out.println("value of a is " + a);
		System.out.println("value of b is " + b);

		// Swapping A and B without temporary variable

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("\nvalue of a is " + a);
		System.out.println("value of b is " + b);

		read.close();
	}

}
