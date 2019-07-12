package examples;

public class ArrayReading {

	public static void main(String[] args) {
		
		
		int a[] = { 10, 20, 30, 40 };
		
		int mul=1;
		
		

		//Accessing array using general for loop
		for (int i = 0; i < a.length; i++) {
			
			mul=mul*a[i];
		}
		
		
				System.out.println("Sum of values of array is "+mul );
			
			
		

		//Accessing array using for..each loop
		
				int m=1;
				
		  for (int i : a) { 
			  m=m*i;
		  }
			  System.out.println("using for each"+m); 
		 

	}

}
