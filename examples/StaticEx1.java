package examples;

public class StaticEx1 {

	static 
	{
		System.out.println(" In staic block");
	}
	
	
	int a = 10;

	static int b = 20;

	void showValues() {
		System.out.println("a  =" + a + "   " + "b  =" + b);
		a++;
		b++;
	}

	public static void main(String[] args) {

		StaticEx1 s1=new StaticEx1();
		StaticEx1 s2=new StaticEx1();
		StaticEx1 s3=new StaticEx1();
		
		
		s1.showValues();
		s2.showValues();
		s3.showValues();
		
		
		

	}

}
