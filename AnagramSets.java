import java.util.HashSet;
import java.util.Set;

public class AnagramSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "silent";
		String s2 = "listen";

		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();

		Set<Character> set1 = new HashSet<Character>();
		Set<Character> set2 = new HashSet<Character>();

		for (int i = 0; i < c1.length; i++)
		
			set1.add(c1[i]);

		for (int i = 0; i < c2.length; i++)
			set2.add(c2[i]);

		System.out.println(set1);
		System.out.println(set2);
		
		if(set1.containsAll(set2))
		{
			System.out.println("Given String is Anagram");
		}
				
		else 
			System.out.println("Given String is Not Anagram");
	}

}
