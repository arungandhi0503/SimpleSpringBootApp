package com.agcode.agcart.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/products")
public class ProductController {
	@GetMapping
	public List<Map<String, Object>> getAllProducts() {
		return Arrays.asList(
				Map.of("name", "Product 1", "price", 2323),
				Map.of("name", "Product 2", "price", 2323)
				);
	}
	
	@GetMapping("/category")
	public List<Map<String, Object>> getProductsCategory() {
		return Arrays.asList(
				Map.of("name", "Product 1", "price", 2323),
				Map.of("name", "Product 2", "price", 2323)
				);
	}
}
