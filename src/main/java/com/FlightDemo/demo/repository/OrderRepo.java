package com.FlightDemo.demo.repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.FlightDemo.demo.entity.Flights;
import com.FlightDemo.demo.entity.Orders;


public interface OrderRepo extends  CrudRepository<Orders,Integer>{

	
}
