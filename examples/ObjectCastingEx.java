package examples;

class Animal {
}

class Cow extends Animal {
}

public class ObjectCastingEx {

	public static void main(String args[]) {
		Animal creature;                      //creature is the super class reference
		Cow daisy = new Cow();                //daisy is the sub-class reference
		
		creature = daisy; // OK
		
		creature = new Animal();
		
		// daisy = creature; // Compile-time error, incompatible type
		daisy = (Cow) creature; // OK at Compile-time, but it throws exceptions at run time.
	}

}
