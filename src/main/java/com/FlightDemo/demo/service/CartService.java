package com.FlightDemo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlightDemo.demo.entity.Cart;
import com.FlightDemo.demo.repository.CartRepo;

@Service
public class CartService {
	@Autowired
	
	CartRepo cartrepo;
	public void save(Cart cart) {
	
		cartrepo.save(cart);
		
	}
}