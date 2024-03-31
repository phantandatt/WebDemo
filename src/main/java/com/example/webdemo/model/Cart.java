package com.example.webdemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cart")
public class Cart {

  private String username;
  @Id
  private int productID;
  @Column(name = "productName")
  private String productName;
  private int amount;
  private double price;
  private String imgPath;

  public Cart(String username, int productID, String productName, int amount, double price,
      String imgPath) {
    super();
    this.username = username;
    this.productID = productID;
    this.productName = productName;
    this.amount = amount;
    this.price = price;
    this.imgPath = imgPath;
  }

  public String getUsername() {
    return username;
  }

  public int getProductID() {
    return productID;
  }

  public String getProductName() {
    return productName;
  }

  public int getAmount() {
    return amount;
  }

  public double getPrice() {
    return price;
  }

  public String getImgPath() {
    return imgPath;
  }

  @Override
  public String toString() {
    return "Cart [username=" + username + ", productID=" + productID + ", productName="
        + productName + ", amount="
        + amount + ", price=" + price + ", imgPath=" + imgPath + "]";
  }
}

