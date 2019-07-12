package examples;

public class NestedIf {

	public static void main(String[] args) {
		/*
		 * int a=45000,b=7800,c=4390;
		 * 
		 * if(a>b) { if(a>c) { System.out.println("A is greater"); } else if(b>c) {
		 * System.out.println("B is greater"); }
		 * 
		 * else System.out.println("C is greater");
		 * 
		 * } else if(b>c) { System.out.println("B is greater"); }
		 * 
		 * else System.out.println("C is greater");
		 */
		int fact=1;
		for (int i =5; i >= 1; i --) {
			
			fact=fact*i;
			
		}
		System.out.println(fact);
		
		/*int x=2;
				while(x<=100)
				{
					System.out.println(x);
					x+=2;
				}*/
	}
}
