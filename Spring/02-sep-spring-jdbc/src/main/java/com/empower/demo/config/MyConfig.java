package com.empower.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com")
public class MyConfig {

	
	
	@Bean
	public JdbcTemplate jt()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
    	ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
    	ds.setUsername("hr");
    	ds.setPassword("hr");

		JdbcTemplate jt=new JdbcTemplate();
		jt.setDataSource(ds);
		return jt;
		
	}
}
