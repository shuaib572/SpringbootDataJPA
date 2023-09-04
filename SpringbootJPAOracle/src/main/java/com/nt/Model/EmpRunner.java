package com.nt.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmpRunner implements CommandLineRunner {
	@Autowired
	private Empres resp;

	@Override
	public void run(String... args) throws Exception {
		
		//resp.save(new Employee(101,"shuaib","hyd"));
		
		//resp.deleteById(101);
		
		List<Employee> li=resp.findAll();
		System.out.println("Print Using Method Refrence");
		li.forEach(System.out::println);
	System.out.println("Print Lamba Expresion");
	li.forEach(v->System.out.println(v));
	
	System.out.println("Using foreach Loop");
	for(Employee e:li)
	{
		System.out.println(e);
	}
	}

}
