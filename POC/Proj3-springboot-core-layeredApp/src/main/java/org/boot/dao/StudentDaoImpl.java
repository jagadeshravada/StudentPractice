package org.boot.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.boot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements IStudentDao {
	
	private static final String sql_query="SELECT student_id,address,fee,name,standard FROM springboot.student_info";
	
	@Autowired
	private DataSource ds;

	@Override
	public List<Student> getAllStudents() throws SQLException {
		  //getconnection
		    Connection con=  ds.getConnection();
		     Statement stm=con.createStatement(); 
		                 
		     ResultSet rs= stm.executeQuery(sql_query);
		     Student st=new Student();
		     List<Student> lisst=new ArrayList<Student>();
		     while(rs.next()) {
		    	 st.setStudent_id(rs.getInt(1));
		    	 st.setName(rs.getString(4));
		    	 st.setAddress(rs.getString(2));
		    	 st.setFee(rs.getDouble(3));
		    	 st.setStandard(rs.getString(5));
		    	 lisst.add(st);
		    	 
		     }
		return lisst;
	}
	

}
