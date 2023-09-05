package com.nt.runner;

import java.io.FileInputStream;
import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Student;
import com.nt.repo.StudentRepo;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private StudentRepo repo;
	@Override
	public void run(String... args) throws Exception {
		Date d=new Date();
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Downloads\\Snapchat-1879375494.jpg");
		byte [] arr=new byte[fis.available()];
		fis.read(arr);
		String s="AKFSDJKGNVDFJCNGDFHGKJDFFFFSGDHGDJKSFGHDFJGHDFJKGHDFJKGHJKDFHJHJHDJFHUERTYUIRTIEROUIOTUIRTU";
		char[] ch=s.toCharArray();
		
		repo.save(new Student(151,"javed",arr,ch,d,d,d));
		
		//repo.save(new Student(150,"shuaib",arr,ch,d,d,d));
		System.out.println("Insection Done");
	}

}
