package com.springboot_crud.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_crud.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

