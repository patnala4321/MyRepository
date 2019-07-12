package com.langpack;


/*There are three types of built-in ClassLoader in Java:

Bootstrap Class Loader – It loads JDK internal classes, typically loads rt.jar and other core classes for example java.lang.* package classes
Extensions Class Loader – It loads classes from the JDK extensions directory, usually $JAVA_HOME/lib/ext directory.
System Class Loader – It loads classes from the current classpath that can be set while invoking a program using -cp or -classpath command line options.
*/

public class ClassLoaderTest {

	public static void main(String[] args) {

		System.out.println("class loader for HashMap: "
				+ java.util.HashMap.class.getClassLoader());
		/*
		 * System.out.println("class loader for DNSNameService: " +
		 * sun.net.spi.nameservice.dns.DNSNameService.class .getClassLoader());
		 */
		System.out.println("class loader for this class: "
				+ ClassLoaderTest.class.getClassLoader());

		/*
		 * System.out.println(com.mysql.jdbc.Blob.class.getClassLoader());
		 */
	}

}