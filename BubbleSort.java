import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int i, j, n, temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Input a number");
		n = in.nextInt();
		int array[] = new int[n];
		System.out.println("Input " + n + " values");
		for (i = 0; i < n; i++)
			array[i] = in.nextInt();
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}
		}
		System.out.println("Sorted List");
		for (i = 0; i < n; i++)
			System.out.println(array[i]);

	}
}
