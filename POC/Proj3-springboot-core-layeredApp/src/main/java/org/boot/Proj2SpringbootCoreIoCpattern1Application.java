package org.boot;

import java.sql.SQLException;
import java.util.Map;
import org.boot.service.IstudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,JdbcTemplate.class,NamedParameterJdbcTemplate.class})
public class Proj2SpringbootCoreIoCpattern1Application {

	public static void main(String[] args) {
	
	ApplicationContext ctx=	SpringApplication.run(Proj2SpringbootCoreIoCpattern1Application.class, args);
	//JdbcTemplateAutoConfiguration cls;
	IstudentService service=ctx.getBean("studentimplservice",IstudentService.class);
	 
	    try {
			service.getStudents().forEach(st->System.out.println(st));
	    }catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
