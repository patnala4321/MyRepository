package examples;

class A2 {
	int i;
}

class B2 extends A2 {
	int i;
	

	B2(int a, int b) {
		super.i = a;
		i = b;
	}

	void show() {
		System.out.println("i is superclass " + super.i);
		System.out.println("i in subclass " + i);
	}
}

public class SuperClassEx {

	public static void main(String[] args) {
		B2 subob = new B2(1, 2);
		subob.show();
	}

}
