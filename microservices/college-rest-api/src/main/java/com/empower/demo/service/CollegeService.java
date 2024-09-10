package com.empower.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empower.demo.entity.College;
import com.empower.demo.repository.CollegeRepository;

@Service
public class CollegeService {
	@Autowired
	private CollegeRepository cr;
	
	public College create(College college) {
		return cr.save(college);
	}
	public List<College> read() {
		return cr.findAll();
	}
	public College read(Integer id) {
		return cr.findById(id).orElse(null);
	}
	public College update(College college) {
		College temp=read(college.getId());
		if(temp!=null)
		{
			temp=college;
			cr.save(temp);
		}
		return temp;
	}
	public College delete(Integer id) {
		College temp=read(id);
		if(temp!=null)
		{
			cr.delete(temp);
		}
		return temp;
	}
	
}
