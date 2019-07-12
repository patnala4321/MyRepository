package mypack1;

public class SamePack_SubClass extends DataAccess1 {

	SamePack_SubClass() {
		
		// System.out.println("Private var =" + pri);
		System.out.println("default var   =" + defa);
		System.out.println("Protected var =" + protec);
		System.out.println("Public var   =" + pub+"\n");
	}

	public static void main(String[] args) {

		SamePack_SubClass sub = new SamePack_SubClass();
		// System.out.println("Private var =" + da.pri);
		System.out.println("default var   =" + sub.defa);
		System.out.println("Protected var =" + sub.protec);
		System.out.println("Public var   =" + sub.pub+"\n");

	}
}
