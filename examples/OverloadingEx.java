package examples;

public class OverloadingEx {

	void add(int a, int b) {
		System.out.println("a+b =" +( a + b));
	}

	void add(float a, float b) {
		System.out.println("a+b =" + (a + b));
	}

	void add(int a, int b, int c) {
		System.out.println("a+b+c =" + (a + b + c));
	}

	void add(int a, int b, float f) {
		System.out.println("a+b+f "+(a + b + f));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingEx oex = new OverloadingEx();
		oex.add(10, 20);
		oex.add(10.5f, 20.6f);
		oex.add(10, 23, 7.7f);
		oex.add(10, 23, 78);

	}

}
