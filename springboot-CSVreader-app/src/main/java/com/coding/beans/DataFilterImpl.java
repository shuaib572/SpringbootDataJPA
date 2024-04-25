package com.coding.beans;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.coding.model.Product;

@Service
public class DataFilterImpl implements iDataFilter{

	public DataFilterImpl()
	{
		//System.out.println("DatFilterimpl constructror");
	}
	@Override
	public List<Product> filterProduct(List<Product> pList) {
		System.out.println("Data Filter Ipml Method");
		return pList.stream().filter(p ->p.getpPrice() <1500)
				.collect(Collectors.toList());
	}

}
