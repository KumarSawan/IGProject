package com.iginfotech.coffeehouse.model;

import java.time.LocalDateTime;
import java.util.HashMap;

public class OrderBean {

	private String custName;
	private String phoneNumber;
	private HashMap<String, Integer> orderedCoffee = new HashMap<>();
	private LocalDateTime orderTime;

	public HashMap<String, Integer> getOrderedCoffee() {
		return orderedCoffee;
	}

	public void setOrderedCoffee(HashMap<String, Integer> orderedCoffee) {
		this.orderedCoffee = orderedCoffee;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDateTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalDateTime localDateTime) {
		this.orderTime = localDateTime;
	}

}
