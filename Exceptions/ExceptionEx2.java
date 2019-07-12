package Exceptions;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.DataInputStream;

public class ExceptionEx2 {

	public static void main(String[] args) throws IOException {

		InputStream input = new FileInputStream("D:\\textout.txt");

		DataInputStream inst = new DataInputStream(input);

		int count = input.available();

		byte[] ary = new byte[count];

		inst.read(ary);

		for (byte bt : ary) {

			char k = (char) bt;

			System.out.print(k);
		}

	}
}
