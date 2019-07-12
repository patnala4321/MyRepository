package examples;

public class StaticMethodEx1 {
	
	void show()
	{
		System.out.println("Non_Static Method");
	}

	static void display()
	
	{
		System.out.println("Static Method");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMethodEx1 sEx1=new StaticMethodEx1();
		sEx1.show();
	
		
		StaticMethodEx1.display();

	}

}
