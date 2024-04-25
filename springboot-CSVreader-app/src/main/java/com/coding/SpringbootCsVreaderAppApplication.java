package com.coding;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.coding.beans.CSVReader;
import com.coding.model.Product;

@SpringBootApplication
public class SpringbootCsVreaderAppApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ctxt = SpringApplication.run(SpringbootCsVreaderAppApplication.class, args);
		//System.out.println("Program started");
		CSVReader csvReader = ctxt.getBean(CSVReader.class);
		//System.out.println("Main class");
		List<Product> filterProduct=csvReader.redAndFilerterData();
		
		filterProduct.forEach(System.out::println);
		
		//System.out.println("app end");
		}
	

}
