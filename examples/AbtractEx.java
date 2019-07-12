package examples;

abstract class Abs1 {
	int a;
	final int b = 20;

	abstract void showAbstract();

	void showConcrete() {
		System.out.println("Concrete method of Super Class Abs1");
	}

}



public class AbtractEx extends Abs1 {

	
	  void showAbstract() {
	  
	  System.out.println("Abstract method of Super Class Abs1");
	  
	  }
	 
	/*void showConcrete() {
		System.out.println("Concrete method of Sub Class AbtractEx");
	}*/

	public static void main(String[] args) {

		// Abs1 abs1=new Abs1(); //cant create object for abstract method

		AbtractEx absEx = new AbtractEx();
		absEx.showAbstract();
		absEx.showConcrete();

	}

}
