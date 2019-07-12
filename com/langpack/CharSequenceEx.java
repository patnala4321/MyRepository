package com.langpack;

class A {
	public void dumpSeq(CharSequence cs) {
		System.out.println("\"length = \"" + cs.length());
		System.out.println("\"first char = \"" + cs.charAt(0));
		System.out.println("\"string = \"" + cs);

		int numChars = cs.length();
		for (int i = 0; i < numChars; i++) {
			System.out.println("\"subsequence:\"" + cs.subSequence(0, i + 1));
		}
	}
}

class CharSequenceEx {
	public static void main(String args[]) {
		String s = "\"test\"";
		A a = new A();
		a.dumpSeq(s);
// StringBuffer
		StringBuffer sb = new StringBuffer("\"ing\"");
		a.dumpSeq(sb);
	}
}