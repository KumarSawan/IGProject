package com.iginfotech.coffeehouse.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderBean {

	private String custName;
	private String phoneNumber;
	List<CoffeeBean>coffee=new ArrayList<>();
	private LocalDateTime orderTime;
	
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

	public List<CoffeeBean> getCoffee() {
		return coffee;
	}

	public void setCoffee(List<CoffeeBean> coffee) {
		this.coffee = coffee;
	}

}
