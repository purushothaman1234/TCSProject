package com.FlightDemo.demo.controller;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FlightDemo.demo.entity.Travellers;
import com.FlightDemo.demo.repository.TravellerRepo;

@RestController
public class TravellersController {
	
	@Autowired
	TravellerRepo traveler_repo;
	
	@PostMapping("/addTraveller")
	private String saveTraveller(@RequestBody Travellers travellers) {
//		System.out.print("Travellers"+travellers.getTravellerid());
		traveler_repo.save(travellers);
		return "added";
	}
}
