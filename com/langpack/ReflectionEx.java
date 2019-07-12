package com.langpack;

class Simple {
}

class ReflectionEx {
	void printName(Object obj) {
		Class c = obj.getClass();
		System.out.println(c.getName());
	}

	public static void main(String args[]) {
		Simple s = new Simple();

		ReflectionEx t = new ReflectionEx();
		t.printName(s);
	}
}
