package examples;

public class ForLoop2 {

	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= 5; i++) {
			for (int j = n; j >= 1; j--) {

				System.out.print("1");

			}
			n--;

			System.out.println();
		}
	}
}