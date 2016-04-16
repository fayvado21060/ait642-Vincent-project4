package edu.towson.cis.cosc603.project4.vendingmachine2;

import org.junit.*;

import edu.towson.cis.cosc603.project4.vendingmachine2.VendingMachine2;
import edu.towson.cis.cosc603.project4.vendingmachine2.VendingMachineItem2;
import static org.junit.Assert.*;

/**
 * The class <code>VendingMachine2Test</code> contains tests for the class <code>{@link VendingMachine2}</code>.
 *
 * @generatedBy CodePro at 4/5/16 11:51 PM
 * @author Faye Vincent
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
	
	/**	
	*  Declares necessary test objects	
	*/	
	VendingMachineItem2 myItemA, myItemB,
	                    myItemC, myItemD,
	                    myItemE, myItemF;
		
	@Test
	public void testAddItemA(){
		VendingMachine2 myVendingMachineA = new VendingMachine2();
		myVendingMachineA.addItem(myItemA, "A");
		assertEquals(myItemA,myVendingMachineA.getItem("A"));
		myVendingMachineA.addItem(myItemB, "B");
		assertEquals(myItemB,myVendingMachineA.getItem("B"));
		myVendingMachineA.addItem(myItemC, "C");
		assertEquals(myItemC,myVendingMachineA.getItem("C"));
		myVendingMachineA.addItem(myItemD, "D");
		assertEquals(myItemD,myVendingMachineA.getItem("D"));
	}
	
	@Test (expected = VendingMachineException2.class)
	public void testAddItemExceptionA() {
		VendingMachine2 myVendingMachineB = new VendingMachine2();

		myVendingMachineB.addItem(myItemB, "A");
		myVendingMachineB.addItem(myItemB, "A");
		}
	
	@Test (expected = VendingMachineException2.class)
	public void testAddItemExceptionB() {
		VendingMachine2 myVendingMachineB = new VendingMachine2();
		myVendingMachineB.addItem(myItemA, "A");
		myVendingMachineB.addItem(myItemB, "B");
		myVendingMachineB.addItem(myItemC, "C");
		myVendingMachineB.addItem(myItemD, "E");
		}
	
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
		VendingMachineItem2 item = new VendingMachineItem2("Soda", 1.0);
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
		VendingMachineItem2 item = new VendingMachineItem2("Soda", 1.0);
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
	@Test(expected = VendingMachineException2.class)
	public void testAddItem_3()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.balance = 1.0;
		VendingMachineItem2 item = new VendingMachineItem2("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}
		
	@Test
	public void testAddItem_4()
		throws Exception {
		VendingMachine2 vendingMachine2 = new VendingMachine2();
		VendingMachineItem2 item = new VendingMachineItem2("Soda",1.0);
		String code = "B";
		vendingMachine2.addItem(item, code);
	}

	@Test
	public void testAddItem_5()
		throws Exception {
		VendingMachine2 vendingMachine2 = new VendingMachine2();
		VendingMachineItem2 item = new VendingMachineItem2("Soda",1.0);
		String code = "C";
		vendingMachine2.addItem(item, code);
	}

	@Test
	public void testAddItem_6()
		throws Exception {
		VendingMachine2 vendingMachine2 = new VendingMachine2();
		VendingMachineItem2 item = new VendingMachineItem2("Soda",1.0);
		String code = "D";
		vendingMachine2.addItem(item, code);
		}
			
	@Test
	public void testRemomveItem_1()
		throws Exception {
	
		VendingMachine2 vendingMachine3 = new VendingMachine2();
		vendingMachine3.balance = 2.0;
		vendingMachine3.addItem(myItemA,"A");
		vendingMachine3.addItem(myItemA,"B");
		vendingMachine3.addItem(myItemA,"D");
		vendingMachine3.removeItem("A");				
	}
	
	@Test(expected = VendingMachineException2.class)
	public void testRemomveItem_2()
		throws Exception {
	
		VendingMachine2 vendingMachine4 = new VendingMachine2();
		vendingMachine4.balance = 2.0;
		vendingMachine4.addItem(myItemA,"A");
		vendingMachine4.addItem(myItemA,"B");
		vendingMachine4.addItem(myItemA,"D");
		vendingMachine4.removeItem("C");				
	}

	@Test
	public void testVendingMachine2_3()
		throws Exception {
		VendingMachine2 vendingMachine2 = new VendingMachine2();
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
	public void testMakePurchase
()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.balance = 1.0;
		String code = "";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertTrue(result);
	}

	@Test
	public void testMakePurchase_5()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		String code = "B";
		fixture.balance = 0.0;

		boolean result = fixture.makePurchase(code);
		assertFalse(result);
	}
	@Test
	public void testMakePurchase_6()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.addItem(myItemA, "A");
		fixture.balance = 20.0;
        boolean result = fixture.makePurchase("A");
        assertTrue(result);
	}
	
	@Test
	public void testMakePurchase_7()
		throws Exception {
		VendingMachine2 fixture = new VendingMachine2();
		fixture.addItem(myItemA, "B");
		fixture.balance = 1.50;
        boolean result = fixture.makePurchase("B");
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
		myItemA = new VendingMachineItem2("coke", 1.50);
		myItemB = new VendingMachineItem2("pepsi", 1.50);
		myItemC = new VendingMachineItem2("tab", 1.50);
		myItemD = new VendingMachineItem2("dew", 1.50);
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