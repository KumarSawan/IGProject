package com.iginfotech.coffeehouse.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

import com.iginfotech.coffeehouse.model.CoffeeBean;
import com.iginfotech.coffeehouse.model.CustomerBean;
import com.iginfotech.coffeehouse.model.OrderBean;

@Component
public class CoffeeHouseService {

	private static Set<CustomerBean> customersSet = new HashSet<>();
	private static List<CoffeeBean> coffeeList = new ArrayList<>();
	private static List<OrderBean> orderList = new ArrayList<>();
	private static Map<String, Integer> coffeeBeanMap = new TreeMap<>();
	private static Map<String, Integer> dailySellMap = new TreeMap<>();

	public boolean addCustomerDetails(CustomerBean custBean) {
		boolean customerFlag = customersSet.add(custBean);
		return customerFlag;
	}

	public Set<CustomerBean> getAllCustomerDetails() {
		return customersSet;

	}

	public boolean addNewCoffeeVarity(CoffeeBean coffeeBean) {
		boolean coffeeVarityFlag;
		if (coffeeBeanMap.containsKey(coffeeBean.getCoffeeName())) {
			coffeeVarityFlag = false;
		} else {
			coffeeBeanMap.put(coffeeBean.getCoffeeName(), coffeeBean.getServingsPerDay());
			coffeeList.add(coffeeBean);
			coffeeVarityFlag = true;
		}
		return coffeeVarityFlag;

	}

	public void processAnOrder(OrderBean orderBean) {
		orderList.add(orderBean);

	}

	public void generateReport() {

	}

	public static Map<String, Integer> getCoffeeBeanMap() {
		return coffeeBeanMap;
	}

	public static void setCoffeeBeanMap(Map<String, Integer> coffeeBeanMap) {
		CoffeeHouseService.coffeeBeanMap = coffeeBeanMap;
	}

	public static Map<String, Integer> getDailySellMap() {
		return dailySellMap;
	}

	public static void setDailySellMap(Map<String, Integer> dailySellMap) {
		CoffeeHouseService.dailySellMap = dailySellMap;
	}

}
