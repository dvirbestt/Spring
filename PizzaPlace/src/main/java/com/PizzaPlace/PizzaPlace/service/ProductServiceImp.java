package com.PizzaPlace.PizzaPlace.service;

import com.PizzaPlace.PizzaPlace.model.Product;
import com.PizzaPlace.PizzaPlace.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
       return productRepository.save(product);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
