package edu.towson.cis.cosc603.project4.vendingmachine2;

import org.junit.*;

import edu.towson.cis.cosc603.project4.vendingmachine2.VendingMachineException2;
import static org.junit.Assert.*;

/**
 * The class <code>VendingMachineException2Test</code> contains tests for the class <code>{@link VendingMachineException2}</code>.
 *
 * @generatedBy CodePro at 4/5/16 11:51 PM
 * @author fayvado
 * @version $Revision: 1.0 $
 */
public class VendingMachineException2Test {
	/**
	 * Run the VendingMachineException2() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test
	public void testVendingMachineException2_1()
		throws Exception {

		VendingMachineException2 result = new VendingMachineException2();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("edu.towson.cis.cosc603.project4.vendingmachine2.VendingMachineException2", result.toString());
		assertEquals(null, result.getLocalizedMessage());
		assertEquals(null, result.getMessage());
	}

	/**
	 * Run the VendingMachineException2(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test
	public void testVendingMachineException2_2()
		throws Exception {
		String reason = "";

		VendingMachineException2 result = new VendingMachineException2(reason);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("edu.towson.cis.cosc603.project4.vendingmachine2.VendingMachineException2: ", result.toString());
		assertEquals("", result.getLocalizedMessage());
		assertEquals("", result.getMessage());
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
		new org.junit.runner.JUnitCore().run(VendingMachineException2Test.class);
	}
}