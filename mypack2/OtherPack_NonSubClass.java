package mypack2;

import mypack1.DataAccess1;

public class OtherPack_NonSubClass {

	OtherPack_NonSubClass() {
		DataAccess1 d1 = new DataAccess1();
	//	System.out.println("Private var =" + d1.pri);
	//	System.out.println("default var =" + d1.defa);
	//	System.out.println("Protected var =" + d1.protec);
		System.out.println("Public var =" + d1.pub + "\n");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OtherPack_NonSubClass otherPack_Nonsub = new OtherPack_NonSubClass();
	}
}
