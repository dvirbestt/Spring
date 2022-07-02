package com.PizzaPlace.PizzaPlace.service;

import com.PizzaPlace.PizzaPlace.model.Orders;
import com.PizzaPlace.PizzaPlace.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    @Autowired
    private OrderRepository orderRepository;

    public Orders saveOrder(Orders orders){
        return orderRepository.save(orders);
    }




    public List<Orders> getAllOrders(){
        return orderRepository.findAll();
    }
}
