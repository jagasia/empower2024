package com.empower.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empower.demo.entity.Department;
import com.empower.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository er;
	
	public Department create(Department department) {
		return er.save(department);
	}
	public List<Department> read() {
		return er.findAll();
	}
	public Department read(Integer id) {
		return er.findById(id).orElse(null);
	}
	public Department update(Department department) {
		if(read(department.getId())!=null)
		{
			return er.save(department);
		}else
		{
			return null;
		}
	}
	public Department delete(Integer id) {
		Department emp=null;
		if(read(id)!=null)
		{
			emp=read(id);
			er.delete(emp);
		}
		return emp;
	}

}
