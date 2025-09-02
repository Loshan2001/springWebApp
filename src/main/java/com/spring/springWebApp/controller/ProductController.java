package com.spring.springWebApp.controller;

import com.spring.springWebApp.model.Product;
import com.spring.springWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProduct(){
        return productService.getProducts();
    }
}
