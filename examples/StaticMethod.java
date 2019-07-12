package examples;

public class StaticMethod {
	public static long add(long i,long j)
	{
		return i+j;
	}
	public static int addInts(int i,int...j)
	{
		int sum=i;
		for(int x:j)
			sum+=x;
		return sum;
	}
	public static void main(String[] args) {
		
		System.out.println(StaticMethod.add(1, 2));
		System.out.println(StaticMethod.addInts(1,2,3,4,5,6,7,8));
		
		

	}

}
