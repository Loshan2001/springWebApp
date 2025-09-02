package com.spring.springWebApp.service;

import com.spring.springWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101,"iphone",230000),
            new Product(101,"cannon",700000));
    public List<Product> getProducts(){
        return products;
    }
}
