package StringExamples;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str_Sample = "RockStarS";
		System.out.println("Character at position 5: " + str_Sample.charAt(5));
		// Index of a given character
		System.out.println("Index of character 'S': " + str_Sample.indexOf('S'));
		
		
		String str_Sample1 = "RockStar";
		//  System.out.println("Compare To 'ROCKSTAR': " + str_Sample1.compareTo("AockSta4"));
		  //Compare to - Ignore case
		  System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample1.compareToIgnoreCase("ROCKSTAR"));
		  
		  System.out.println("Replace 'Rock' with 'Duke': " + str_Sample.replace("Rock", "Duke"));
		  
		  

	}

}
