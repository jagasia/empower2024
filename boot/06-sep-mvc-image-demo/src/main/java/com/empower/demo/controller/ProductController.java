package com.empower.demo.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.empower.demo.model.Product;
import com.empower.demo.model.ProductService;

import jakarta.servlet.annotation.MultipartConfig;

@Controller
@RequestMapping("/product")
@MultipartConfig
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@GetMapping
	public ModelAndView showProductPage()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("product");
		List<Product> products = ps.read();
		mv.addObject("products",products);
		return mv;
	}
	
	@PostMapping(value = "/dml", params = "add")
	public ModelAndView addProduct(@RequestParam("name") String name, @RequestParam("description") String description,@RequestParam("price") Double price, @RequestParam("expiryDate") String ed, @RequestParam("picture") MultipartFile file) throws ParseException, IOException
	{
		System.out.println(name);
		System.out.println(description);
		System.out.println(price);
		System.out.println(ed);
		System.out.println(file.getName());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date expiryDate=sdf.parse(ed);
		byte[] picture = file.getBytes();
		Product product=new Product(null, name, description, price, expiryDate, picture);
		ps.create(product);
		return showProductPage();
	}
	
	@PostMapping(value = "/dml", params = "update")
	public ModelAndView updateProduct(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("description") String description,@RequestParam("price") Double price, @RequestParam("expiryDate") String ed, @RequestParam("picture") MultipartFile file) throws ParseException, IOException
	{
		System.out.println(name);
		System.out.println(description);
		System.out.println(price);
		System.out.println(ed);
		System.out.println(file.getName());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date expiryDate=sdf.parse(ed);
		byte[] picture = file.getBytes();
		Product product=new Product(id, name, description, price, expiryDate, picture);
		ps.update(product);
		return showProductPage();
	}

	@PostMapping(value = "/dml", params = "delete")
	public ModelAndView deleteProduct(Integer id)
	{
		ps.delete(id);
		return showProductPage();
	}
	
}
