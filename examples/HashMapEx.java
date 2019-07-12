//HashMap Example
package examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "aaa");
		hm.put(2, "bbb");
		hm.put(null, "aaa");
		hm.put(2, "bbb");
		hm.put(3, "aaa");

		//Using for each loop
		for (Map.Entry mentry : hm.entrySet()) {
			System.out.println(mentry.getKey() + "     " + mentry.getValue());
		}
		
		
		//Using Iterator

		Set set = hm.entrySet();

		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();

			System.out.println(mentry.getKey() + "     " + mentry.getValue());

		}

	}

}
