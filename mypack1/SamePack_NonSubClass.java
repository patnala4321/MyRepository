package mypack1;

public class SamePack_NonSubClass {
	SamePack_NonSubClass() {
		DataAccess1 da1 = new DataAccess1();
		// System.out.println("Private var =" + pri);
		System.out.println("default var   =" + da1.defa);
		System.out.println("Protected var =" + da1.protec);
		System.out.println("Public var   =" + da1.pub + "\n");
	}

	public static void main(String[] args) {

		DataAccess1 da1=new DataAccess1();
		SamePack_NonSubClass non_sub=new SamePack_NonSubClass();
		
		// System.out.println("Private var =" + da.pri);
		System.out.println("default var   =" + da1.defa);
		System.out.println("Protected var =" + da1.protec);
		System.out.println("Public var   =" + da1.pub+"\n");

	}
}