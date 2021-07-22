package com.FlightDemo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FlightDemo.demo.entity.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer> {

}