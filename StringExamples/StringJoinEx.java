package StringExamples;

public class StringJoinEx {

	public static void main(String args[]) {
		String joinString1 = String.join(":", "welcome", "to", "javatpoint");
		System.out.println(joinString1);

		String[] splittedStrings = joinString1.split("-");

		for (int i = 0; i < splittedStrings.length; i++) {
			System.out.println(splittedStrings[i]);
		}

		String xyz = "jjjjjjjjjjjj:kkkkkkkkkkk:llllllllll";
		String[] splittedxyz = xyz.split(":");

		for (int i = 0; i < splittedxyz.length; i++) {
			System.out.println(splittedxyz[i]);
		}
	}
}
