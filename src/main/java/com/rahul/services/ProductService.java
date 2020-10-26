package com.rahul.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.rahul.models.Product;

@Service
public class ProductService {
	
	public List<Product> getAllProducts(){
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("121","Iphone6",566.0,"Flipkart","Awesome Phone"));
		products.add(new Product("122","Iphone7",666.0,"Flipkart","Awesome Phone"));
		products.add(new Product("123","Iphone8",766.0,"Flipkart","Awesome Phone"));
		products.add(new Product("124","Iphone9",866.0,"Flipkart","Awesome Phone"));
		
		return products;
	}
	
	public Product getProductById(String id) {
		
		
		Predicate<Product> byID = p -> p.getId().equals(id);
		return filterProductsByID(byID);
	}

	private Product filterProductsByID(Predicate<Product> stratergy) {
		
		return getAllProducts().stream().filter(stratergy).findFirst().orElse(null);
		
	}
	

}
