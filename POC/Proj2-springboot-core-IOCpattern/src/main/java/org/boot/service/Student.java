package org.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
	@Qualifier("name") //if u specify both qualifier,primary at time on differnt bean then qualifer wil get first chance
	private ICourses course;
	
	public String training(String name) {
		
		System.out.println(course.courceContent());
		System.out.println("Student.training()==started");
        System.out.println(course.coursefee());
        System.out.println(course.duration());
        return "i'm intersted to join the course::"+name;
	
	}

}
