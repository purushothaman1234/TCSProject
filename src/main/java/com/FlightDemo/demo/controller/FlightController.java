package com.FlightDemo.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.FlightDemo.demo.entity.Flights;
import com.FlightDemo.demo.service.FlightServices;

@RestController
public class FlightController {

	@RequestMapping("/")
	@ResponseBody
	public String helloHandler() {
		return "<h1>Hello World!</h1>";

	}

	@Autowired
	FlightServices flightservices;

	@PostMapping("/flights")
	private Optional<Flights> saveFlight(@RequestBody Flights flights) {
		flightservices.saveOrUpdate(flights);
		int id = flights.getFlightid();
		return flightservices.getFlightById(id);
	}

	// creating a get mapping that retrieves all the books detail from the database
	@GetMapping("/flightList")
	private List<Flights> getAllFlights() {
		return flightservices.getAllFlights();
	}
}
