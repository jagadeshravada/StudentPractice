package org.boot.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public final class PythonCourse implements ICourses {

	@Override
	public String courceContent() {
		System.out.println("PythonCourse.courceContent()");
		return "1)oop 2)varabiles 3)django f/w ";
	}

	@Override
	public Double coursefee() {
		System.out.println("PythonCourse.coursefee()");
		return 6200.0;
	}

	@Override
	public String duration() {
		System.out.println("PythonCourse.duration()");
		return "it takes nearly 4 months weekly 5 days evening 7:30pm";
	}

}
