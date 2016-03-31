package helloWorld;

public class HelloWorld {
	private static final String HELLO = "Hello Calvin King B!";

	public static void main(String[] args) {
		System.out.println(HELLO);
        int sum = 0;
        sum = caluculateSum(sum);
	    System.out.println(sum);
	    
	    Double opBUO = 0.0;
	    Double ipBUO = 0.2340;
	    Double ipPrecip = 3.0;
	    
	    opBUO = calcBUO(opBUO, ipBUO, ipPrecip);
	 
	    System.out.println("out BUO: " + opBUO);
	    System.out.println("in BUO: " + ipBUO);
	    System.out.println("precip: " + ipPrecip);
	       		
	}
	private static int caluculateSum(int sum) {
		for (int i = 1; i <= 100; i++) {
          sum += i;
          System.out.println(sum);
        }
		return sum;
	}
	private static Double calcBUO(Double opBUO, Double ipBUO, Double ipPrecip) {
//*		opBUO = (-50.0 * (Math.log(1.0 - Math.exp(-ipBUO/50.0)) * Math.exp( -1.175 * (ipPrecip - 0.1))));
		opBUO = calculateopBUO(ipBUO, ipPrecip);
	    return opBUO;
	    		
	}
	/**
	 * @param ipBUO
	 * @param ipPrecip
	 * @return
	 */
	private static Double calculateopBUO(Double ipBUO, Double ipPrecip) {
		Double opBUO;
		opBUO = -50.0 * Math.log(1.0 -(1.0 - Math.exp(-ipBUO/50.0)) * Math.exp( -1.175 * (ipPrecip - 0.1)));
		return opBUO;
	}
	
	
	}
