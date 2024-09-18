package com.empower.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empower.demo.entity.Product;
import com.empower.demo.service.ProductService;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = {"*"})
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@PostMapping
//	public void create(String name, String category, String picture, String dt) {}
	public Product create(@RequestBody Product product) {
		return ps.create(product);
	}
	
	@GetMapping
	public List<Product> read() {
		return ps.read();
	}
	
	@GetMapping("/{id}")
	public Product read(@PathVariable("id")Integer id) {
		return ps.read(id);
	}
	
//	@PutMapping
//	public void update() {
//		
//	}
	
	@DeleteMapping("/{id}")
	public Product delete(@PathVariable("id")Integer id) {
		return ps.delete(id);
	}
	
	
}
