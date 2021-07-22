package com.FlightDemo.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Travellers {
	@Id
	private int travellerid;
	private int flightid;
	private String travellername;
	private int numberoftravellers;
	
	
	public int getFlightid() {
		return flightid;
	}
	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}
	public int getTravellerid() {
		return travellerid;
	}
	public void setTravellerid(int travellerid) {
		this.travellerid = travellerid;
	}
	public String getTravellername() {
		return travellername;
	}
	public void setTravellername(String travellername) {
		this.travellername = travellername;
	}
	public int getNumberoftravellers() {
		return numberoftravellers;
	}
	public void setNumberoftravellers(int numberoftravellers) {
		this.numberoftravellers = numberoftravellers;
	}
	
}
