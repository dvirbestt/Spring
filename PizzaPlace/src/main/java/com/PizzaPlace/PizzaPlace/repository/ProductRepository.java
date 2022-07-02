package com.PizzaPlace.PizzaPlace.repository;

import com.PizzaPlace.PizzaPlace.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
