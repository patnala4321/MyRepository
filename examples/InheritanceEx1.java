package examples;

class A1 {
	int a = 10;

	void showA() {
		System.out.println("A1 =" + a);
	}

}

class B1 extends A1 {
	int a = 15;
	int b = 20;

	void showB() {
		System.out.println("B1 =" + b);
	}

}

public class InheritanceEx1 {

	public static void main(String[] args) {
		A1 objA1 = new A1();
		B1 objB1 = new B1();

		// B1 objB11=(B1)new A1(); Class cast exception

		A1 objA11 = new A1();
		A1 objA12 = new B1();

		A1 objA13 = (B1) new B1();

		System.out.println(objA1.a);

		System.out.println(objB1.a);
		System.out.println(objB1.b);

		System.out.println(objA11.a);

		System.out.println(objA12.a);
//		System.out.println(objA12.b);   

		System.out.println(objA13.a);

	}

}
