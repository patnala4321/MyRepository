package examples;

abstract class Bank {
	abstract void credit();

	abstract void debit();
	
	void showAbstract()
	{
		System.out.println("Abstract Class");
	}

}

class HDFC extends Bank {
	void credit() {
		System.out.println("Ammount credit from HDFC");
	}

	void debit() {
		System.out.println("Amount debited from HDFC");
	}

	void show() {
		System.out.println("HDFC");
	}
}

class ICICI extends Bank {
	void credit() {
		System.out.println("Ammount credit from ICICI");
	}

	void debit() {
		System.out.println("Amount debited from ICICI");
	}

	void display() {
		System.out.println("ICICI");
	}
}

public class TestBank {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.credit();
		h.debit();
		h.show();
		h.showAbstract();
		ICICI i = new ICICI();
		i.credit();
		i.debit();
		i.display();
		i.showAbstract();
		

		Bank b;

		b = new HDFC();
		b.credit();
		b.debit();
	    //b.show();   can't be accessible
		b.showAbstract();
		

		b = new ICICI();
		b.credit();
		b.debit();
		//b.display(); can't be accessible
		b.showAbstract();

	}

}
