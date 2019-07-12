
class SuperClass {

	private void show() {
		System.out.println("Super class show method");
	}

	protected void display() {
		System.out.println("Super class display method");
	}
	
	void display1()
	{
		System.out.println("Display1 SuperClass");
	}
}

class SubClass extends SuperClass {

	private void show() {
		System.out.println("Sub class show method");
	}

	public void display() {
		System.out.println("Sub class display method");
	}
	
	void display2()
	{
		System.out.println("Display1 SuperClass");
	}
}

public class Overriding_AccModi {

	public static void main(String[] args) {
		
		SuperClass sup=new SuperClass();
		SubClass sub=new SubClass();
		
		
		sup.display();
		sub.display();
		
		
		
		SuperClass supRef;
		
		supRef=sup;
		
		System.out.println("SuperClass Display");
		supRef.display();
		supRef.display1();
		
		supRef=sub;
		
		System.out.println("SubClass Display");
		supRef.display();
		supRef.display1();

	}

}
