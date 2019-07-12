package StringExamples;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);

		System.out.println("Enter any String");

		String str = read.nextLine();

		System.out.println(str.length());

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println("\n"+str.hashCode());
	}

}
