package com.langpack;

public class PackTest {

	public static void main(String[] args) {

		Package pkgs[];

		pkgs = Package.getPackages();

		for (int i = 0; i < pkgs.length; i++) {
			System.out.println(pkgs[i].getName() + "--" + pkgs[i].getImplementationTitle() + "--"
					+ pkgs[i].getImplementationVendor() + "--" + pkgs[i].getImplementationVersion());

		}

	}

}
