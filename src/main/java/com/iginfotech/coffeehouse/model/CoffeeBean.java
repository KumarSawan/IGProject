package com.iginfotech.coffeehouse.model;

public class CoffeeBean {
	
	private String coffeeName;
	private String coffeeDescription;
	private int servingsPerDay;
	
	public String getCoffeeName() {
		return coffeeName;
	}
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	public String getCoffeeDescription() {
		return coffeeDescription;
	}
	public void setCoffeeDescription(String coffeeDescription) {
		this.coffeeDescription = coffeeDescription;
	}
	public int getServingsPerDay() {
		return servingsPerDay;
	}
	public void setServingsPerDay(int servingsPerDay) {
		this.servingsPerDay = servingsPerDay;
	}

}
