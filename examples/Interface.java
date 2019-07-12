package examples;

interface WebDriver {
	void get();

	void close();
	
}

class FireFoxDriver implements WebDriver {
	
	  public void get() {
	  System.out.println("To open Application in firefox browser"); }
	 
	public void close() {
		System.out.println("To close Application in firefox browser");
	}
}

class ChromeDriver implements WebDriver {
	public void get() {
		System.out.println("To open Application in Chrome browser");
	}

	public void close() {
		System.out.println("To close Application in Chrome browser");
	}
}



public class Interface {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get();
		driver.close();
		
		FireFoxDriver ff = new FireFoxDriver();
		ff.get();
		ff.close();


		WebDriver driver2;
		driver2 = new ChromeDriver();
		driver2.get();
		driver2.close();

		
		driver2 = new FireFoxDriver();
		driver2.get();
		driver2.close();
	}
}
