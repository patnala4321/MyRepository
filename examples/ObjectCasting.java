package examples;

class Animal1 {
	
	  public String toString() {
	    return "I am an Animal"; 
	  }
	}

	class Cow1 extends Animal1 {
	   
	  public String toString() {
	    return "I am a Cow"; 
	  }
	}

	public class ObjectCasting {
	  public static void main(String args[]) {
	    Animal1 creature;
	    
	    Cow1 daisy = new Cow1();
	    System.out.println( daisy); // prints: I am a Cow
	    
	    creature = daisy;        // OK   subclass ---> super class
	    System.out.println(creature); // prints: I am a Cow
	    
	    creature = new Animal1();
	    System.out.println(creature); // prints: I am a Animal
	    
	    
//	    daisy = creature;     // Compile-time error, incompatible type
	    if (creature instanceof Animal1) {
	      daisy = (Cow1) creature;   // superclass -->subclass is  not possible
	      System.out.println( "xxx"+  daisy);
	    }
	  }
	}

