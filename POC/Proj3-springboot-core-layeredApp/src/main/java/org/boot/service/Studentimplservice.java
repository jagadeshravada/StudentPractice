package org.boot.service;

import java.sql.SQLException;
import java.util.List;

import org.boot.dao.IStudentDao;
import org.boot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Studentimplservice implements IstudentService {

	  @Autowired
	private IStudentDao dao;
	
	@Override
	public List<Student> getStudents() throws SQLException {
		       
		return dao.getAllStudents();
	}

}
