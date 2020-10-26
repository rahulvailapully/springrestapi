package com.rahul.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.models.Product;
import com.rahul.services.ProductService;

@RestController
public class ProductRestController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getProductsList(){
		
		return productService.getAllProducts();
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") String productId) {
		
		Product product = productService.getProductById(productId);
		if(product == null) {
			return new ResponseEntity<Product> (HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Product> (product,HttpStatus.OK);
				
	}

}
