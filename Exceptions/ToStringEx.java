package Exceptions;

public class ToStringEx {

	public String toString() {
		return "Welcome to ToStringEx";
	}

	public static void main(String[] args) {

		/*
		 * String s=new String(); System.out.println(s);
		 */

		ToStringEx ts = new ToStringEx();
		System.out.println(ts);

		System.out.println(ts.hashCode());
		System.out.println(ts.hashCode());

	}

}
