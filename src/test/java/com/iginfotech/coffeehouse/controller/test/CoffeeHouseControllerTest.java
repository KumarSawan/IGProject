package com.iginfotech.coffeehouse.controller.test;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.iginfotech.coffeehouse.controller.CoffeeHouseController;
import com.iginfotech.coffeehouse.model.CoffeeBean;
import com.iginfotech.coffeehouse.model.CustomerBean;
import com.iginfotech.coffeehouse.model.OrderBean;
import com.iginfotech.coffeehouse.model.ReportBean;
import com.iginfotech.coffeehouse.service.CoffeeHouseService;

/**
 * The class <code>CoffeeHouseControllerTest</code> contains tests for the class
 * <code>{@link CoffeeHouseController}</code>.
 *
 * @generatedBy CodePro at 7/3/18 12:00 PM
 * @author KS00508444
 * @version $Revision: 1.0 $
 */
@RunWith(MockitoJUnitRunner.class)
public class CoffeeHouseControllerTest {
	/**
	 * Run the String addCustomerDetailsMap(CustomerBean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/3/18 12:00 PM
	 */
	@Test
	public void testAddCustomerDetailsMap_1() throws Exception {
		
		CoffeeHouseService coffeeHouseServiceMock = mock(CoffeeHouseService.class);
		CustomerBean customerDetails = new CustomerBean();
		customerDetails.setCustName("Kumar Sawan");
		customerDetails.setPhoneNumber("8971957135");
		customerDetails.setEmailId("sawanraj55@gmail.com");
		customerDetails.setDeliveryAddress("Maranga");
		when(coffeeHouseServiceMock.addCustomerDetailsMap(customerDetails))
		.thenReturn("Customer is added successfully.");
		CoffeeHouseController fixture = new CoffeeHouseController(coffeeHouseServiceMock);
		String result = fixture.addCustomerDetailsMap(customerDetails);
		
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
	public void testAddNewCoffeeVarityMap_1() throws Exception {
		CoffeeHouseService coffeeHouseServiceMock=mock(CoffeeHouseService.class);
		CoffeeBean coffeeDetails = new CoffeeBean();
		coffeeDetails.setCoffeeName("Latte");
		coffeeDetails.setCoffeeDescription("Strong Coffee");
		coffeeDetails.setQuantity(10);
		coffeeDetails.setServingsPerDay(150);
		when(coffeeHouseServiceMock.addNewCoffeeVarityMap(coffeeDetails)).thenReturn("New Variety of coffee is added.");
		CoffeeHouseController coffeeHouseController=new CoffeeHouseController(coffeeHouseServiceMock);
		String result =coffeeHouseController .addNewCoffeeVarityMap(coffeeDetails);

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
	public void testGenerateReportMap_1() throws Exception {
		CoffeeHouseController fixture = new CoffeeHouseController();
		fixture.coffeeHouseService = new CoffeeHouseService();
		// ReportBean bean=new ReportBean();

		Map<String, ReportBean> result = fixture.generateReportMap();

		// add additional test code here
		//assertNotNull(result);
		assertEquals(0, result.size());
		//assertTrue(result.containsKey(null));
	}

	/**
	 * Run the CustomerBean getAllCustomerDetails(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/3/18 12:00 PM
	 */
	@Test
	public void testGetAllCustomerDetails_1() throws Exception {
		CoffeeHouseService coffeeHouse=mock(CoffeeHouseService.class);
		//CoffeeHouseController fixture = new CoffeeHouseController();
		//fixture.coffeeHouseService = new CoffeeHouseService();
		String custName = "Sawan";
		String phoneNumber = "8971957135";
		CustomerBean customerDetails = new CustomerBean();
		customerDetails.setCustName("Sawan");
		customerDetails.setPhoneNumber("8971957135");
		customerDetails.setEmailId("sawanraj55@gmail.com");
		customerDetails.setDeliveryAddress("Maranga");
		when(coffeeHouse.getAllCustomerDetails(custName, phoneNumber)).thenReturn(customerDetails);
		CoffeeHouseController fixture=new CoffeeHouseController(coffeeHouse);
		CustomerBean result = fixture.getAllCustomerDetails(custName, phoneNumber);
		assertNotNull(result);
		assertEquals("sawanraj55@gmail.com", result.getEmailId());
	}

	/**
	 * Run the OrderBean processAnOrder(OrderBean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/3/18 12:00 PM
	 */
	@Test
	public void testProcessAnOrder_1() throws Exception {
		//CoffeeHouseController fixture = new CoffeeHouseController();
		//fixture.coffeeHouseService = new CoffeeHouseService();
		
		CoffeeHouseService coffeeHouseService=mock(CoffeeHouseService.class);
		OrderBean orderDetails = new OrderBean();
		List<CoffeeBean> coffeeBeanList = new ArrayList<>();
		CoffeeBean coffeeBean = new CoffeeBean();
		coffeeBean.setCoffeeName("Latte");
		coffeeBean.setQuantity(10);
		coffeeBeanList.add(coffeeBean);
		orderDetails.setCoffee(coffeeBeanList);
		orderDetails.setCustName("sawan");
		orderDetails.setPhoneNumber("8971957135");
		orderDetails.setOrderTime(LocalDateTime.now());
		when(coffeeHouseService.processAnOrder(orderDetails)).thenReturn(orderDetails);
		CoffeeHouseController coffeeHouseController=new CoffeeHouseController(coffeeHouseService);
		OrderBean result = coffeeHouseController.processAnOrder(orderDetails);

		assertNotNull((result.getOrderTime()));
		assertEquals(orderDetails.getCustName(), result.getCustName());
		assertEquals(orderDetails.getCoffee().size(), result.getCoffee().size());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/3/18 12:00 PM
	 */
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 7/3/18 12:00 PM
	 */
	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 *
	 * @generatedBy CodePro at 7/3/18 12:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CoffeeHouseControllerTest.class);
	}
}