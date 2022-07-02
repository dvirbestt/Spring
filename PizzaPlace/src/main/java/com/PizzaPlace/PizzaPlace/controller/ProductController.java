package com.PizzaPlace.PizzaPlace.controller;

import com.PizzaPlace.PizzaPlace.model.Product;
import com.PizzaPlace.PizzaPlace.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public String addProduct(@RequestBody Product product){
        productService.saveProduct(product);
        return "added";
    }

    @GetMapping("/get")
    public List<Product> getMenu(){
        return productService.getProducts();
    }

}
