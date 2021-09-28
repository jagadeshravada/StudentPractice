package org.boot.model;

import java.io.Serializable;
import java.util.Date;


public class Student implements Serializable {
    private Integer id;
    private String name;
    private Double fee;
    private Address address;
    private String standard;
    private Date dob;
    
    
     
    public Student(Integer id, String name, Double fee, Address address, String standard) {
		//super();
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.address = address;
		this.standard = standard;
	}
  

	public Student(Integer id, String name, Double fee, Address address, String standard, Date dob) {
		//super();
	
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.address = address;
		this.standard = standard;
		this.dob = dob;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + ", address=" + address + ", standard="
				+ standard + ", dob=" + dob + "]";
	}

	
    
}
