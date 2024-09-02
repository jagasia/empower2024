package com.empower.demo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.empower.demo.config.MyConfig;
import com.empower.demo.dao.ProductDao;
import com.empower.demo.entity.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfig.class);
    		ProductDao pdao=(ProductDao) ctx.getBean("pdao");
			/*
			 * Product product=new Product(11, "Sharpner", "used to sharp the pencils",
			 * 25.0); int no=pdao.create(product);
			 * System.out.println(no+" row(s) inserted");
			 */
    		
			/*
			 * List<Product> products = pdao.read(); for(Product p : products)
			 * System.out.println(p);
			 */
    		
//    		System.out.println(pdao.read(2));
    		
    }
}
