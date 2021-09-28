package org.jupiter.service;

@FunctionalInterface
public interface StudentService {
	public static final Integer no=120;
	//by default interface methods are public abstract
	//public abstract void service(int a,int b);
	
	public Services getService(String s);  

 // from java8 
	public default  void commonFun() {
		System.out.println("adding new functionality");
	}
	public static void addition(int a,int b) {
		
		System.out.println("addtion of two numbers::"+(a+b));
	}

}


