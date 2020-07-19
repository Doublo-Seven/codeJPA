package com.bootup.asg1.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String destination;
	private String duration;
	private LocalDate flightDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name  = "flightNumber")
	private FlightInfo flightNumber;
	
	private String origin;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fareId")
	private Fare fareId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "flightInfoid")
	private FlightInfo fightInfoid;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "invId")
	private Inventory invId;
	
	public Flight() {
		super();
	}

	public Flight(String destination, String duration, LocalDate flightDate, FlightInfo flightNumber, String origin,
			Fare fareId, FlightInfo fightInfoid, Inventory invId) {
		super();
		this.destination = destination;
		this.duration = duration;
		this.flightDate = flightDate;
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.fareId = fareId;
		this.fightInfoid = fightInfoid;
		this.invId = invId;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public LocalDate getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}

	public FlightInfo getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(FlightInfo flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Fare getFareId() {
		return fareId;
	}

	public void setFareId(Fare fareId) {
		this.fareId = fareId;
	}

	public FlightInfo getFightInfoid() {
		return fightInfoid;
	}

	public void setFightInfoid(FlightInfo fightInfoid) {
		this.fightInfoid = fightInfoid;
	}

	public Inventory getInvId() {
		return invId;
	}

	public void setInvId(Inventory invId) {
		this.invId = invId;
	}
	
	
}