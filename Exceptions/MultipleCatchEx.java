package Exceptions;

public class MultipleCatchEx {

	public static void main(String[] ar) {
		try {
			int a[] = new int[5];
			a[8] = 30 / 2;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}

		catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");

	}
}