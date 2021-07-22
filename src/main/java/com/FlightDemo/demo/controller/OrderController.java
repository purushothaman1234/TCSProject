package com.FlightDemo.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FlightDemo.demo.entity.Orders;
import com.FlightDemo.demo.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/saveOrderDetails")
	private int saveOrder(@RequestBody Orders Orders)
	{
		orderService.save(Orders);
		return Orders.getOrderid();
	}
	@GetMapping(path="/OrderDetails")
	public  List<Orders> saveOrder1()
	{
		return orderService.getOrderList();

	}
}
