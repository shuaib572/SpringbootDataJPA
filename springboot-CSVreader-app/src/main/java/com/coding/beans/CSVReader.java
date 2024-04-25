package com.coding.beans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.model.Product;

@Service
public class CSVReader {
	
	public CSVReader()
	{
		System.out.println("CSV Reader Constructor");
	}
	
	private iDataFilter dataFilter;
	@Autowired
	 public CSVReader( iDataFilter dataFilter) {   // Constructor DI
		this.dataFilter= dataFilter;
		
	}
	
	public List<Product> redAndFilerterData() throws Exception  
	{
	//	System.out.println("Inside redAndFilerterData()");
		List<Product> plist=new ArrayList<Product>();
		
		FileReader fr=new FileReader(new File("input.txt"));
		BufferedReader br= new BufferedReader(fr);
		String lineData = br.readLine();
		
		//System.out.println("whileLoop start");
		while(lineData!=null)
		{
			
			   String[] split = lineData.split(",");
			   String pid = split[0];
			   String  name = split[1];
			   String price = split[2];
			   
			  // System.out.println(pid);
			   
			   Product p=new Product();
			   
			   p.setpId(Integer.parseInt(pid));
			   p.setpName(name);
			   p.setpPrice(Double.parseDouble(price));
			   
			   plist.add(p);
			   lineData = br.readLine();
			   
		}
		
		br.close();
		//List<Product> fs=dataFilter.filterProduct(plist);
		return dataFilter.filterProduct(plist);
	}

}
