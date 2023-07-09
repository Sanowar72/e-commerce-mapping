package com.EcommerceApi.EcommerceApi.Repository;

import com.EcommerceApi.EcommerceApi.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProductRepo extends JpaRepository<Product,Long> {
   @Modifying
   @Query(value = "select * from product where product.category =:category",nativeQuery = true)
    List<Product> getAllProduct(String category);
}
