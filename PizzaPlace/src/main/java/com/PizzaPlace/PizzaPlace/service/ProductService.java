package com.PizzaPlace.PizzaPlace.service;


import com.PizzaPlace.PizzaPlace.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

    public Product saveProduct(Product product);
    public List<Product> getProducts();
}
