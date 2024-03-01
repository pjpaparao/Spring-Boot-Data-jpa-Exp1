package com.pj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDataExp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataExp1Application.class, args);
		
		DataService service = context.getBean(DataService.class);
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("pjpaparao");
		emp.setSal(1000.00);
		Employee emp1 = service.save(emp);
		System.out.println(emp1);
	}

}
