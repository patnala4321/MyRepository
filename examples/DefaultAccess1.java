package examples;



public class DefaultAccess1 {
	
	private int pri=10;
		    int defa=20;
    protected int protec=30;
    public  int pub=40;
    
    
    public void DefaultAccess1()
    {
    	System.out.println("Private var  ="+pri);
    	System.out.println("default var   ="+defa);
    	System.out.println("Protected var ="+protec);
    	System.out.println("Public var   ="+pub);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultAccess1 da=new DefaultAccess1();
//	da = new DataAccess1();
		
		
		System.out.println("hello");

	}

}
