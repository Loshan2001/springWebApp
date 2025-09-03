package com.spring.springWebApp.controller;

import com.spring.springWebApp.model.Product;
import com.spring.springWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProduct(){
        return productService.getProducts();
    }

    @GetMapping("/products/{proId}")
    public Product getProductById(@PathVariable int proId){
        return productService.getProductById(proId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody  Product product){
        productService.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable("id") int proId){
         productService.deleteProduct(proId);
    }
}
