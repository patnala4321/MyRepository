package Exceptions;

import java.io.IOException;

class Parent {
	void msg() throws Exception{
		System.out.println("Parent");
	}
	void show()
	{
		System.out.println("Show in Parent");
	}
}

public class Exceptions_Overriding extends Parent {

	void msg() throws IOException{
		System.out.println("TestExceptionChild");
	}
	
	void show()  throws IndexOutOfBoundsException
	{
		System.out.println("Show in Child");
	}

	public static void main(String args[]) throws Exception {
		Parent p = new Exceptions_Overriding();
		p.msg();
	}
}




