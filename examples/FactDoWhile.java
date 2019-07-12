package examples;

import java.util.Scanner;

public class FactDoWhile {

	public static void main(String[] args) {
		int i = 1, fact = 1;
		System.out.println("Enter a number");
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		do {
			fact = fact * i;
			i++;
		} while (i <= n);
		System.out.println("Factorial of a number " + fact);
		read.close();
	}

}
