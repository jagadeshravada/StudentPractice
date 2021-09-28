package org.boot.service;

import java.sql.SQLException;
import java.util.List;

import org.boot.model.Student;

public interface IstudentService {
	public List<Student> getStudents() throws SQLException;

}
