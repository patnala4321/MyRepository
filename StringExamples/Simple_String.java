package StringExamples;

public class Simple_String {

	public static void main(String[] args) {
		// String Concatenation
		String str1 = "Rock";
		String str2 = "Star";
		String str6="Rock";
		// Method 1 : Using concat
		String str3 = str1.concat(str2);
		System.out.println(str3);
		// Method 2 : Using "+" operator
		String str4 = str1 + str2;
		System.out.println(str4);
		
		String s5=str4.concat("  xxxx");
		
		System.out.println(s5);
		
	
		
	}
}
