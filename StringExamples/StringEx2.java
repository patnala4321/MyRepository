package StringExamples;

public class StringEx2 {

	public static void main(String[] args) {
		String s = "Now is the time for all good men";
		System.out.println(s);
		System.out.println("indexOf(t)=" + s.indexOf('t'));
		System.out.println("lastIndexOf(t)=" + s.lastIndexOf('t'));
		System.out.println("indexOf(the)=" + s.indexOf("the"));
		System.out.println("indexOf(t,10)=" + s.indexOf('t', 10));
		System.out.println("lastIndexOf(e,10)=" + s.lastIndexOf('e', 32));
		//System.out.println("indexOf(the,10)=" + s.indexOf("the", 10));
	//	System.out.println("lastIndexOf(the,60)=" + s.lastIndexOf("the", 60));
	}

}
