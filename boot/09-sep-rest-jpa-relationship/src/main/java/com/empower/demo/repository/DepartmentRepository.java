package com.empower.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empower.demo.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>
{

}
