package com.iginfotech.coffeehouse.model;

public class CustomerBeanKey {
	private String custName;
	private String phoneNumber;
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
	public CustomerBeanKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerBeanKey(String custName, String phoneNumber) {
		super();
		this.custName = custName;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "CustomerBeanKey [custName=" + custName + ", phoneNumber=" + phoneNumber + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
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
		CustomerBeanKey other = (CustomerBeanKey) obj;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}
}
