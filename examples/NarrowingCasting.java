package examples;

/*Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte*/



public class NarrowingCasting {
	
	static void method1(double a)
	{
		System.out.println(a);
		
	}

	public static void main(String[] args) {
	    double myDouble = 99999999.78;
	    int myInt = (int) myDouble; // Manual casting: double to int

	    System.out.println(myDouble);   // Outputs 9.78
	    System.out.println(myInt);      // Outputs 9\
	     int a=10;
	     double d=99.98;
	    NarrowingCasting.method1(d);
	    
	  }

}
