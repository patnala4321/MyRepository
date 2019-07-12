import java.util.Scanner;
import java.lang.*;

public class BubbleSort1 {
	public static void main(String[] args) {
		int i, j, n, temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Input a number of values");
		n = in.nextInt();
		int array[] = new int[n];
		System.out.println("Input " + n + " values");

		for (i = 0; i < n; i++)
			array[i] = in.nextInt();

		System.out.println("" + "Actual List");
		for (i = 0; i < n; i++)
			System.out.println(array[i]);

		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}

			}
		}
		System.out.println("Sorted List");
		for (i = 0; i < n; i++)
			System.out.println(array[i]);

	}
}