package com.example.webdemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {

  @Id
  @Column(name = "username")
  private String username;
  @Column(name = "password")
  private String password;
  @Column(name = "email")
  private String email;
  @Column(name = "dob")
  private String dob;
  @Column(name = "address")
  private String address;
  @Column(name = "role")
  private short role;

  public Account(String username, String password, String email, String dob, String address,
      short role) {
    this.username = username;
    this.password = password;
    this.email = email;
    this.dob = dob;
    this.address = address;
    this.role = role;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public short getRole() {
    return role;
  }

  public void setRole(short role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return "Account{" +
        "username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", email='" + email + '\'' +
        ", dob='" + dob + '\'' +
        ", address='" + address + '\'' +
        ", role=" + role +
        '}';
  }

}
