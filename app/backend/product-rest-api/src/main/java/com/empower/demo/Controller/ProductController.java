package com.empower.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empower.demo.entity.Product;
import com.empower.demo.service.ProductService;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = {"http://localhost:3000","*"})
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return ps.create(product);
	}
	
	@GetMapping
	public List<Product> retrieveAllProduct() {
		return ps.read();
	}
	
	@GetMapping("/{id}")
	public Product findProductById(@PathVariable("id")Integer id) {
		return ps.read(id);
	}
	
	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		return ps.update(product);
	}

	@DeleteMapping("/{id}")
	public Product deleteProduct(@PathVariable("id")Integer id) {
		return ps.delete(id);
	}
	
}
