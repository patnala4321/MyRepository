package StringExamples;

public class DataConv3 {

	public static void main(String[] args) {
		String str1 = "Collection of tutorials";
		String str2 = "Consists of different tutorials";

		/*
		 * matches characters from index 14 in str1 to characters from index 22 in str2
		 * considering same case of the letters.
		 */
		boolean match1 = str1.regionMatches(14, str2, 22, 9);
		System.out.println("region matched = " + match1);

		// considering different case, will return false
		str2 = "Consists of different Tutorials";
		match1 = str1.regionMatches(false,14, str2, 22, 9);  //false will consider the case sensitivity; true ignores the case sensitivity
		System.out.println("region matched = " + match1);

	}

}
