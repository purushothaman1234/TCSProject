
package com.FlightDemo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FlightDemo.demo.entity.Cart;
import com.FlightDemo.demo.service.CartService;

@RestController
public class CartController {
	
	@Autowired
	CartService cartservice;
	
	@PostMapping("/saveflights")
	private int saveFlight(@RequestBody Cart cart) 
	{
		cartservice.save(cart);
		return  cart.getCartid();
	}
}