package com.silalahi.valentinus.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silalahi.valentinus.java.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
