package com.empower.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empower.demo.entity.Employee;
import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	List<Employee> findByName(String name);
	
	@Query(value="select e from Employee e where e.name LIKE CONCAT(:name,'%')", nativeQuery = false)
	List<Employee> findEmployeesNameStartWith(@Param("name") String prefix);
	
	@Query(value = "select * from jag_employee where 1=1", nativeQuery = true)
	public void dummy();
}
