package edu.towson.cis.cosc603.project4.vendingmachine2;

import org.junit.*;

import edu.towson.cis.cosc603.project4.vendingmachine2.VendingMachine2;
import edu.towson.cis.cosc603.project4.vendingmachine2.VendingMachineItem2;
import static org.junit.Assert.*;

/**
 * The class <code>VendingMachine2Test</code> contains tests for the class <code>{@link VendingMachine2}</code>.
 *
 * @generatedBy CodePro at 4/5/16 11:51 PM
 * @author fayvado
 * @version $Revision: 1.0 $
 */
public class VendingMachine2Test {
	/**
	 * Run the VendingMachine2() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test
	public void testVendingMachine2_1()
		throws Exception {

		VendingMachine2 result = new VendingMachine2();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getBalance(), 1.0);
		assertEquals(0.0, result.returnChange(), 1.0);
	}

	/**
	 * Run the VendingMachine2() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test
	public void testVendingMachine2_2()
		throws Exception {

		VendingMachine2 result = new VendingMachine2();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getBalance(), 1.0);
		assertEquals(0.0, result.returnChange(), 1.0);
	}

	/**
	 * Run the void addItem(VendingMachineItem2,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test
	public void testAddItem_1()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.balance = 1.0;
		VendingMachineItem2 item = new VendingMachineItem2("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem2,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test
	public void testAddItem_2()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.balance = 1.0;
		VendingMachineItem2 item = new VendingMachineItem2("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem2,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine2.VendingMachineException2.class)
	public void testAddItem_3()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.balance = 1.0;
		VendingMachineItem2 item = new VendingMachineItem2("", 1.0);
		String code = "";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the double getBalance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test
	public void testGetBalance_1()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.balance = 1.0;

		double result = fixture.getBalance();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the VendingMachineItem2 getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test
	public void testGetItem_1()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem2 result = fixture.getItem(code);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the VendingMachineItem2 getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine2.VendingMachineException2.class)
	public void testGetItem_2()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem2 result = fixture.getItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test
	public void testInsertMoney_1()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.balance = 1.0;
		double amount = 1.0;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine2.VendingMachineException2.class)
	public void testInsertMoney_2()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.balance = 1.0;
		double amount = -4.9E-324;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test
	public void testMakePurchase_1()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.balance = Double.MAX_VALUE;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test
	public void testMakePurchase_2()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.balance = 1.0;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test
	public void testMakePurchase_3()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.balance = 1.0;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine2.VendingMachineException2.class)
	public void testMakePurchase_4()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.balance = 1.0;
		String code = "";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the VendingMachineItem2 removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine2.VendingMachineException2.class)
	public void testRemoveItem_1()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem2 result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem2 removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine2.VendingMachineException2.class)
	public void testRemoveItem_2()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem2 result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem2 removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine2.VendingMachineException2.class)
	public void testRemoveItem_3()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem2 result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the double returnChange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/5/16 11:51 PM
	 */
	@Test
	public void testReturnChange_1()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.balance = 1.0;

		double result = fixture.returnChange();

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
		new org.junit.runner.JUnitCore().run(VendingMachine2Test.class);
	}
}