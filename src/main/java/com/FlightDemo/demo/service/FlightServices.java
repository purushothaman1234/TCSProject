package com.FlightDemo.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Service;

import com.FlightDemo.demo.entity.Flights;
import com.FlightDemo.demo.repository.FlightRespository;


@Service
public class FlightServices {

	@Autowired
	FlightRespository flightrepository;
	//getting all books record by using the method findaAll() of CrudRepository
	public List<Flights> getAllFlights() 
	{
	List<Flights> flights = new ArrayList<Flights>();
	flightrepository.findAll().forEach(flights1 -> flights.add(flights1));
	return flights;
	}
	
	public void saveOrUpdate(Flights flights) {
		// TODO Auto-generated method stub
	flightrepository.save(flights);
	}
	
	public  Optional<Flights> getFlightById(Integer flightId) {
		return flightrepository.findById(flightId);
	}
}
