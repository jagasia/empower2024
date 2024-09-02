package com.empower.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfig.class);
//    	ctx.scan("com");
//    	ctx.refresh();
    	Car car = ctx.getBean(Car.class);
    	car.playMusic();
        System.out.println( "Hello World!" );
    }
}
