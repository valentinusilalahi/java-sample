package com.silalahi.valentinus.java.services;

import com.silalahi.valentinus.java.model.Product;

import java.util.List;

public interface ProductService {

    public Product create(Product smartphone);

    public Product get(int id);

    public Product update(Product product);

    public Product delete(int id);

    public List<Product> getAll();

}
