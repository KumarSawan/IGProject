package com.iginfotech.coffeehouse.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iginfotech.coffeehouse.model.CoffeeBean;
import com.iginfotech.coffeehouse.model.CustomerBean;
import com.iginfotech.coffeehouse.model.OrderBean;
import com.iginfotech.coffeehouse.model.ReportBean;
import com.iginfotech.coffeehouse.service.CoffeeHouseService;


@RestController
@RequestMapping("/CoffeeHouse")
public class CoffeeHouseController {

	@Autowired
	CoffeeHouseService coffeeHouseService;

	@RequestMapping(value = "/addCustomerDetails", method = RequestMethod.POST)
	public String addCustomerDetails(@RequestBody String customerDetails) throws JSONException {
		JSONObject customerDetailsJson = new JSONObject(customerDetails);
		CustomerBean custBean = new CustomerBean();
		custBean.setCustName(customerDetailsJson.getString("custName"));
		custBean.setPhoneNumber(customerDetailsJson.getString("phoneNumber"));
		boolean customerFlag = coffeeHouseService.addCustomerDetails(custBean);
		String customerMessage;
		if (customerFlag == true) {
			customerMessage = "Customer is added successfully.";
		} else {
			customerMessage = "Customer already exists.";
		}

		return customerMessage;
	}

	@RequestMapping(value = "/getAllCustomerDetails",method = RequestMethod.GET)
	public Set<CustomerBean> getAllCustomerDetails() {
		final Set<CustomerBean> custBeanList = coffeeHouseService.getAllCustomerDetails();
		return custBeanList;

	}

	@RequestMapping(value = "/addNewCoffeeVarity", method = RequestMethod.POST)
	public String addNewCoffeeVarity(@RequestBody String coffeeDetails) throws JSONException {
		JSONObject coffeeDetailsJson = new JSONObject(coffeeDetails);
		CoffeeBean coffeeBean = new CoffeeBean();
		coffeeBean.setCoffeeName(coffeeDetailsJson.getString("coffeeName"));
		coffeeBean.setCoffeeDescription(coffeeDetailsJson.getString("coffeeDescription"));
		coffeeBean.setServingsPerDay(coffeeDetailsJson.getInt("servingsPerDay"));
		boolean coffeeVarityFlag = coffeeHouseService.addNewCoffeeVarity(coffeeBean);
		String message;
		if (coffeeVarityFlag == true) {
			message = "New coffee variety is added.";
		} else {
			message = "Coffee variety already exists.";
		}
		return message;
	}

	@RequestMapping(value = "/processAnOrder", method = RequestMethod.POST)
	public OrderBean processAnOrder(@RequestBody String orderDetails) throws JSONException {
		JSONObject orderDetailsJson = new JSONObject(orderDetails);
		OrderBean orderBean = new OrderBean();
		orderBean.setCustName(orderDetailsJson.getString("custName"));
		orderBean.setPhoneNumber(orderDetailsJson.getString("phoneNumber"));
		JSONArray coffeeArray = orderDetailsJson.getJSONArray("coffee");
		HashMap<String, Integer> coffeeMap = new HashMap<>();
		for (int i = 0; i < coffeeArray.length(); i++) {
			JSONObject coffeeArrayObject = coffeeArray.getJSONObject(i);
			coffeeMap.put(coffeeArrayObject.getString("coffeeName"), coffeeArrayObject.getInt("quantity"));
			if (CoffeeHouseService.getDailySellMap().get(coffeeArrayObject.getString("coffeeName")) != null) {
				int quantity = CoffeeHouseService.getDailySellMap().get(coffeeArrayObject.getString("coffeeName"))
						+ coffeeArrayObject.getInt("quantity");
				CoffeeHouseService.getDailySellMap().put(coffeeArrayObject.getString("coffeeName"), quantity);
			} else {
				CoffeeHouseService.getDailySellMap().put(coffeeArrayObject.getString("coffeeName"), coffeeArrayObject.getInt("quantity"));
			}
		}
		orderBean.setOrderedCoffee(coffeeMap);
		orderBean.setOrderTime(LocalDateTime.now());
		coffeeHouseService.processAnOrder(orderBean);
		return orderBean;
	}

	@RequestMapping(value = "/generateReport", method = RequestMethod.GET)
	public List<ReportBean> generateReport() {
		List<ReportBean> reportBeanList = new ArrayList<>();
		Iterator<Entry<String, Integer>> dailySellMapIterator = CoffeeHouseService.getDailySellMap().entrySet().iterator();
		Iterator<Entry<String, Integer>> coffeeBeanMapIterator = CoffeeHouseService.getCoffeeBeanMap().entrySet()
				.iterator();
		while (dailySellMapIterator.hasNext() && coffeeBeanMapIterator.hasNext()) {
			Map.Entry<String, Integer> dailySellMapObject = (Map.Entry<String, Integer>) dailySellMapIterator.next();
			Map.Entry<String, Integer> coffeeBeanMapObject = (Map.Entry<String, Integer>) coffeeBeanMapIterator.next();
			ReportBean reportBean = new ReportBean();
			reportBean.setCoffeeName((String) dailySellMapObject.getKey());
			reportBean.setTotalServingsPerDaySold((int) dailySellMapObject.getValue());
			reportBean.setTotalServingsPerDay((int) coffeeBeanMapObject.getValue());
			reportBeanList.add(reportBean);
		}
		return reportBeanList;
	}
}
