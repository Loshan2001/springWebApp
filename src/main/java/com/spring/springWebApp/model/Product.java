package com.spring.springWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int proId;
    private String proName;
    private int price;

}
