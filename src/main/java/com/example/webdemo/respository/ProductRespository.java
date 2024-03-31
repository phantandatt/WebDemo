package com.example.webdemo.respository;

import com.example.webdemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product,Long> {

}
