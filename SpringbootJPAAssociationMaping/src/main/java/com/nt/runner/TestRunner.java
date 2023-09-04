package com.nt.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.moder.Contract;
import com.nt.moder.Vendor;
import com.nt.repo.ContractRepository;
import com.nt.repo.VendorRepository;


@Component
public class TestRunner implements CommandLineRunner {
	
	@Autowired
	private ContractRepository contractRepository;
	
	@Autowired
	private VendorRepository vendorRepository;
	
	@Override
	public void run(String... args) throws Exception {
		 Contract contract1 = new Contract(101, "AMC", 35000L); // Use uppercase 'L' for long literals
	        contractRepository.save(contract1);
	        
	        Contract contract2 = new Contract(102, "Service", 5500L);
	        contractRepository.save(contract2);
	        
	        Vendor vendor = new Vendor();
	        vendor.setVid(55);
	        vendor.setVname("NIT");
	      

	        Vendor retrievedVendor = vendorRepository.findById(vendor.getVid()).orElse(null);//vendorRepository.findById(vendor.getVid()).orElse(null);
	        if (retrievedVendor != null) {
	            System.out.println("Vendor Name: " + retrievedVendor.getVname());
	            System.out.println("Vendor ID: " + retrievedVendor.getVid());
	            System.out.println("Contracts:");
	            for (Contract contract : retrievedVendor.getCob()) {
	                System.out.println(contract.getCname());
	            }
	        } else {
	            System.out.println("Vendor with ID " + vendor.getVid() + " not found.");

	}
	}
}
