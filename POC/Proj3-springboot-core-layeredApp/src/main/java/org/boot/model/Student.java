package org.boot.model;

import java.io.Serializable;

public class Student implements Serializable {
	
	private Integer student_id;
	
	private String address;
	private Double fee;
	private String name;
	private String standard;
	public Student() {
		System.out.println("Student.Student()-0 param constructor");
	}
	public Integer getStudent_id() {
		return student_id;
	}
	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", address=" + address + ", fee=" + fee + ", name=" + name
				+ ", standard=" + standard + "]";
	}

	

}
