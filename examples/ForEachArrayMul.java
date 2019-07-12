package examples;

public class ForEachArrayMul {

	public static void main(String[] args) {
		
		int []a= {1,2},b= {1,2};
		
		int k=1;
		for(int i:a)
		{
			for(int j:b)
			{
				k=i*j;
			}
			
			System.out.println(k);
		}

	}

}
