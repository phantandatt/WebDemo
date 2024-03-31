package com.example.webdemo.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(value = "")
public class Discount {

  private String code;
  private double value;

  public Discount(String code, double value) {
    this.code = code;
    this.value = value;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Discount{" +
        "code='" + code + '\'' +
        ", value=" + value +
        '}';
  }
}
