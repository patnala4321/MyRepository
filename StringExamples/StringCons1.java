package StringExamples;

public class StringCons1 {

	
	  public String toString() { return "My String RRRR"; }
	 
	void show()
	{
		System.out.println(" Show method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringCons1 sc = new StringCons1();
		
		String str="Hello";
		
		String str1=new String(str);
		
		String str2=new String(str1);
		
		
		//System.out.println(sc.toString());
		
		sc.show();
		
		System.out.println(sc);
		System.out.println(str2);
		
		

	}

}
