package Test4;

public class MainPart {

private static final String HERE = "Testing starts here";

	public static void main(String[] args) {
	    
	    int sumOutput = 0;
	    String someNumbers = "1+6+12";
	    
		System.out.println(HERE);
		
		Calculator myCalculator = new Calculator();
		
		sumOutput = myCalculator.evaluate(someNumbers);
		System.out.println(someNumbers + "=" + sumOutput); 
	}	
	}

	