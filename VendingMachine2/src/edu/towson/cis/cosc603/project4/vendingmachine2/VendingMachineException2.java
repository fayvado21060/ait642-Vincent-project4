package edu.towson.cis.cosc603.project4.vendingmachine2;

/**
 * This class is for exceptions thrown by the vending machine class.
 * Examples of such exceptions include giving a price that is < 0, trying to
 * add an item that is already in a certain spot, etc.
 *
 */
public class VendingMachineException2 extends RuntimeException {
	// Leave the line below in your code. You won't need to know what it is for
	// this course.
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * Default constructor
	 */
	public VendingMachineException2() {
	
	}

	/**
	 * Constructor with an error message
	 * @param reason The error message for the exception
	 */
	public VendingMachineException2(String reason) {
		super(reason);
	}
}
