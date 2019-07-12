
import java.util.Arrays;
import java.util.Scanner;

/* Write a progam to check whether two strings are anagram or not
 * Anagram means----
 * 		Two Strings are called Anagrams if they contain same set of characters but in different order
 * 		Ex: "listen" is an anagram of  "silent"
 * 		Ex2: "keep" is an anagram of  "peek"
 * 		Ex3: "Mother in law" is an anagram of  "Hitler Woman"
 */

public class AnagramModel1 {
	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter First string:");
		String st1 = sc1.nextLine();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Second String:");
		String st2 = sc2.nextLine();

		boolean status = true;
		if (st1.length() != st2.length()) {
			status = false;
		} else {
			char[] a1 = st1.toUpperCase().toCharArray();
			char[] a2 = st2.toUpperCase().toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			status = Arrays.equals(a1, a2);
		}
		if (status) {
			System.out.println("Both Strings are Anagrams");
		} else {
			System.out.println("Both Strings are not Anagrams");
		}

	}

}