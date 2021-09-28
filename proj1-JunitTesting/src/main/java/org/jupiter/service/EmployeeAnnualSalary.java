package org.jupiter.service;
//service class or main class
public class EmployeeAnnualSalary {
	
	public double empAnnualSal(double daliypay,int days, int months) {
		 
		//&&--> mandatory both cond as to true || any one can be true 
		if(daliypay<=0 || days<=0 || months<=0)
			
			   throw new IllegalArgumentException("enter valid inputs");
		else 
			
		return daliypay*days*months;
		
	}

}
