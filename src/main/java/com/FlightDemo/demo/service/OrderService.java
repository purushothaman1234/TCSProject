package com.FlightDemo.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlightDemo.demo.entity.Flights;
import com.FlightDemo.demo.entity.Orders;
import com.FlightDemo.demo.repository.OrderRepo;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderrepo;
    
	public void save(Orders orders) {
		
		orderrepo.save(orders);
	}
	
	public  List<Orders> getOrderList() {
		List<Orders> order = new ArrayList<Orders>();
		orderrepo.findAll().forEach(order1 -> order.add(order1));
		return order;
	}

}