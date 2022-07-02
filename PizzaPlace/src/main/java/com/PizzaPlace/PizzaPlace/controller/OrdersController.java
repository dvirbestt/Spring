package com.PizzaPlace.PizzaPlace.controller;


import com.PizzaPlace.PizzaPlace.model.Orders;
import com.PizzaPlace.PizzaPlace.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @PostMapping("/order")
    public String saveOrder(@RequestBody Orders order){
        ordersService.saveOrder(order);
        return "Your order has been accepted";
    }

    @GetMapping("/getOrders")
    public List<Orders> getOrders(){
        return ordersService.getAllOrders();
    }

    @PutMapping("/update")
    public String update(@RequestBody Orders orders){
        ordersService.saveOrder(orders);
        return "updated";
    }

}
