package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Model.Employee;
import com.nt.respo.StudentRespository;
@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	private StudentRespository res;
	@Override
	public void run(String... args) throws Exception {
	res.save(new Employee(101,"mohd",3445.78));
	res.save(new Employee(102,"shuaib",7445.78));
	res.save(new Employee(103,"javed",5445.78));
		
	}

}
