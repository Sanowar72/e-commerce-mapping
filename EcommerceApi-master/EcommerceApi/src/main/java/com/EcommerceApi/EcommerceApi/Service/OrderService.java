package com.EcommerceApi.EcommerceApi.Service;

import com.EcommerceApi.EcommerceApi.Model.Order;
import com.EcommerceApi.EcommerceApi.Repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;
    public String makeOrder(Order order) {
       if(order.getUser()==null || order.getProductList().size()==0 || order.getAddress()==null){
           orderRepo.save(order);
           return "Order is Created and order is not placed yet";
       }
       orderRepo.save(order);
       return "Order Placed successFully";
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepo.findById(id);
    }
}
