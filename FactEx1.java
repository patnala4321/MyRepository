
public class FactEx1 {

	public static void main(String[] args) {
		
		int n=5;
		int fact=1;
		
		/*
		 * while(n>=1) { fact=fact*n; n--; } System.out.println(fact);
		 */
		
		
		do
		{
			fact=fact*n;
			n--;
		}while(n>=1);
		System.out.println(fact);
		
	}

}
