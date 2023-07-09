package com.EcommerceApi.EcommerceApi.Controller;

import com.EcommerceApi.EcommerceApi.Model.Order;
import com.EcommerceApi.EcommerceApi.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public String makeOrder(@RequestBody Order order){
        return orderService.makeOrder(order);
    }
    @GetMapping("order/{id}")
    public Optional<Order> getOrderById(@PathVariable Long id){
        return orderService.getOrderById(id);
    }
}
