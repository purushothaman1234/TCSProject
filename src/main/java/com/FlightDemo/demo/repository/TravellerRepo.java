package com.FlightDemo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.FlightDemo.demo.entity.Travellers;

public interface TravellerRepo extends JpaRepository<Travellers, Integer> {

}
