package com.iginfotech.coffeehouse.model;


public class CoffeeBean {
	
	private String coffeeName;
	private String coffeeDescription;
	private int quantity;
	private int servingsPerDay;
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coffeeDescription == null) ? 0 : coffeeDescription.hashCode());
		result = prime * result + ((coffeeName == null) ? 0 : coffeeName.hashCode());
		result = prime * result + quantity;
		result = prime * result + servingsPerDay;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CoffeeBean other = (CoffeeBean) obj;
		if (coffeeDescription == null) {
			if (other.coffeeDescription != null)
				return false;
		} else if (!coffeeDescription.equals(other.coffeeDescription))
			return false;
		if (coffeeName == null) {
			if (other.coffeeName != null)
				return false;
		} else if (!coffeeName.equals(other.coffeeName))
			return false;
		if (quantity != other.quantity)
			return false;
		if (servingsPerDay != other.servingsPerDay)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CoffeeBean [coffeeName=" + coffeeName + ", coffeeDescription=" + coffeeDescription + ", quantity="
				+ quantity + ", servingsPerDay=" + servingsPerDay + "]";
	}
	public CoffeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CoffeeBean(String coffeeName, String coffeeDescription, int quantity, int servingsPerDay) {
		super();
		this.coffeeName = coffeeName;
		this.coffeeDescription = coffeeDescription;
		this.quantity = quantity;
		this.servingsPerDay = servingsPerDay;
	}

}
