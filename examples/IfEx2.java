package examples;

public class IfEx2 {

	public static void main(String[] args) {
		int a=30,b=40,c=35;
		
		if(a>b && a>c)
			System.out.println("A is greater");
		
		else if(b>a && b> c)
		{
			System.out.println("B is greater");
		}
		else
			System.out.println("C is greater");
	}

}
