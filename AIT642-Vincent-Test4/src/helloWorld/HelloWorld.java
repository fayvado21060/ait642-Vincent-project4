package helloWorld;

public class HelloWorld {
	private static final String HELLO = "Hello C. King B!";

	public static void main(String[] args) {
		System.out.println(HELLO);
        int sum = 0;
        sum = caluculateSum(sum);
	    System.out.println(sum);
	}
	private static int caluculateSum(int sum) {
		for (int i = 1; i <= 100; i++) {
          sum += i;
          System.out.println(sum);
        }
		return sum;
	}
	}
