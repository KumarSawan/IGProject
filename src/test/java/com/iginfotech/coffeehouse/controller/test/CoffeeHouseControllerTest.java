package com.iginfotech.coffeehouse.controller.test;

import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;

import com.iginfotech.coffeehouse.controller.CoffeeHouseController;
import com.iginfotech.coffeehouse.model.CoffeeBean;
import com.iginfotech.coffeehouse.model.CustomerBean;
import com.iginfotech.coffeehouse.model.OrderBean;
import com.iginfotech.coffeehouse.model.ReportBean;
import com.iginfotech.coffeehouse.service.CoffeeHouseService;

/**
 * The class <code>CoffeeHouseControllerTest</code> contains tests for the class <code>{@link CoffeeHouseController}</code>.
 *
 * @generatedBy CodePro at 7/3/18 12:00 PM
 * @author KS00508444
 * @version $Revision: 1.0 $
 */
public class CoffeeHouseControllerTest {
	/**
	 * Run the String addCustomerDetailsMap(CustomerBean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/3/18 12:00 PM
	 */
	@Test
	public void testAddCustomerDetailsMap_1()
		throws Exception {
		CoffeeHouseController fixture = new CoffeeHouseController();
		fixture.coffeeHouseService = new CoffeeHouseService();
		CustomerBean customerDetails = new CustomerBean();

		String result = fixture.addCustomerDetailsMap(customerDetails);

		// add additional test code here
		assertEquals("Customer is added successfully.", result);
	}

	/**
	 * Run the String addNewCoffeeVarityMap(CoffeeBean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/3/18 12:00 PM
	 */
	@Test
	public void testAddNewCoffeeVarityMap_1()
		throws Exception {
		CoffeeHouseController fixture = new CoffeeHouseController();
		fixture.coffeeHouseService = new CoffeeHouseService();
		CoffeeBean coffeeDetails = new CoffeeBean();

		String result = fixture.addNewCoffeeVarityMap(coffeeDetails);

		// add additional test code here
		assertEquals("New Variety of coffee is added.", result);
	}

	/**
	 * Run the Map<String, ReportBean> generateReportMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/3/18 12:00 PM
	 */
	@Test
	public void testGenerateReportMap_1()
		throws Exception {
		CoffeeHouseController fixture = new CoffeeHouseController();
		fixture.coffeeHouseService = new CoffeeHouseService();

		Map<String, ReportBean> result = fixture.generateReportMap();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.containsKey(null));
	}

	/**
	 * Run the CustomerBean getAllCustomerDetails(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/3/18 12:00 PM
	 */
	@Test
	public void testGetAllCustomerDetails_1()
		throws Exception {
		CoffeeHouseController fixture = new CoffeeHouseController();
		fixture.coffeeHouseService = new CoffeeHouseService();
		String custName = "";
		String phoneNumber = "";

		CustomerBean result = fixture.getAllCustomerDetails(custName, phoneNumber);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OrderBean processAnOrder(OrderBean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/3/18 12:00 PM
	 */
	@Test
	public void testProcessAnOrder_1()
		throws Exception {
		CoffeeHouseController fixture = new CoffeeHouseController();
		fixture.coffeeHouseService = new CoffeeHouseService();
		OrderBean orderDetails = new OrderBean();

		OrderBean result = fixture.processAnOrder(orderDetails);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCustName());
		assertEquals(null, result.getPhoneNumber());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/3/18 12:00 PM
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
	 * @generatedBy CodePro at 7/3/18 12:00 PM
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
	 * @generatedBy CodePro at 7/3/18 12:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CoffeeHouseControllerTest.class);
	}
}