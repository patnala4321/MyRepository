package mypack1;

public class DataAccess1 {

	private int pri = 10;
	int defa = 20;
	protected int protec = 30;
	public int pub = 40;

	public DataAccess1() {
		System.out.println("Private var  =" + pri);
		System.out.println("default var   =" + defa);
		System.out.println("Protected var =" + protec);
		System.out.println("Public var   =" + pub+"\n");
	}

	public static void main(String[] args) {

		DataAccess1 da = new DataAccess1();
		System.out.println("Private var  =" + da.pri);
		System.out.println("default var   =" + da.defa);
		System.out.println("Protected var =" + da.protec);
		System.out.println("Public var   =" + da.pub+"\n");

	}

}
