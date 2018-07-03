package com.iginfotech.coffeehouse.service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.iginfotech.coffeehouse.model.CoffeeBean;
import com.iginfotech.coffeehouse.model.CustomerBean;
import com.iginfotech.coffeehouse.model.CustomerBeanKey;
import com.iginfotech.coffeehouse.model.OrderBean;
import com.iginfotech.coffeehouse.model.ReportBean;

@Component
public class CoffeeHouseService {
	private static Map<CustomerBeanKey, CustomerBean> customersMap = new HashMap<>();
	private static Map<String, CoffeeBean> coffeeMap = new HashMap<>();
	private static Map<String, ReportBean> reportMap = new HashMap<>();

	public String addCustomerDetailsMap(CustomerBean custBean) {
		CustomerBeanKey custBeanKey = new CustomerBeanKey();
		custBeanKey.setCustName(custBean.getCustName());
		custBeanKey.setPhoneNumber(custBean.getPhoneNumber());
		boolean customerFlag = customersMap.put(custBeanKey, custBean) == null;
		String message;
		if(customerFlag==true){
			message="Customer is added successfully.";
		}else{
			message="Customer already exists.";
		}
		return message;
	}

	public CustomerBean getAllCustomerDetails(String custName, String phoneNumber) {
		CustomerBeanKey custBeanKey = new CustomerBeanKey();
		custBeanKey.setCustName(custName);
		custBeanKey.setPhoneNumber(phoneNumber);
		return customersMap.get(custBeanKey);

	}

	public String addNewCoffeeVarityMap(CoffeeBean coffeeBean) {
		boolean coffeeFlag = coffeeMap.put(coffeeBean.getCoffeeName(), coffeeBean) == null;
		String message;
		if(coffeeFlag){
			message="New Variety of coffee is added.";
		}else{
			message="Coffee variety already exists.";
		}
		ReportBean reportBean = new ReportBean();
		reportBean.setCoffeeName(coffeeBean.getCoffeeName());
		reportBean.setTotalServingsPerDay(coffeeBean.getServingsPerDay());
		reportMap.put(coffeeBean.getCoffeeName(), reportBean);
		return message;

	}

	public OrderBean processAnOrder(OrderBean orderBean) {
		List<CoffeeBean> coffeeListOrdered = orderBean.getCoffee();
		for (CoffeeBean coffeeBean : coffeeListOrdered) {
			CoffeeBean coffeeBeanPresent = coffeeMap.get(coffeeBean.getCoffeeName());
			coffeeBean.setCoffeeDescription(coffeeBeanPresent.getCoffeeDescription());
			coffeeBean.setServingsPerDay(coffeeBeanPresent.getServingsPerDay());
			ReportBean reportBean = reportMap.get(coffeeBean.getCoffeeName());
			int totalQuantitySold = reportBean.getTotalServingsPerDaySold() + coffeeBean.getQuantity();
			reportBean.setTotalServingsPerDaySold(totalQuantitySold);

		}
		orderBean.setOrderTime(LocalDateTime.now());
		return orderBean;
	}

	public Map<String, ReportBean> generateReportMap() {
		return reportMap;
	}

}
