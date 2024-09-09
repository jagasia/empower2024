package com.empower.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empower.demo.entity.Employee;
import com.empower.demo.exception.NotFoundException;
import com.empower.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository er;
	
	public Employee create(Employee employee) {
		return er.save(employee);
	}
	public List<Employee> read() {
		return er.findAll();
	}
	public Employee read(Integer id) {
		return er.findById(id).orElse(null);
	}
	public Employee update(Employee employee) {
		if(read(employee.getId())!=null)
		{
			return er.save(employee);
		}else
		{
			return null;
		}
	}
	public Employee delete(Integer id) {
		Employee emp=null;
		if(read(id)!=null)
		{
			emp=read(id);
			er.delete(emp);
		}
		return emp;
	}

}
