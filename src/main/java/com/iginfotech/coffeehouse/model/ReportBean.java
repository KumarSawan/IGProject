package com.iginfotech.coffeehouse.model;

public class ReportBean {

	private String coffeeName;
	private int totalServingsPerDay;
	private int totalServingsPerDaySold;

	

	public ReportBean() {
		super();
	}

	public ReportBean(String coffeeName, int totalServingsPerDay, int totalServingsPerDaySold) {
		super();
		this.coffeeName = coffeeName;
		this.totalServingsPerDay = totalServingsPerDay;
		this.totalServingsPerDaySold = totalServingsPerDaySold;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public int getTotalServingsPerDay() {
		return totalServingsPerDay;
	}

	public void setTotalServingsPerDay(int totalServingsPerDay) {
		this.totalServingsPerDay = totalServingsPerDay;
	}

	public int getTotalServingsPerDaySold() {
		return totalServingsPerDaySold;
	}

	public void setTotalServingsPerDaySold(int totalServingsPerDaySold) {
		this.totalServingsPerDaySold = totalServingsPerDaySold;
	}
}
