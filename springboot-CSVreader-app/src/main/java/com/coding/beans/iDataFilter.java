package com.coding.beans;

import java.util.List;

import com.coding.model.Product;

public interface iDataFilter {

	public List<Product> filterProduct(List<Product> pList);
	
}
