package com.iginfotech.coffeehouse.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public CoffeeHouseService coffeeHouseService;


	@PostMapping(value = "/addCustomerDetailsMap")
	public String addCustomerDetailsMap(@RequestBody CustomerBean customerDetails) {
		String coffeeFlag = coffeeHouseService.addCustomerDetailsMap(customerDetails);
		return coffeeFlag;
	}

	@GetMapping(value = "/getAllCustomerDetails/{custName}/{phoneNumber}")
	public CustomerBean getAllCustomerDetails(@PathVariable("custName") String custName,
			@PathVariable("phoneNumber") String phoneNumber) {
	final CustomerBean custBeanList = coffeeHouseService.getAllCustomerDetails(custName,phoneNumber);
		return custBeanList;

	}
	
	@PostMapping(value = "/addNewCoffeeVarityMap")
	public String addNewCoffeeVarityMap(@RequestBody CoffeeBean coffeeDetails) {
		String coffeeVarityFlag = coffeeHouseService.addNewCoffeeVarityMap(coffeeDetails);
		return coffeeVarityFlag;
	}
	@PostMapping(value = "/processAnOrder")
	public OrderBean processAnOrder(@RequestBody OrderBean orderDetails) {
		OrderBean orderBean = coffeeHouseService.processAnOrder(orderDetails);
		return orderBean;
	}

	@GetMapping(value = "/generateReportMap")
	public Map<String, ReportBean> generateReportMap() {
		Map<String,ReportBean> reportBeanList = coffeeHouseService.generateReportMap();
		return reportBeanList;
	}
}
