package com.example.webdemo.service;

import com.example.webdemo.model.Product;
import com.example.webdemo.respository.ProductRespository;

public class ProductService {

  private ProductRespository resp;

  public void save(Product product) {
    resp.save(product);
  }
}
