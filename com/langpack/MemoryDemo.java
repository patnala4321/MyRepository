package com.langpack;

public class MemoryDemo {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		long mem1, mem2;

		Integer someints[] = new Integer[1000];

		System.out.println("Total Memory is  :" + r.totalMemory());

		mem1 = r.freeMemory();
		System.out.println("Initial Free Memory:   " + mem1);

		r.gc();

		mem1 = r.freeMemory();

		System.out.println("Free memory after Garbage collection:  " + mem1);

		for (int i = 0; i < 1000; i++) {
			someints[i] = new Integer(i);
		}

		mem2 = r.freeMemory();

		System.out.println("Free memory after allocation:   " + mem2);

		System.out.println("Memory used by allocation  :     " + (mem1 - mem2));

		// Discard Integers

		for (int i = 0; i < 1000; i++) {
			someints[i] = null;
			r.gc();
		}

		mem2 = r.freeMemory();
		System.out.println("Free Memory after collecting " + "discarded integers :   " + mem2);
	}
}
