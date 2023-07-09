package com.EcommerceApi.EcommerceApi.Controller;

import com.EcommerceApi.EcommerceApi.Model.Category;
import com.EcommerceApi.EcommerceApi.Model.Product;
import com.EcommerceApi.EcommerceApi.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("product")
    public String addProduct(@RequestBody Product product){
       return productService.addProduct(product);
    }
    @GetMapping("product/{category}")
    public List<Product> getProduct(@PathVariable Category category){
        return productService.getAllProductBasedOnCategory(category.toString());
    }

    @DeleteMapping("product/{id}")
    public String deleteProductBasedOnId(@PathVariable Long id){
        return productService.deleteProductBasedOnId(id);
    }
}
