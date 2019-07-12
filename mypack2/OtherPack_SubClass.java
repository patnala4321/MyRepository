package mypack2;

import mypack1.*;


public class OtherPack_SubClass extends DataAccess1{
	
	OtherPack_SubClass()
	{
		//DataAccess1 d1=new DataAccess1();
		//System.out.println("Private var =" + pri);
		//System.out.println("default var   =" + defa);
		System.out.println("Protected var =" + protec);
		System.out.println("Public var   =" + pub+"\n");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OtherPack_SubClass osub=new OtherPack_SubClass();

	}

}
