package com.iginfotech.coffeehouse.controller.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;
import com.iginfotech.coffeehouse.model.CoffeeBean;
import com.iginfotech.coffeehouse.model.CustomerBean;
import com.iginfotech.coffeehouse.model.OrderBean;
import com.iginfotech.coffeehouse.model.ReportBean;
import com.iginfotech.coffeehouse.service.CoffeeHouseService;

/**
 * The class <code>CoffeeHouseServiceTest</code> contains tests for the class <code>{@link CoffeeHouseService}</code>.
 *
 * @generatedBy CodePro at 7/3/18 12:00 PM
 * @author KS00508444
 * @version $Revision: 1.0 $
 */
public class CoffeeHouseServiceTest {
	/**
	 * Run the CoffeeHouseService() constructor test.
	 *
	 * @generatedBy CodePro at 7/3/18 12:00 PM
	 */
	@Test
	public void testCoffeeHouseService_1()
		throws Exception {
		CoffeeHouseService result = new CoffeeHouseService();
		assertNotNull(result);
		// add additional test code here
	}

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
		CoffeeHouseService fixture = new CoffeeHouseService();
		CustomerBean custBean = new CustomerBean("sawan", "8971957135", "sawan55@gmail.com", "Bangalore");

		String result = fixture.addCustomerDetailsMap(custBean);
		assertEquals("Customer is added successfully.", result);
	}

	/**
	 * Run the String addCustomerDetailsMap(CustomerBean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/3/18 12:00 PM
	 */
	@Test
	public void testAddCustomerDetailsMap_2()
		throws Exception {
		CoffeeHouseService fixture = new CoffeeHouseService();
		CustomerBean custBean = new CustomerBean("sawan", "8971957135", "sawan55@gmail.com", "Bangalore");

		String result = fixture.addCustomerDetailsMap(custBean);
		assertEquals("Customer already exists.", result);
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
		CoffeeHouseService fixture = new CoffeeHouseService();
		CoffeeBean coffeeBean = new CoffeeBean("Latte", "Strong", 150, 1);

		String result = fixture.addNewCoffeeVarityMap(coffeeBean);
		assertEquals("New Variety of coffee is added.", result);
	}

	/**
	 * Run the String addNewCoffeeVarityMap(CoffeeBean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/3/18 12:00 PM
	 */
	@Test
	public void testAddNewCoffeeVarityMap_2()
		throws Exception {
		CoffeeHouseService fixture = new CoffeeHouseService();
		CoffeeBean coffeeBean = new CoffeeBean("Latte", "Strong", 150, 1);

		String result = fixture.addNewCoffeeVarityMap(coffeeBean);
		assertEquals("Coffee variety already exists.", result);
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
		CoffeeHouseService fixture = new CoffeeHouseService();

		Map<String, ReportBean> result = fixture.generateReportMap();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.containsKey("Latte"));
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
		CoffeeHouseService fixture = new CoffeeHouseService();
		String custName = "sawan";
		String phoneNumber = "8971957135";

		CustomerBean result = fixture.getAllCustomerDetails(custName, phoneNumber);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CustomerBean [custName=sawan, phoneNumber=8971957135, emailId=sawan55@gmail.com, deliveryAddress=Bangalore]", result.toString());
		assertEquals("sawan", result.getCustName());
		assertEquals("8971957135", result.getPhoneNumber());
		assertEquals("sawan55@gmail.com", result.getEmailId());
		assertEquals("Bangalore", result.getDeliveryAddress());
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
		CoffeeHouseService fixture = new CoffeeHouseService();
		//OrderBean orderBean = new OrderBean();
		OrderBean orderDetails = new OrderBean();
		List<CoffeeBean> coffeeBeanList=new ArrayList<>();
		CoffeeBean coffeeBean=new CoffeeBean();
		coffeeBean.setCoffeeName("Latte");
		coffeeBean.setQuantity(10);
		coffeeBeanList.add(coffeeBean);
		orderDetails.setCoffee(coffeeBeanList);
		orderDetails.setCustName("sawan");
		orderDetails.setPhoneNumber("8971957135");

		OrderBean result = fixture.processAnOrder(orderDetails);
		assertNotNull(result.getOrderTime());
		assertEquals("sawan", result.getCustName());
		assertEquals(orderDetails.getCoffee().size(), result.getCoffee().size());
	}

	/**
	 * Run the OrderBean processAnOrder(OrderBean) method test.
	 *
	 * @throws Exception
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
		new org.junit.runner.JUnitCore().run(CoffeeHouseServiceTest.class);
	}
}