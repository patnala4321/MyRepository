package com.langpack;

public class ProcessBuilderDemo {

	public static void main(String[] args) {
		try {
			
			ProcessBuilder proc=new ProcessBuilder("notepad.exe");
			proc.start();
			}catch(Exception e)
		{
			System.out.println("Error executing notepad");
		}

	}
}
