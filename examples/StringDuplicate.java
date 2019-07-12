package examples;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String company = "Persistent Systems Limited Persistent Organisation";

		String splitCompany[] = company.split(" ");

		for (int i = 0; i < splitCompany.length; i++) {
			System.out.println(splitCompany[i]);
		}

		for (int i = 0; i < splitCompany.length; i++) {
			for (int j =  i+1; j < splitCompany.length; j++) {
				if (splitCompany[i].equals(splitCompany[j])) {
					System.out.println("Duplicate  is  " + splitCompany[i]);
				}
			}
		}

	}

}
