
public class DiamondProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 8;
		int x = n;
		int s;

		for (int i = 1; i <= n; i++) {
			for (s = x - 1; s >= 1; s--) {
				System.out.print(" ");
			}

			for (int z = i - 1; z >= 1; z--) {
				System.out.print("1");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("1");
			}

			System.out.println(" ");
			x--;
		}

		x = 1;
		int x1 = 1;
		int n1 = n;
		for (int i = 1; i <= n - 1; i++) {
			for (s = 1; s <= x; s++) {
				System.out.print(" ");
			}

			for (int j = n - 1; j >= i; j--) {
				System.out.print("1");
			}

			for (int k = n1 - 2; k >= 1; k--) {
				System.out.print("1");
			}
			n1--;
			x++;

			System.out.println(" ");
		}

	}

}
