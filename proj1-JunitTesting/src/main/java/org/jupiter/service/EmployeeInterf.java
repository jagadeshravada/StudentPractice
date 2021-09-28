package org.jupiter.service;
@FunctionalInterface
public interface EmployeeInterf {
	
	public void salary();
	
	public default void commonFun() {
		System.out.println("common requiremnt");
	}

}
