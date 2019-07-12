package examples;



class A {
	int a = 10;

	void showA() {
		System.out.println("A =" + a);
	}

}

class B extends A {
	int a= 15;
	int b = 20;

	void showB() {
		System.out.println("B =" + b);
	}

}

class C extends B {
	int c = 30;

	void showC() {
		System.out.println("C =" + c);
	}
}

class D extends C {
	int d = 40;

	void showD() {
		System.out.println("D =" + d);
	}
}

public class InheritanceEx2 {

	public static void main(String[] args) {
		A objA = new A();
		B objB = new B();
		C objC = new C();
		D objD = new D();
		
		

		System.out.println(objA.a);

		System.out.println(objB.a);
		System.out.println(objB.b);

		System.out.println(objC.a);
		System.out.println(objC.b);
		System.out.println(objC.c);

		System.out.println(objD.a);
		System.out.println(objD.b);
		System.out.println(objD.c);
		System.out.println(objD.d);

		objA.showA();

		objB.showA();
		objB.showB();

		objC.showA();
		objC.showB();
		objC.showC();

		objD.showA();
		objD.showB();
		objD.showC();
		objD.showD();

	}

}
