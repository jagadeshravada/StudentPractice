package org.boot.model;

public class Address {
	
	private String state;
	private Integer pincode;
	private  Long phoneNo;
	public Address(String state, Integer pincode, Long phoneNo) {
		//super();
		this.state = state;
		this.pincode = pincode;
		this.phoneNo = phoneNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", pincode=" + pincode + ", phoneNo=" + phoneNo + "]";
	}
	
	
	

}
