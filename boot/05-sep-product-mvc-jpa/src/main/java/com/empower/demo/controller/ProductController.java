package com.empower.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.empower.demo.model.Product;
import com.empower.demo.model.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService ps;

	@GetMapping
//	@ResponseBody
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("product");
		List<Product> products = ps.read();
		mv.addObject("products",products);
		return mv;
	}
	
	@PostMapping(value="/dml", params = "add")
	public ModelAndView add(Product product)
	{		
		System.out.println(product);
		ps.create(product);
		return home();
	}
	
	@PostMapping(value="/dml", params = "update")
	public ModelAndView update(Product product)
	{		
		System.out.println(product);
		ps.update(product);
		return home();
	}
	
	@PostMapping(value="/dml", params = "delete")
	public ModelAndView delete(Product product)
	{		
		System.out.println(product.getId()+" will be deleted now");
		ps.delete(product.getId());
		return home();
	}
}
