package examples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();

		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");

		/*
		 * //Using for each for(String s:al) { System.out.println(s); }
		 * 
		 */

		Iterator it = al.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
