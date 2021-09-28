package org.boot.service;

import org.springframework.stereotype.Component;

@Component
public final class JavaCourse implements ICourses {

	@Override
	public String courceContent() {
		System.out.println("JavaCourse.courceContent()");
		return "1)oop,2)java8 3)springboot f/w";
	}

	@Override
	public Double coursefee() {
		System.out.println("JavaCourse.coursefee()");
		return 65000.0;
	}

	@Override
	public String duration() {
		System.out.println("JavaCourse.duration()");
		return "it will take nearly 5months weekly 5 days class morinig 7:30am";
	}

}
