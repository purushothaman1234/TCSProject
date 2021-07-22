package com.FlightDemo.demo.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Orders implements Serializable {

	@Id
	@Column
	private int orderid;
	@Column
	private int flightid;
	@Column
	private int cartid;
	@Column
	private int travellerid;
	@Column
	private String Airwaysname;
	@Column
	private String travellername;
	@Column
	private int numberoftravellers;
	@Column
	private String source;
	@Column
	private String destination;
	
	public Orders() {}
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
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
	public String getAirwaysname() {
		return Airwaysname;
	}

	public void setAirwaysname(String airwaysname) {
		Airwaysname = airwaysname;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
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
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
}
