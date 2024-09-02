package com.empower.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
//    	Mathematics maths= (Mathematics) ctx.getBean("maths");
//    	maths.add();
//    	System.out.println(maths.getResult());
//        System.out.println( "Hello World!" );
    	
    	
//    	Car car=(Car) ctx.getBean("car");
//    	Car car=ctx.getBean(Car.class);
//    	car.playMusic();
    	
//    	ctx.getBean("b1");
    	Book book = ctx.getBean(Book.class);
    	System.out.println(book);
    	
    }
}
