package com.bootup.asg1.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bootup.asg1.entity.Flight;

public interface FlightDao extends JpaRepository<Flight, Integer>{

	@Query(value =" from Flight f where f.flightNumber like :flightNumber and f.flightDate = :flightDate" )
	List<Flight> findAllByFlightNumberAndFlightDate(String flightNumber,LocalDate flightDate);
	
	List<Flight> findAllByOriginAndFlightDate(String Origin, LocalDate flightDate);
	
	List<Flight> findByOriginAndDestinationAndFlightDate(String origin, String destination, LocalDate flightDate);
	
	
}
