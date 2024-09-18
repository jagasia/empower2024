package com.empower.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empower.demo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{

}
