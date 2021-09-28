package org.boot.dao;

import java.sql.SQLException;
import java.util.List;

import org.boot.model.Student;

public interface IStudentDao {
	public List<Student> getAllStudents() throws SQLException;

}
