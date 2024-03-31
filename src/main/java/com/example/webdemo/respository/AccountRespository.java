package com.example.webdemo.respository;

import com.example.webdemo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRespository extends JpaRepository<Account,Long> {

}
