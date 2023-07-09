package com.EcommerceApi.EcommerceApi.Repository;

import com.EcommerceApi.EcommerceApi.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order,Long> {
}
