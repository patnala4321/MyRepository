package Exceptions;

public class ExceptionNullPointer {

	public static void main(String[] args)
	{
		String str=null;
		try {
		
		System.out.println(str.length());
		}
		catch(NullPointerException nEx)
		{
			System.out.println("XXX   " +nEx);
		}

	}

}
