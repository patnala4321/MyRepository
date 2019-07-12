package Exceptions;

public class Exception1 {

	public static void main(String[] args) {
		int data=0;
		try{
		 data = 50 / 0; // may throw exception
		 
		 
		 
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException caught");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
		finally
		{
			System.out.println("xxx");
		}

		
		System.out.println("rest of the code"+data);
		System.out.println("rest of the code");
		System.out.println("rest of the code");

	}
}