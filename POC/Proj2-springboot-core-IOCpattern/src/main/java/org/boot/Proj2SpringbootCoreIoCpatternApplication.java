package org.boot;

import org.boot.service.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations ="org/boot/beanfile/AaliaseName.xml") // to import the xml into java class it is like<import/>
public class Proj2SpringbootCoreIoCpatternApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Proj2SpringbootCoreIoCpatternApplication.class, args);
	   Student st= ctx.getBean("student", Student.class);
	     System.out.println(st.training("jagadesh ravada"));
	   
	}

}
