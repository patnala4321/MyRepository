package examples;

import java.util.Scanner;

public class NestedIfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read=new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter any integer value");
		a=read.nextInt();
		
		System.out.println("Enter any integer value");
		b=read.nextInt();
				
		System.out.println("Enter any integer value");
		c=read.nextInt();
		
		System.out.println("Enter any integer value");
		d=read.nextInt();
		
		
		
		if(a>b)
		{
			if(b>c)
			{
				if(c>d)
				{
					System.out.println("A is greater");
				}
				
				
				
			}
		}
		

	}

}
