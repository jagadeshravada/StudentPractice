package org.jupiter.service;

import java.util.function.Predicate;

public class Services  {
	 public String str;
	
	public Services(String str) {
		
		 this.str=str;
		 System.out.println(str);
	}

	

	public static void main(String[] args) {
	  
		 StudentService ser= Services::new;
		 ser.getService("hii");
		 
		 System.out.println();
		
		
	}



	

}
