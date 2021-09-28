package org.jupiter.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestMethodOrder;
import org.jupiter.service.EmployeeAnnualSalary;

/**
 * Unit test for simple App.
 * write test cases in the different varaities 
 */
//@TestMethodOrder(value =OrderAnnotation.class)
//@TestMethodOrder(value =MethodName.class) default value is randomm best is order annotation
//MethodOrderer.DisplayName.class inner class we have to differente
 @TestMethodOrder(value =MethodOrderer.DisplayName.class)
public class AppTest 
{
	public static  EmployeeAnnualSalary sal;
	  static Double   actaul;
	//class MethodName implements MethodOrderer
	//@BeforeAll---this annotation applicable for only if method is static
	
	//@BeforeEach-->'startUp()' must not be static.
	@BeforeAll
	public static  void startUp() {
	System.out.println("AppTest.startUp()");

     sal=new EmployeeAnnualSalary();
	}
	
	 @org.junit.jupiter.api.Test
	 @DisplayName("correctvalues")
	 @Order(1)
	 //@Tag("uat")
	public void testEmpAnnualSalSignedValues() {
	   actaul=sal.empAnnualSal(600.0, 30, 12);
		double expected=216000.0; 
		Assertions.assertEquals(expected, actaul,"with postivie vaues");
	
			
	}
	 
	    @org.junit.jupiter.api.Test
	    @Disabled
	    @Order(2)
	   // @Tag("test")
		public void testEmpAnnualSalUnsignedValues() {
		   double actaul=sal.empAnnualSal(-600.0, -30, 12);
			double expected=216000.0; 
			assertEquals(expected, actaul,"checking with negative values");
			
		}
	 
	 @org.junit.jupiter.api.Test
	   @Disabled
	   @Order(4)
	 //@Tag("test")
		public void testEmpAnnualSalMixedvales() {
		   double actaul=sal.empAnnualSal(-600.0, 0, -12);
			double expected=216000.0; 
			assertEquals(expected, actaul,"checking with both valid and invalid values");
			
		}
	 
	 @org.junit.jupiter.api.Test
	 @DisplayName(value = "varity with zerovalues")
	 @Order(3)
		public void testEmpAnnualSal() {
		   double actaul=sal.empAnnualSal(0.0, 0, -0);
			double expected=216000.0; 
			assertEquals(expected, actaul,"checking withonly zeros values");
			
		}
	 @org.junit.jupiter.api.Test
	 @DisplayName(value = "errorchecking")
	 @Order(-2) //low values gives first prority like ranks
	 //@Tag("dev")
	 public void testEmployeeAnnualSalValidError() {
		  //executable is functioal interface having execute methods trows trowable
		     assertThrows(ArithmeticException.class, ()->
		    	                                      sal.empAnnualSal(0.0, 30, 3)
		                                              );
		 
	 }
	 
	   //@AfterEach
	 @AfterAll //this annotation applicable for only if method is static
	 public static void endUp() {
			System.out.println("AppTest.endUp()");
	     sal=null;
		}
	
}
