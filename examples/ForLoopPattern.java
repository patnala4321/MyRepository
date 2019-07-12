package examples;

public class ForLoopPattern {

	
	public static void main(String[] args) {
		
		int n=8,n1;
		n1=n-1;

		for (int i = 1; i <= n; i++) {
			
			for (int s = n1; s >=1; s--) {
				System.out.print(" ");
			}

			for (int k = 1; k < i; k++)
				System.out.print("1");
			
			for (int j = 1; j <= i; j++) {
				System.out.print("1");
			}

			System.out.println();
			n1--;

		}
		
		
		
	}

}
