package com.langpack;

class TestClone implements Cloneable {
	int a;
	Double b;

	TestClone cloneTest() {
		try {
			return (TestClone) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning not allowed");
			return this;
		}
	}
}

public class CloneDemo {

	public static void main(String[] args) {
		TestClone x1 = new TestClone();
		TestClone x2;
		x1.a = 10;
		x1.b = 20.98;
		x2 = x1.cloneTest();
		System.out.println("x1:" + x1.a + " " + x1.b);
		System.out.println("x2:" + x2.a + " " + x2.b);
	}

}
