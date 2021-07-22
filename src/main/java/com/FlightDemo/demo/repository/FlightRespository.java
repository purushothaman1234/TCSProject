package com.FlightDemo.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.FlightDemo.demo.entity.Flights;

public interface FlightRespository extends CrudRepository<Flights,Integer>
{
}