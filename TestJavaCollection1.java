import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class TestJavaCollection1 {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();

		
		// Creating arraylist
		
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add("XXX");
		list.add("111");
		list.add("11.1");
		list.add("%%%%%");

		System.out.println(list);

//Traversing list through Iterator  
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
//Using for..each loop
		
		for (Object x : list) {
			System.out.println(x);
		}

	}
}