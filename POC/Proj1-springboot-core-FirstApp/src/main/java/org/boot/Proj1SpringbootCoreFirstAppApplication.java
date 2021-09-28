package org.boot;

import org.boot.service.WishMessage;
import org.boot.service.WishesImplManagement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication  // 3 @Componrnscan
public class Proj1SpringbootCoreFirstAppApplication {
              //1
	public static void main(String[] args) { 
		                                         //2
		ApplicationContext ctx=SpringApplication.run(Proj1SpringbootCoreFirstAppApplication.class, args);
		WishMessage wishes= ctx.getBean("msg", WishMessage.class);
		 System.out.println(wishes.getWishes());
	}

}
