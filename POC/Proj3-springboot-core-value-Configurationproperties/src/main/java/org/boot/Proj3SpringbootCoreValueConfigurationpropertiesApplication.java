package org.boot;

import org.boot.model.CricketerInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Proj3SpringbootCoreValueConfigurationpropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Proj3SpringbootCoreValueConfigurationpropertiesApplication.class, args);
		CricketerInfo crck=ctx.getBean("info", CricketerInfo.class);
		System.out.println(crck);
	}

}
