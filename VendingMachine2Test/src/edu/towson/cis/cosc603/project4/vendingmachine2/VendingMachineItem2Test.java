package edu.towson.cis.cosc603.project4.vendingmachine2;

import org.junit.*;

import edu.towson.cis.cosc603.project4.vendingmachine2.VendingMachineItem2;
import static org.junit.Assert.*;

/**
 * The class <code>VendingMachineItem2Test</code> contains tests for the class <code>{@link VendingMachineItem2}</code>.
 *
 * @generatedBy CodePro at 4/5/16 11:51 PM
 * @author fayvado
 * @version $Revision: 1.0 $
 */
public class VendingMachineItem2Test {
	/**
	 * Run the VendingMachineItem2(String,double) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test
	public void testVendingMachineItem2_1()
		throws Exception {
		String name = "";
		double price = 1.0;

		VendingMachineItem2 result = new VendingMachineItem2(name, price);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(1.0, result.getPrice(), 1.0);
	}

	/**
	 * Run the VendingMachineItem2(String,double) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine2.VendingMachineException2.class)
	public void testVendingMachineItem2_2()
		throws Exception {
		String name = "";
		double price = -4.9E-324;

		VendingMachineItem2 result = new VendingMachineItem2(name, price);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		VendingMachineItem2 fixture = new VendingMachineItem2("", 1.0);

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the double getPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test
	public void testGetPrice_1()
		throws Exception {
		VendingMachineItem2 fixture = new VendingMachineItem2("", 1.0);

		double result = fixture.getPrice();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(VendingMachineItem2Test.class);
	}
}