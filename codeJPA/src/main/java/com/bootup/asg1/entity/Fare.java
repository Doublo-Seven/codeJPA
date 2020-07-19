package com.bootup.asg1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fare {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fareId;
	private String currency;
	private int fare;
	
	public Fare() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Fare(String currency, int fare) {
		super();
		this.currency = currency;
		this.fare = fare;
	}

	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}

}