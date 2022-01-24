package com.example.demo;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository <User,Integer> {

}
