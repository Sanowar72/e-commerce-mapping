package com.EcommerceApi.EcommerceApi.Service;

import com.EcommerceApi.EcommerceApi.Model.Product;
import com.EcommerceApi.EcommerceApi.Repository.IProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;
    public String addProduct(Product product) {
       productRepo.save(product);
       return "Product is Added";
    }
    @Transactional
    public List<Product> getAllProductBasedOnCategory(String category) {
       return productRepo.getAllProduct(category);
    }

    public String deleteProductBasedOnId(Long id) {
        productRepo.deleteById(id);
        return "Product deleted";
    }
}
