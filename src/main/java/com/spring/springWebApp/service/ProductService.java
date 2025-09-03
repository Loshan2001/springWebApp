package com.spring.springWebApp.service;

import com.spring.springWebApp.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"iphone",230000),
            new Product(102,"cannon",700000)));
    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int proId){
        return  products.stream()
                .filter(p -> p.getProId() == proId)
                .findFirst().get();

    }


    public void addProduct(Product product) {
        products.add(product);
    }


    public void updateProduct(Product product) {
        int index = 0;
        for(int i=0; i<products.size(); i++){
            if(products.get(i).getProId() == product.getProId()){
                index = i;

            }
        }
        products.set(index,product);
    }

    public void deleteProduct(int proId) {
        int index = 0;
        for(int i=0; i<products.size(); i++){
            if(products.get(i).getProId() == proId){
                index = i;
                products.remove(index);
            }
        }

    }
}
